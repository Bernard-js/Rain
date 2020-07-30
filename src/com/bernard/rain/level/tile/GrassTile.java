package com.bernard.rain.level.tile;

import com.bernard.rain.graphics.Screen;
import com.bernard.rain.graphics.Sprite;

public class GrassTile extends Tile {

    public GrassTile(Sprite sprite) {
        super(sprite);
    }

    @Override
    public void render(int x, int y, Screen screen) {
        // Do render Stuff here!
        screen.renderTile(x << 4, y << 4, this);
    }
}
