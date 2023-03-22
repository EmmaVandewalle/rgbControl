package com.example.rgbcontrol.containers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import java.util.Objects;

public class Zone extends BorderPane implements EventHandler<ActionEvent> {

        private final Label red = new Label("Red: 255");
        private final Label green = new Label("Green: 255");
        private final Label blue = new Label("Blue: 255");

        ColorPicker colorPicker = new ColorPicker();

    public Zone() {
        VBox values = new VBox(red, green, blue);

        colorPicker.setOnAction(this);

        setCenter(values);
        setBottom(colorPicker);

        getStylesheets().add(Objects.requireNonNull(getClass().getResource("boxes.css")).toExternalForm());
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        red.setText("Red: " + (int) Math.round(colorPicker.getValue().getRed()*255));
        green.setText("Green: " + (int) Math.round(colorPicker.getValue().getGreen()*255));
        blue.setText("Blue: " + (int) Math.round(colorPicker.getValue().getBlue()*255));
    }
}
