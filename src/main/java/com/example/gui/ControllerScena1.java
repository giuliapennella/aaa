package com.example.gui;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ControllerScena1 extends ControllerScene {
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
    public void prendiNickname(MouseEvent mouseEvent) {

            String inputText = nick.getText();
            System.out.println("Hai inserito: " + inputText);
            main.changeScene(code);
    }


}
