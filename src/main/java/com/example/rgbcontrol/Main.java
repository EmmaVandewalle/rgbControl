package com.example.rgbcontrol;

import com.example.rgbcontrol.homepage.BaseCard;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(new BaseCard());
        stage.setScene(scene);
        stage.setTitle("rgbControl");
        stage.show();
    }
}
