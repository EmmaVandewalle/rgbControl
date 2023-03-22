package com.example.rgbcontrol;

import javafx.beans.binding.Bindings;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.util.converter.NumberStringConverter;

abstract public class AbstractSliderTextfield {

    public static void setBinding(int minVal, int maxVal, Slider value, TextField score) {
        value.valueProperty().addListener((obs, oldV, newV) -> {
            value.setValue(newV.intValue());
            int val = newV.intValue();
            score.setText("" + val);
        });

        score.textProperty().addListener((obs, oldV, newV) -> {
            newV = newV.replaceAll("[^0-9]", "");
            if (newV.isEmpty()) {
                value.setValue(0.0);
                score.setText("0");
                return;
            }
            try {
                int number = (int) Double.parseDouble(newV);
                if (number < minVal || number > maxVal) {
                    score.setText(oldV);
                    return;
                }
                score.setText(newV);
                value.setValue(number);
            } catch (NumberFormatException e) {
                score.setText(oldV);
            }
        });
    }

}
