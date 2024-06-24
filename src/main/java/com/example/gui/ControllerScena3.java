package com.example.gui;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.util.Objects;

public class ControllerScena3 extends ControllerScene {

    Main main;

    @FXML
    GridPane gridPane;

    @FXML
    public void addButtonGridPane(){

        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/gui/backCard12.png")));

        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 14; j++) {
                ImageView imageView = new ImageView(image);
                imageView.setFitWidth(200);
                imageView.setFitHeight(100);
                imageView.setPreserveRatio(true);
                gridPane.add(imageView, j, i);
            }
        }
    }

    public void setMain(Main main){
        this.main=main;
    }




}
