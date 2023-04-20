package hbv201g.bookingsystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private ListView tourListView;
    @FXML
    private ListView hotelListView ;
    @FXML
    private TextField customerTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private Button button;

    private Data data = new Data();
    private ObservableList<Tour> tour = FXCollections.observableArrayList();
    private ObservableList<Hotel> hotel = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tour = data.getTour();
        tourListView.setItems(tour);

        hotel = data.getHotel();
        hotelListView.setItems(hotel);
    }
}