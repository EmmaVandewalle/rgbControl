package com.example.rgbcontrol.containers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.VBox;

import java.util.Objects;

public class Direction extends VBox implements EventHandler<ActionEvent> {

    private RadioButton chosen;

    public Direction() {

        Label direction = new Label("Choose the direction of the animation");

        RadioButton rightToLeft = new RadioButton("From right to left");
        rightToLeft.setOnAction(this);
        RadioButton leftToRight = new RadioButton("From left to right");
        leftToRight.setOnAction(this);

        rightToLeft.setSelected(true);
        chosen = rightToLeft;

        getChildren().addAll(direction, rightToLeft, leftToRight);

        getStylesheets().add(Objects.requireNonNull(getClass().getResource("boxes.css")).toExternalForm());
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        chosen.setSelected(false);
        chosen = (RadioButton) actionEvent.getSource();
        chosen.setSelected(true);
    }
}
