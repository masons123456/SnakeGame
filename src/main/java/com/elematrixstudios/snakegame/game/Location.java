package com.elematrixstudios.snakegame.game;

import lombok.Getter;
import lombok.Setter;

public class Location {
    @Getter
    @Setter
    private int x, y;
    @Getter
    @Setter
    private Direction direction;

    public Location() {
        this.direction = Direction.UP;
    }

    public Location(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
}
