package hbv201g.bookingsystem;

import java.util.ArrayList;

/**
 * @author Ester Jenný (ejb7)
 **/
public class Customer {
    private String name;
    private String email;
    private ArrayList<Booking> bookings;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.bookings = new ArrayList<>();
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

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }

}
