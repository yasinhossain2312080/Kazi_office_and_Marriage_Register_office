package com.example.kazi_office_and_marriage_register_office;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("yasin/Bride-DashBoard-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Bride DashBoard!");
        stage.setScene(scene);
        stage.show();
    }
}
