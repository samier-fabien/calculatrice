package org.samierfabien;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

import java.awt.*;
import java.util.ArrayList;

public class CalcController {
    @FXML
    public AnchorPane root;
    @FXML
    public TextArea textArea;
    @FXML
    public Button zero;
    @FXML
    public Button un;
    @FXML
    public Button deux;
    @FXML
    public Button trois;
    @FXML
    public Button quatre;
    @FXML
    public Button cinq;
    @FXML
    public Button six;
    @FXML
    public Button sept;
    @FXML
    public Button huit;
    @FXML
    public Button neuf;
    @FXML
    public Button vider;
    @FXML
    public Button plus;
    @FXML
    public Button calculer;

    public CalcController() {
        //zero.setOnAction(eventHandler);
    }

    public void vider() {
        textArea.clear();
    }

    public void calculer() {
        int resultat = 0;
        String[] tab = textArea.getText().split("\\+");
        /*
        "(?<=\\G[+0-9]{2})" >> "+1"...
        "(?<=[+])[0-9]" >> "+"...
        "\\+(?=[0-9]){1,}" >> " " "1"...
        "(?<=.{1})" >> "+" "1"...
         */

        for (int i = 0; i < tab.length; i++) {
            resultat = resultat + Integer.parseInt(tab[i]);
        }

        textArea.clear();
        textArea.appendText(String.valueOf(resultat));
    }

    public void ajouterChiffre(ActionEvent actionEvent) {
        Button b = (Button)actionEvent.getSource();
        textArea.appendText(b.getText());
    }
}
