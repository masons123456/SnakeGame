package com.elematrixstudios.snakegame.game;

import lombok.Getter;
import lombok.Setter;

public class BodyPart {

    @Getter
    @Setter
    private Location location;
    @Getter
    @Setter
    private BodyPartType type;

    public BodyPart(int x, int y, BodyPartType type, Direction direction) {
        this.location = new Location(x,y,direction);
        this.type = type;
    }

    public BodyPart(BodyPartType type) {
        this.type = type;
    }
}

