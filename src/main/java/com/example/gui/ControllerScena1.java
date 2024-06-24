package com.example.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ControllerScena1 /*extends ControllerScene*/ {
    @FXML
    public TextField nick;
    Main main;
    int code;

    public void setMain(Main main){
        this.main=main;
    }

    public void setInt(int i) {
        this.code=i;
    }

    @FXML
    public void prendiNickname(ActionEvent mouseEvent) {

            String inputText = nick.getText();
            System.out.println("Hai inserito: " + inputText);
            main.changeScene(code);
    }


}
