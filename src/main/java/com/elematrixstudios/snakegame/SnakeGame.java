package com.elematrixstudios.snakegame;

import com.elematrixstudios.snakegame.options.OptionsManager;
import lombok.Getter;

import java.awt.Color;
import java.util.logging.Logger;

public class SnakeGame {

    @Getter
    private OptionsManager optionsManager;
    @Getter
    private Logger logger;

    public SnakeGame() {
        this.optionsManager = new OptionsManager(this);
        this.logger = Logger.getLogger(this.getClass().getName());
    }

    public static void main(String[] args) {
        new SnakeGame();
    }
}
