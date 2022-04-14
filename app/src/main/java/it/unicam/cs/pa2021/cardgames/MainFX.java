package it.unicam.cs.pa2021.cardgames;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
       // try {
            Parent root = FXMLLoader.load(getClass().getResource("/menu.fxml"));
            //stage.getIcons().add(new Image(getClass().getResource("iconaCard/.jpg").toString()));
            Scene scene = new Scene(root, 904.0, 550.0);
            stage.setTitle("CardGames");
            stage.setScene(scene);
            stage.show();
//        } catch(Exception e){
//            e.printStackTrace();
//        }
    }
}
