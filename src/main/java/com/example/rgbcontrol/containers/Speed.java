package com.example.rgbcontrol.containers;

import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.util.Objects;

public class Speed extends VBox {

    public Speed() {

        Label speed = new Label("Choose speed (not with static)");

        Slider value = new Slider();
        TextField score = new TextField();

        getChildren().addAll(speed, value, score);

        getStylesheets().add(Objects.requireNonNull(getClass().getResource("boxes.css")).toExternalForm());
    }

}
