package com.elematrixstudios.snakegame.game;

import com.elematrixstudios.snakegame.options.OptionsHandler;
import lombok.Getter;
import lombok.Setter;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

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
    private List<BodyPart> body;
    @Getter
    @Setter
    private Location location;


    public Snake(int length, Color color, Controller controller) {
        this.length = length;
        this.color = color;
        this.controller = controller;
        this.location = new Location();

        this.body = new ArrayList<>();
        this.body.add(new BodyPart(BodyPartType.HEAD));
        this.body.add(new BodyPart(BodyPartType.BODY));
        this.body.add(new BodyPart(BodyPartType.TAIL));
    }

    public Snake() {
        this(OptionsHandler.DEFAULT_SNAKE_LENGTH, OptionsHandler.DEFAULT_SNAKE_COLOR, Controller.DUMMY);
    }

    public Snake(Controller controller) {
        this(OptionsHandler.DEFAULT_SNAKE_LENGTH, OptionsHandler.DEFAULT_SNAKE_COLOR, controller);
    }

    public void addLength() {
        this.length++;
    }
}
