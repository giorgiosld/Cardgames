package it.unicam.cs.pa2021.cardgames.blackjack.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import javafx.event.ActionEvent;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sceneController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField betField;
    @FXML
    private Label myBank;
    @FXML
    private ImageView cardPlayer;
    @FXML
    private ImageView cardPlayer2;
    @FXML
    private ImageView hideCard;
    @FXML
    private ImageView cardBanco;


    public void switchToGame(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/blackjack.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToMenu(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/menu.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void exitToGame(ActionEvent event) throws IOException{
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.hide();
    }

    public void addBet(ActionEvent event) throws IOException{
        int bank = Integer.parseInt(myBank.getText().isEmpty() ? "0" : myBank.getText());
        if(bank == 0){
            Alert alert = new Alert(Alert.AlertType.ERROR, "Non puoi continuare a giocare senza bet. Ricomincia una nuova partita");
            alert.showAndWait();
            Parent root = FXMLLoader.load(getClass().getResource("/menu.fxml"));
            stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            event.consume();
        }
        int betting = Integer.parseInt(betField.getText().equals("InsertBet") ? "0" : betField.getText());
        if(betField.getText().equals("InsertBet")){
            Alert alert = new Alert(Alert.AlertType.WARNING, "Inserire un bet valido[numerico]");
            alert.showAndWait();
        }
        if((betting <= bank)){
            myBank.setText(Integer.toString(bank-betting));
            betField.setText("InsertBet");
            //showCards();
        }else if(bank != 0){
            Alert alert = new Alert(Alert.AlertType.ERROR, "Inserire un bet minore rispetto al valore del bank");
            alert.showAndWait();
        }
    }

    public void showCards(){
        
    }

}
