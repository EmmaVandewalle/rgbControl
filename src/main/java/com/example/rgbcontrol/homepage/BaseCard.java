package com.example.rgbcontrol.homepage;

import com.example.rgbcontrol.containers.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class BaseCard extends BorderPane {

    public BaseCard() {
        HBox mainBox = new HBox();

        // mode
        Mode mode = new Mode();

        // speed
        Speed speed = new Speed();

        // brightness
        Brightness brightness = new Brightness();

        // direction
        Direction direction = new Direction();

        VBox leftPart = new VBox(mode, speed, brightness, direction);


        // zone 1,2,3,4
        CopyRGB copyRGB = new CopyRGB(new int[]{255, 255, 255});

        Zone zoneOne = new Zone(copyRGB);
        Zone zoneTwo = new Zone(copyRGB);

        HBox zonesOneTwo = new HBox(zoneOne, zoneTwo);

        Zone zoneThree = new Zone(copyRGB);
        Zone zoneFour = new Zone(copyRGB);

        HBox zonesThreeFour = new HBox(zoneThree, zoneFour);


        VBox zones = new VBox(copyRGB, zonesOneTwo, zonesThreeFour);

        // profile name

        // list (show all saved profiles)

        // optional arguments

        mainBox.getChildren().addAll(leftPart, zones);

        setCenter(mainBox);

        getStylesheets().add(getClass().getResource("base.css").toExternalForm());
    }

}
