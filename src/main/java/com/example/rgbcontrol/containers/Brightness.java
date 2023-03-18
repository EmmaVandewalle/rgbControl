package com.example.rgbcontrol.containers;

import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;

public class Brightness extends VBox {

    public Brightness() {

        Label brightness = new Label("Choose brightness");

        Slider value = new Slider();


        getChildren().addAll(brightness, value);

        getStylesheets().add(getClass().getResource("boxes.css").toExternalForm());
    }

}
