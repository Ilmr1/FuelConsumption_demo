package org.example.fuelconsumption_demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Locale;
import java.util.ResourceBundle;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/hello-view.fxml"), bundle);
        Scene scene = new Scene(fxmlLoader.load(), 400, 300);
        stage.setTitle("Ilmari Elomaa");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}