package com.example.gui;
import javafx.scene.Scene;

public class Tuple {

    private final Scene scene;
    private final ControllerScene controller;
    
    public Tuple(Scene scene,ControllerScene controller){
        this.scene=scene;
        this.controller=controller;
    }
    
    public Scene getScene() {
        return scene;
    }
    public ControllerScene getController() {
        return controller;
    }
}
