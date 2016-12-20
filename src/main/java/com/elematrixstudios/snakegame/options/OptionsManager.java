package com.elematrixstudios.snakegame.options;

import org.yaml.snakeyaml.Yaml;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;

public class OptionsManager {

    public static int DEFAULT_SNAKE_LENGTH;
    public static Color DEFAULT_SNAKE_COLOR;

    private Yaml configFile;
    private HashMap<String, Object> config;

    public OptionsManager() {
        configFile = new Yaml();

        File f = new File("config.yaml");
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
        DEFAULT_SNAKE_LENGTH = Integer.parseInt(this.config.get("defaults.snake-length").toString());
        DEFAULT_SNAKE_COLOR = Color.getColor(this.config.get("defaults.snake-color").toString());
    }
}
