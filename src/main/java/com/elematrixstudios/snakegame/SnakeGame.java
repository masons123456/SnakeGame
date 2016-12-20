package com.elematrixstudios.snakegame;

import com.elematrixstudios.snakegame.options.OptionsManager;
import lombok.Getter;

public class SnakeGame {

    @Getter
    private OptionsManager optionsManager;

    public SnakeGame() {
        this.optionsManager = new OptionsManager();
    }

    public static void main(String[] args) {
        new SnakeGame();
    }
}
