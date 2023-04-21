package hbv201g.bookingsystem;

/**
 * @author Ester Jenný (ejb7)
 **/
public class Trip implements Booking {

    public Trip() {
    }

    @Override
    public void bookTour(Tour tour, Customer customer) {
        book(tour, customer);
    }

    public void bookHotel(Hotel hotel, Customer customer) {
        bookAccommodation(hotel, customer);
    }

    public void book(Tour tour, Customer customer) {
        System.out.println("Trip " + tour.getTour() + " booked by " + customer.getName() + " (" + customer.getEmail() + ")");
    }

    public void bookAccommodation(Hotel hotel, Customer customer) {
        System.out.println("Hotel " + hotel.getHotel() + " booked by " + customer.getName() + " (" + customer.getEmail() + ")");
    }


}
