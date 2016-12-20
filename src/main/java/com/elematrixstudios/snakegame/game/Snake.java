package com.elematrixstudios.snakegame.game;

import com.elematrixstudios.snakegame.options.OptionsManager;
import lombok.Getter;
import lombok.Setter;

import java.awt.Color;

public class Snake {

    @Getter
    @Setter
    private int length;
    @Getter
    @Setter
    private Color color;
    @Getter
    @Setter
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

    public void addLength() {
        this.length++;
    }
}
