package com.elematrixstudios.snakegame.game;

import com.elematrixstudios.snakegame.options.OptionsManager;

import java.awt.Color;

public class Snake {

    private int length;
    private Color color;
    private Controller controller;

    public Snake(int length, Color color, Controller controller) {
        this.length = length;
        this.color = color;
        this.controller = controller;
    }

    public Snake() {
        this(OptionsManager.DEFAULT_SNAKE_LENGTH, OptionsManager.DEFAULT_SNAKE_COLOR, Controller.DUMMY);
    }

    public Snake(Controller controller) {
        this(OptionsManager.DEFAULT_SNAKE_LENGTH, OptionsManager.DEFAULT_SNAKE_COLOR, controller);
    }

    public int getLength() {
        return this.length;
    }

    public Color getColor() {
        return this.color;
    }

    public Controller getController() {
        return this.controller;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void addLength() {
        this.length++;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}
