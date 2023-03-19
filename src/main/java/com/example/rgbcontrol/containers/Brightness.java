package com.example.rgbcontrol.containers;

import com.example.rgbcontrol.AbstractSliderTextfield;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.util.Objects;

public class Brightness extends VBox {

    public Brightness() {

        Label brightness = new Label("Choose brightness");

        Slider value = new Slider();
        int minVal = 0;
        value.setMin(minVal);
        int maxVal = 100;
        value.setMax(maxVal);
        TextField score = new TextField();

        AbstractSliderTextfield.setBinding(minVal, maxVal, value, score);

        getChildren().addAll(brightness, value, score);

        getStylesheets().add(Objects.requireNonNull(getClass().getResource("boxes.css")).toExternalForm());
    }

}
