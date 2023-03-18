package com.example.rgbcontrol.containers;

import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;

public class Speed extends VBox {

    public Speed() {

        Label speed = new Label("Choose speed (not with static)");

        Slider value = new Slider();

        getChildren().addAll(speed, value);

        getStylesheets().add(getClass().getResource("boxes.css").toExternalForm());
    }

}
