package com.example.rgbcontrol.containers;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class Zone extends BorderPane {

    public Zone() {

        Label red = new Label("Red");
        Label green = new Label("Green");
        Label blue = new Label("Blue");

        HBox values = new HBox(red, green, blue);


        setCenter(values);

        getStylesheets().add(getClass().getResource("boxes.css").toExternalForm());
    }

}
