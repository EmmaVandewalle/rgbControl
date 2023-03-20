package com.example.rgbcontrol;

import javafx.beans.binding.Bindings;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.util.converter.NumberStringConverter;

import java.text.DecimalFormat;
import java.text.ParseException;

abstract public class AbstractSliderTextfield {

    public static void setBinding(int minVal, int maxVal, Slider value, TextField score) {
        value.valueProperty().addListener((obs, oldV, newV) -> {
            value.setValue(newV.intValue());
        });

        score.textProperty().addListener((obs, oldV, newV) -> {
            if (newV.isEmpty()) return;
            try {
                int number = Integer.parseInt(newV);
                if (number < minVal || number > maxVal) {
                    score.setText(oldV);
                    return;
                }
                score.setText(newV);
            } catch (NumberFormatException e) {
                score.setText(oldV);
            }
        });

//        score.setTextFormatter(new TextFormatter<Number>(new NumberStringConverter(new DecimalFormat())));

        Bindings.bindBidirectional(score.textProperty(), value.valueProperty(), new NumberStringConverter());
    }

}
