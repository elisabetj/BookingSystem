package hbv201g.bookingsystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

/**
 * @author Ester Jenný (ejb7)
 **/

public class Data {
    public Data(){}

    public ObservableList<Customer> getCustomer(){
        ObservableList<Customer> customer = FXCollections.observableArrayList();
        return customer;
    }

    public ObservableList<Booking> getBooking(){
        ObservableList<Booking> booking = FXCollections.observableArrayList();
        return booking;
    }

    public ArrayList<Tour> getTour() {
        ArrayList<Tour> tour = new ArrayList<>();
        tour.add(new Tour("Sightseeing"));
        tour.add(new Tour("Horse riding"));

        return tour;
    }

    public ArrayList<Hotel> getHotel(){
        ArrayList<Hotel> hotel = new ArrayList<>();
        hotel.add(new Hotel("Hotel 1"));
        hotel.add(new Hotel("Hotel 2"));

        return hotel;
    }
}
