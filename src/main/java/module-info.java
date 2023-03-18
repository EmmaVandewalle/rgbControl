module com.example.rgbcontrol {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rgbcontrol to javafx.fxml;
    exports com.example.rgbcontrol;
}