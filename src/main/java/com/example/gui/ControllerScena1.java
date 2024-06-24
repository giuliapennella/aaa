package com.example.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ControllerScena1 extends ControllerScene {
    @FXML
    public TextField nick;
    Main main;


    public void setMain(Main main){
        this.main=main;
    }

    @FXML
    public void prendiNickname(ActionEvent mouseEvent) {
            String inputText = nick.getText();
            System.out.println("Hai inserito: " + inputText);
            main.changeScene(1);
    }


}
