package hbv201g.bookingsystem;

/**
 * @author Ester Jenný (ejb7)
 **/
public class Hotel {
    private String hotel;

    public Hotel(String hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return hotel;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }
}
