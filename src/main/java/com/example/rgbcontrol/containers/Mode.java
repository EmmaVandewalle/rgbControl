package com.example.rgbcontrol.containers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.Objects;

public class Mode extends VBox implements EventHandler<ActionEvent> {

    private RadioButton chosen;

    public Mode() {
        ArrayList<RadioButton> buttons = new ArrayList<>();

        Label mode = new Label("Choose a mode");
        getChildren().add(mode);

        String[] textButtons = {"Static [Accepts ZoneID[1,2,3,4] + RGB Color]", "Breath [Accepts RGB color]", "Neon",
                "Wave", "Shifting [Accepts RGB color]", "Zoom [Accepts RGB color]"};
        for (String text : textButtons) {
            RadioButton button = new RadioButton(text);
            button.setOnAction(this);
            buttons.add(button);
            getChildren().add(button);
        }

        buttons.get(0).setSelected(true);
        chosen = buttons.get(0);
        getStylesheets().add(Objects.requireNonNull(getClass().getResource("boxes.css")).toExternalForm());
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        chosen.setSelected(false);
        chosen = ((RadioButton) actionEvent.getSource());
        chosen.setSelected(true);
    }
}
