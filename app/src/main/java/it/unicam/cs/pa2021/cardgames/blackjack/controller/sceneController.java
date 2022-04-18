package it.unicam.cs.pa2021.cardgames.blackjack.controller;

import it.unicam.cs.pa2021.cardgames.util.model.cards.Face;
import it.unicam.cs.pa2021.cardgames.util.model.cards.FrenchICard;
import it.unicam.cs.pa2021.cardgames.util.model.cards.FrenchIRank;
import it.unicam.cs.pa2021.cardgames.util.model.cards.FrenchISuit;
import it.unicam.cs.pa2021.cardgames.util.model.player.Hand;
import it.unicam.cs.pa2021.cardgames.util.model.player.IHand;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javafx.event.ActionEvent;

import java.io.IOException;
import java.util.*;

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
    @FXML
    private AnchorPane anchor;
    @FXML
    private Button card;
    @FXML
    private Button setValue;
    @FXML
    private Button stai;

    private static int x=0;
    private final static int padding = 90;
    private static final List<ImageView> handPlayerGui = new ArrayList<>();
    private static final IHand<FrenchICard> handPlayer = new Hand<>();
    private static final IHand<FrenchICard> handBanco = new Hand<>();
    private int myBet;


    public void switchToGame(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("/blackjack.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        x=0;
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
        anchor.getChildren().removeAll(handPlayerGui.stream().toList());
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
        myBet = Integer.parseInt(betField.getText().equals("InsertBet") ? "0" : betField.getText());
        if(betField.getText().equals("InsertBet")){
            Alert alert = new Alert(Alert.AlertType.WARNING, "Inserire un bet valido[numerico]");
            alert.showAndWait();
        }
        if((myBet <= bank)){
            myBank.setText(Integer.toString(bank-myBet));
            betField.setText("InsertBet");
            betField.setDisable(true);
            showCards();
        }else if(bank != 0){
            Alert alert = new Alert(Alert.AlertType.ERROR, "Inserire un bet minore rispetto al valore del bank");
            alert.showAndWait();
        }
    }

    private void showCards() throws IOException {
        setValue.setDisable(true);
        card.setDisable(false);
        stai.setDisable(false);
        Image imageHidden = new Image("frenchCards/cartaGirata.jpeg");
        hideCard.setImage(imageHidden);
        cardBanco.setImage(dealBankCards());
        cardPlayer.setImage(dealCards());
        cardPlayer2.setImage(dealCards());
    }

    private Image dealBankCards() {
        return getImage(handBanco);
    }

    private Image dealCards(){
        return getImage(handPlayer);
    }

    private Image getImage(IHand<FrenchICard> hand) {
        String suit = randomString();
        String rank = randomInt();
        FrenchICard card = new FrenchICard(FrenchIRank.valueOf(rank), FrenchISuit.valueOf(suit));
        Image cardGUI = new Image("frenchCards/"+suit+"/"+rank+".png");
        hand.addCard(card);
        return cardGUI;
    }

    private String randomInt() {
        List<String> givenList = Arrays.asList("ACE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING");
        Random rand = new Random();
        return givenList.get(rand.nextInt(givenList.size()));
    }

    private String randomString() {
        List<String> givenList = Arrays.asList("CLUBS", "DIAMONDS", "HEARTS", "SPADES");
        Random rand = new Random();
        return givenList.get(rand.nextInt(givenList.size()));
    }


    public void carta(ActionEvent event) {
        ImageView cardView = new ImageView();
        cardView.setFitHeight(150.0);
        cardView.setFitWidth(200.0);
        cardView.setLayoutX(424.0+(padding*x));
        cardView.setLayoutY(310.0);
        cardView.setImage(dealCards());
        cardView.setPickOnBounds(true);
        cardView.setPreserveRatio(true);
        handPlayerGui.add(cardView);
        anchor.getChildren().add(cardView);
        x++;
        if(calculateHand(handPlayer.getCards()) > 21){
            winner();
            handPlayer.removeCards();
            handBanco.removeCards();
        }
    }

    public void stai(ActionEvent event) {
        x=0;
        stai.setDisable(true);
        hideCard.setImage(dealBankCards());
        card.setDisable(true);
        winner();
        handPlayer.removeCards();
        handBanco.removeCards();
    }

    private void winner(){
        Image image = new Image(checkWinner());
        ImageView winnerView = new ImageView();
        winnerView.setFitHeight(350.0);
        winnerView.setFitWidth(450.0);
        winnerView.setLayoutX(227.0);
        winnerView.setLayoutY(98.0);
        winnerView.setImage(image);
        winnerView.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                anchor.getChildren().remove(winnerView);
                betField.setDisable(false);
                setValue.setDisable(false);
            }
        });
        anchor.getChildren().add(winnerView);
    }

    private String checkWinner(){
        int valueBanco = calculateHand(handBanco.getCards());
        int valuePlayer = calculateHand(handPlayer.getCards());
        int bank = Integer.parseInt(myBank.getText());
        System.out.println(valueBanco +" "+ valuePlayer);
        if((valuePlayer >= valueBanco) && (valuePlayer <= 21)){
            bank = bank+(myBet*2);
            myBank.setText(Integer.toString(bank));
            return "/frenchCards/winner.jpg";
        }
        return "/frenchCards/loser.jpg";
    }

    private int calculateHand(List<FrenchICard> cards) {
        int total = 0;
        for(FrenchICard single: cards){
            if(single.getFace().equals(Face.DOWN))  single.setFace(Face.UP);
            int valueCard = single.getRank().get().getBjValue();
            total += valueCard;
        }
        return total;
    }
}
