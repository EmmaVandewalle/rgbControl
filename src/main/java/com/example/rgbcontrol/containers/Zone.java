package com.example.rgbcontrol.containers;

import com.example.rgbcontrol.homepage.CopyRGB;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import java.util.Objects;

public class Zone extends BorderPane implements EventHandler<ActionEvent> {

        private final Label red = new Label("Red: 255");
        private final Label green = new Label("Green: 255");
        private final Label blue = new Label("Blue: 255");

        private final Button copy = new Button("Copy rgb-values");
        private final Button paste = new Button("Paste rgb-values");

        private final HBox buttons;

        private final CopyRGB copyRGB;

        ColorPicker colorPicker = new ColorPicker();

    public Zone(CopyRGB copyRGB) {
        VBox values = new VBox(new Label("Color values:"), red, green, blue);
        values.setId("labels-color");

        this.copyRGB = copyRGB;

        colorPicker.setOnAction(this);

        copy.setOnAction(c -> {
            copyRGB.setRedValue(Integer.parseInt(red.getText().split(" ")[1]));
            copyRGB.setGreenValue(Integer.parseInt(green.getText().split(" ")[1]));
            copyRGB.setBlueValue(Integer.parseInt(blue.getText().split(" ")[1]));
            copyRGB.updateMessage();
        });

        paste.setOnAction(p -> {
            colorPicker.setValue(Color.rgb(copyRGB.getRedValue(), copyRGB.getGreenValue(), copyRGB.getBlueValue()));
            setLabels();
        });

        buttons = new HBox(colorPicker, copy, paste);
        buttons.setId("buttons-zone");

        setCenter(values);
        setBottom(buttons);

        getStylesheets().add(Objects.requireNonNull(getClass().getResource("boxes.css")).toExternalForm());
    }

    public void setLabels() {
        red.setText("Red: " + (int) Math.round(colorPicker.getValue().getRed()*255));
        green.setText("Green: " + (int) Math.round(colorPicker.getValue().getGreen()*255));
        blue.setText("Blue: " + (int) Math.round(colorPicker.getValue().getBlue()*255));
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        setLabels();
    }
}
