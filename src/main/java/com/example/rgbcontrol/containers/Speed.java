package com.example.rgbcontrol.containers;

import com.example.rgbcontrol.AbstractSliderTextfield;
import javafx.beans.binding.Binding;
import javafx.beans.binding.Bindings;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.util.converter.NumberStringConverter;

import java.text.NumberFormat;
import java.util.Objects;

public class Speed extends VBox {

    public Speed() {

        Label speed = new Label("Choose speed (not with static)");

        Slider value = new Slider();
        int minVal = 0;
        value.setMin(minVal);
        int maxVal = 9;
        value.setMax(maxVal);
        TextField score = new TextField();

        AbstractSliderTextfield.setBinding(minVal, maxVal, value, score);

        getChildren().addAll(speed, value, score);

        getStylesheets().add(Objects.requireNonNull(getClass().getResource("boxes.css")).toExternalForm());
    }

}
