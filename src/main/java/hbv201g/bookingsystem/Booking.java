package hbv201g.bookingsystem;

/**
 * @author Ester Jenný (ejb7)
 **/
public interface Booking {
    void bookTour(Tour trip, Customer customer);
    void bookHotel(Hotel hotel, Customer customer);

}
