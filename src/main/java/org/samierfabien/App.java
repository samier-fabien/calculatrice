package org.samierfabien;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        //chemin de "resources"/classe/test.fxml
        Parent root = FXMLLoader.load(getClass().getResource("test.fxml"));

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Première fenêtre");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
