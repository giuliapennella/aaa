package com.example.gui;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

import java.util.Objects;

public class ControllerScena3 extends ControllerScene {

    Main main;

    @FXML
    GridPane gridPane;
    Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/gui/backCard12.png")));

    Image image0 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/gui/backCard00.png")));
    @FXML
    public void addButtonGridPane(){

        int x,y;
        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 14; j++) {
                ImageView imageView = new ImageView(image0);
                imageView.setFitWidth(200);
                imageView.setFitHeight(100);
                imageView.setPreserveRatio(true);
                gridPane.add(imageView, j, i);
                x=j;
                y=i;
                int finalY = y;
                int finalX = x;
                imageView.setOnMouseClicked((MouseEvent event) -> {placeCard(finalX, finalY);});
            }
        }
    }

    private void placeCard(int x,int y) {
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(200);
        imageView.setFitHeight(100);
        imageView.setPreserveRatio(true);
        gridPane.add(imageView, x, y);
    }

    public void setMain(Main main){
        this.main=main;
    }




}
