package hbv201g.bookingsystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    private ObservableList<Tour> tours = FXCollections.observableArrayList();
    private ObservableList<Hotel> hotels = FXCollections.observableArrayList();

    @FXML
    private ListView<Hotel> hotelListView = new ListView<Hotel>(hotels);
    @FXML
    private ListView<Tour> tourListView = new ListView<Tour>(tours);
    @FXML
    private TextField customerTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private Button button;

    Data data = new Data();

    public void buttonOnActivity(ActionEvent event){

        String name = customerTextField.getText();
        String email = emailTextField.getText();

        Customer customer = new Customer(name, email);


        System.out.println(customer.getName());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tours = data.getTour();
        tourListView.setItems(tours);

        hotels = data.getHotel();
        hotelListView.setItems(hotels);
    }

    public void listViewHotelClicked(MouseEvent mouseEvent){
        Hotel selectedItem = (Hotel) hotelListView.getSelectionModel().getSelectedItem();

        System.out.println(hotelListView.getSelectionModel().getSelectedItem());
    }

    public void listViewTourClicked(MouseEvent mouseEvent){
        Tour selectedItem = (Tour) tourListView.getSelectionModel().getSelectedItem();
        System.out.println(tourListView.getSelectionModel().getSelectedItem());
    }



}