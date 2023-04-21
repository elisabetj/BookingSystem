package hbv201g.bookingsystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

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
        ObservableList<Booking> bookings = FXCollections.observableArrayList();
        return bookings;
    }

    public ObservableList<Tour> getTour() {
        ObservableList<Tour> tour = FXCollections.observableArrayList();
        tour.add(new Tour("Sightseeing"));
        tour.add(new Tour("Horse riding"));

        return tour;
    }

    public ObservableList<Hotel> getHotel(){
        ObservableList<Hotel> hotel = FXCollections.observableArrayList();
        hotel.add(new Hotel("Hotel 1"));
        hotel.add(new Hotel("Hotel 2"));

        return hotel;
    }
}
