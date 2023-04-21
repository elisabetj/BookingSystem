package hbv201g.bookingsystem;

/**
 * @author Ester Jenný (ejb7)
 **/
public class Tour {
    private String tour;

    public Tour(String tour) {
        this.tour = tour;
    }

    @Override
    public String toString() {
        return tour;
    }

    public String getTour() {
        return tour;
    }

    public void setTour(String tour) {
        this.tour = tour;
    }
}
