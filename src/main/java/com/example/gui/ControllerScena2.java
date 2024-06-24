package com.example.gui;

import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class ControllerScena2 extends ControllerScene {
    Main main;
    public void setMain(Main main){
        this.main=main;
    }
    public void accessToGame(MouseEvent mouseEvent){
        Button clickedButton = (Button) mouseEvent.getSource();
        String buttonId = clickedButton.getId();

        switch (buttonId){
            case "create":
                System.out.println("Hai inserito: create");
                break;
            case "join":
                System.out.println("Hai inserito: join");
                break;
        }

        main.changeScene(2);
    }

}
