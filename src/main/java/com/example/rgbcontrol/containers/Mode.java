package com.example.rgbcontrol.containers;

import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.VBox;

public class Mode extends VBox {

    public Mode() {

        Label mode = new Label("Choose a mode");

        RadioButton staticMode = new RadioButton("Static [Accepts ZoneID[1,2,3,4] + RGB Color]");
        RadioButton breathMode = new RadioButton("Breath [Accepts RGB color]");
        RadioButton neonMode = new RadioButton("Neon");
        RadioButton waveMode = new RadioButton("Wave");
        RadioButton shiftingMode = new RadioButton("Shifting [Accepts RGB color]");
        RadioButton zoomMode = new RadioButton("Zoom [Accepts RGB color]");

        getChildren().addAll(mode, staticMode, breathMode, neonMode, waveMode, shiftingMode, zoomMode);

        getStylesheets().add(getClass().getResource("boxes.css").toExternalForm());
    }

}
