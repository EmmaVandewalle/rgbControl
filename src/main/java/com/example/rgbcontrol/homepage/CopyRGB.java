package com.example.rgbcontrol.homepage;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

import java.util.Arrays;

public class CopyRGB extends BorderPane {

    private final Label message;

    private int[] rgbValues;

    public CopyRGB(int[] rgbValues) {
        this.rgbValues = rgbValues;

        message = new Label(toString());

        setCenter(message);
    }

    public String toString() {
        return "RGB-value ready to be pasted: (" + getRedValue() + ", " + getGreenValue() + ", " + getBlueValue() + ")";
    }

    public int[] getRgbValues() {
        return rgbValues;
    }

    public int getRedValue() {
        return this.rgbValues[0];
    }

    public int getGreenValue() {
        return this.rgbValues[1];
    }

    public int getBlueValue() {
        return this.rgbValues[2];
    }

    public void setRgbValues(int[] rgbValues) {
        this.rgbValues = rgbValues;
    }

    public void setRedValue(int red) {
        this.rgbValues[0] = red;
    }

    public void setGreenValue(int green) {
        this.rgbValues[1] = green;
    }

    public void setBlueValue(int blue) {
        this.rgbValues[2] = blue;
    }

    public void updateMessage() {
        this.message.setText(toString());
    }

}
