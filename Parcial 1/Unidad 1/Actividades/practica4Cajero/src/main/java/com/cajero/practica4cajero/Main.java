package com.cajero.practica4cajero;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("welcome-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("ATM");
        Image icon = new Image("file:src/main/resources/com/cajero/practica4cajero/img/icon.png");
        primaryStage.getIcons().add(icon);
        primaryStage.setResizable(false);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {launch(args);}

}
