package com.example.gui;

public abstract class ControllerScene {
    Main main;
    int code;

    public void setMain(Main main){
        this.main=main;
    }

    public void setInt(int i) {
        this.code=i;
    }
}
