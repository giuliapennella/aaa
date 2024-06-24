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
                imageView.setFitWidth(gridPane.getColumnConstraints().get(0).getPrefWidth());
                imageView.setFitHeight(gridPane.getRowConstraints().get(0).getPrefHeight());
                imageView.setPreserveRatio(true);
                gridPane.add(imageView, j, i);
                /*Button button = new button("Cell " + i + "," + j);
                label.setStyle("-fx-border-color: black; -fx-padding: 10px;");
                label.setOnMouseClicked(event -> {
                    System.out.println("Clicked on: " + label.getText());
                });

                gridPane.add(label, j, i);*/
            }
        }
    }

    public void setMain(Main main){
        this.main=main;
    }




}
