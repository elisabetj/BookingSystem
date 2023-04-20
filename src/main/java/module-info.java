module hbv201g.bookingsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens hbv201g.bookingsystem to javafx.fxml;
    exports hbv201g.bookingsystem;
}