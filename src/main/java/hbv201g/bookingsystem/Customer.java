package hbv201g.bookingsystem;

import java.util.ArrayList;

/**
 * @author Ester Jenný (ejb7)
 **/
public class Customer {
    private String name;
    private String email;
    private ArrayList<Booking> booking;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.booking = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBooking(ArrayList<Booking> booking) {
        this.booking = booking;
    }

    public ArrayList<Booking> getBooking() {
        return booking;
    }
}
