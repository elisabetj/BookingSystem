package hbv201g.bookingsystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    Data data = new Data();
    private ObservableList<Tour> tours = FXCollections.observableArrayList();
    private ObservableList<Hotel> hotels = FXCollections.observableArrayList();
    @FXML
    private ListView<Hotel> hotelListView = new ListView<>(hotels);
    @FXML
    private ListView<Tour> tourListView = new ListView<>(tours);
    @FXML
    private TextField customerTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private Button button;
    @FXML
    private Button buttonTour;
    @FXML
    private Label bookingConfirmed;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tours = data.getTour();
        tourListView.setItems(tours);

        hotels = data.getHotel();
        hotelListView.setItems(hotels);
    }

    public void listViewHotelClicked(MouseEvent mouseEvent) {
        Hotel selectedHotel = hotelListView.getSelectionModel().getSelectedItem();
    }

    public void listViewTourClicked(MouseEvent mouseEvent) {
        Tour selectedTour = tourListView.getSelectionModel().getSelectedItem();
    }

    public void buttonHotelOnActivity(ActionEvent event) {

        String name = customerTextField.getText();
        String email = emailTextField.getText();

        Customer customer = new Customer(name, email);
        Hotel hotel = hotelListView.getSelectionModel().getSelectedItem();

        Booking booking = new Trip();
        booking.bookHotel(hotel, customer);

        bookingConfirmed.setText(hotel + " confirmed. Booked by " + customer.getName() + ". Email: " + customer.getEmail());

    }

    public void buttonTourOnActivity(ActionEvent event) {

        String name = customerTextField.getText();
        String email = emailTextField.getText();

        Customer customer = new Customer(name, email);
        Tour tour = tourListView.getSelectionModel().getSelectedItem();

        Booking booking = new Trip();
        booking.bookTour(tour, customer);

        bookingConfirmed.setText(tour + " confirmed. Booked by " + customer.getName() + ". Email: " + customer.getEmail());

    }

}