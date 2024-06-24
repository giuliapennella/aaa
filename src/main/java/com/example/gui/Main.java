package com.example.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.HashMap;

public class Main extends Application {
    Stage stage;
    int n=2;
    HashMap<Integer, Tuple> map = new HashMap<>();
    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        for(int i=1;i<=n;i++) {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("scena"+i+".fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            ControllerScene controller = fxmlLoader.getController();
            controller.setMain(this);
            controller.setInt(i);
            Tuple tuple = new Tuple(scene,controller);
            map.put(i,tuple);
        }

        stage.setScene(map.get(1).getScene());
        stage.show();
    }

    public void changeScene(int i){
        if(map.containsKey(i+1))
        {
            stage.setScene(map.get(i + 1).getScene());
            stage.show();
        }

    }

    public static void main(String[] args) {
        launch();
    }
}