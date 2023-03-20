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

//        score.textProperty().addListener((obs, oldV, newV) -> {
//            if (newV.isEmpty()) return;
//            try {
//                int number = Integer.parseInt(newV);
//                if (number < minVal || number > maxVal) {
//                    score.setText(oldV);
////                    value.setValue(Integer.parseInt(oldV));
//                    return;
//                }
//                score.setText(newV);
////                value.setValue(number);
//            } catch (NumberFormatException e) {
//                score.setText(oldV);
////                value.setValue(Integer.parseInt(oldV));
//            }
//        });

        score.setTextFormatter(new TextFormatter<Number>(new NumberStringConverter(new DecimalFormat())));

//        score.setTextFormatter(new TextFormatter<>(c -> {
//            if (c.isContentChange()) {
//                if (c.getControlNewText().length() == 0) {
//                    System.out.println("in if");
//                    return c;
//                }
//
//                try {
//                    Integer.parseInt(c.getControlNewText());
//                    if (Integer.parseInt(c.getControlNewText()) < minVal || Integer.parseInt(c.getControlNewText()) > maxVal) {
//                        System.out.println("in parse");
//                        return null;
//                    }
//                    return c;
//                } catch (NumberFormatException e) {
//                    System.out.println("in catch");
//                    e.getMessage();
//                }
//
//            }
//            return null;
//        }));

        Bindings.bindBidirectional(score.textProperty(), value.valueProperty(), new NumberStringConverter());

//        score.textProperty().bind(value.valueProperty().asString("%.0f"));
    }

}
