module org.example.fuelconsumption_demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.fuelconsumption_demo to javafx.fxml;
    exports org.example.fuelconsumption_demo;
}