package com.example.rgbcontrol.containers;

import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.VBox;

public class Direction extends VBox {

    public Direction() {

        Label direction = new Label("Choose the direction of the animation");

        RadioButton rightToLeft = new RadioButton("From right to left");
        RadioButton leftToRight = new RadioButton("From left to right");

        getChildren().addAll(direction, rightToLeft, leftToRight);

        getStylesheets().add(getClass().getResource("boxes.css").toExternalForm());
    }

}
