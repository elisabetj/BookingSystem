package hbv201g.bookingsystem;

import static org.junit.Assert.assertTrue;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for Tour application.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    protected String name, email, tourName, hotelName;

    @Before
    public void setUp(){
        tourName = "tour";
        hotelName = "hotel";
        name = "Name";
        email = "email";
    }

    @Test
    public void bookingTour()
    {
        Customer customer = new Customer(name, email);
        Tour tour = new Tour(tourName);
        Booking booking = new Trip();

        booking.bookTour(tour, customer);
    }

    @Test
    public void bookingAccomodation(){
        Customer customer = new Customer(name, email);
        Hotel hotel = new Hotel(hotelName);
        Booking accommodation = new Trip();

        accommodation.bookHotel(hotel, customer);
    }
}