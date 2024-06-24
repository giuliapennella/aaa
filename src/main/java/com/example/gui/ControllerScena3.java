package com.example.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.util.Objects;

public class ControllerScena3 extends ControllerScene {

    @FXML
    public Button button00;
    public GridPane gridPane;
    public ImageView imageView00;
    Main main;

    Image image00 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/gui/backCard12.png")));


    public void setMain(Main main){
        this.main=main;
    }

    @FXML
    public void button00Clicked(ActionEvent event) {
        button00.setDisable(true);
        System.out.println("button00 clicked");
        imageView00 = new ImageView(image00);

        // Assicurati che l'ImageView si adatti alla cella
        imageView00.setFitWidth(100);
        imageView00.setFitHeight(200);
        imageView00.setPreserveRatio(true);

        gridPane.add(imageView00, 0, 0);

    }
}
