package com.example.myjavafxapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import net.sf.jasperreports.chrome.LaunchConfiguration;

import java.io.IOException;
import java.sql.SQLException;

public class HelloApplication extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        /*
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 500);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
*/
    }

    public static void main(String[] args)  throws SQLException {


        DB.initialize();

        SplashScreen.showSplash(); // Show the splash screen
        launch(args); //
    }
}