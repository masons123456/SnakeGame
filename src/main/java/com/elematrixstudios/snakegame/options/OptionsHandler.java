package com.elematrixstudios.snakegame.options;

import com.elematrixstudios.snakegame.SnakeGame;
import com.elematrixstudios.snakegame.game.Snake;
import org.yaml.snakeyaml.Yaml;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

public class OptionsHandler {

    private SnakeGame main;

    public static int DEFAULT_SNAKE_LENGTH;
    public static Color DEFAULT_SNAKE_COLOR;

    private Yaml configFile;
    private HashMap<String, Object> config;

    public OptionsHandler(SnakeGame main) {
        this.main = main;

        configFile = new Yaml();

        File f = new File("src" + File.separator + "main" + File.separator + "resources" + File.separator + "config.yaml");
        InputStream in = null;
        try {
            in = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        this.config = (HashMap<String, Object>) configFile.load(in);

        this.loadDefaults();
    }


    private void loadDefaults() {
        if (config == null) {
            this.main.getLogger().severe("Couldn't load config file! Using hard-defaults!");
            DEFAULT_SNAKE_LENGTH = 3;
            DEFAULT_SNAKE_COLOR = Color.GREEN;

        } else {
            HashMap<String, Object> snakeDefaults = (HashMap<String, Object>) this.config.get("defaults");
            DEFAULT_SNAKE_LENGTH = Integer.parseInt(snakeDefaults.get("snake-length").toString());
            try {
                Field field = Color.class.getField(snakeDefaults.get("snake-color").toString());
                DEFAULT_SNAKE_COLOR = (Color) field.get(null);
            } catch (Exception ex) {
                DEFAULT_SNAKE_COLOR = Color.GREEN;
            }
        }
    }
}
