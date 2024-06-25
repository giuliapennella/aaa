package com.example.gui;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;

import java.util.Objects;

import static javafx.scene.layout.StackPane.*;

public class ControllerScena3 extends ControllerScene {

    Main main;

    @FXML
    GridPane gridPane;

    @FXML
    public void addButtonGridPane(){

        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/gui/backCard12.png")));

        for (int i = 0; i < 14; i++) {
            for (int j = 0; j < 14; j++) {
                if(i%2==0)
                {
                    if(j%2==0)
                    {
                        setButtonAndImage(j, i, image);
                    }
                }else {
                    if(j%2==1)
                    {
                        setButtonAndImage(j, i, image);
                    }
                }
            }
        }
    }

    private void setButtonAndImage(int j, int i, Image image) {
        Button button = createOutlinedButton();
        button.setMaxHeight(Double.MAX_VALUE);
        StackPane buttonContainer = new StackPane();

        buttonContainer.setAlignment(Pos.CENTER);
        buttonContainer.getChildren().add(button);

        gridPane.add(buttonContainer, j, i);

        int finalJ = j;
        int finalI = i;
        button.setOnAction(e -> {
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(200);
            imageView.setFitHeight(100);
            imageView.setPreserveRatio(true);
            gridPane.add(imageView, finalJ, finalI);
        });
    }

    private Button createOutlinedButton() {
        Button button = new Button();
        button.setPrefSize(200, 2000);

        // Impostazione dello stile per mostrare solo il bordo
        button.setStyle(
                "-fx-background-color: transparent;" + /* Colore di sfondo trasparente */
                        "-fx-border-color: black;" + /* Colore del bordo */
                        "-fx-border-width: 2px;" + /* Spessore del bordo */
                        "-fx-border-radius: 0;" /* Opzionale: se si desidera il bordo angolare */
        );

        return button;
    }

    public void setMain(Main main){
        this.main=main;
    }




}
