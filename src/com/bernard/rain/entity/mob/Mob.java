package com.bernard.rain.entity.mob;

import com.bernard.rain.entity.Entity;
import com.bernard.rain.graphics.Sprite;

public abstract class Mob extends Entity {

    protected Sprite sprite;
    protected int dir = 0;
    protected boolean moving = false;

    public void move(int xa, int ya){
        if (xa > 0) dir = 1; // move right
        if (xa < 0) dir = 3; // move left
        if (ya > 0) dir = 2; // move down
        if (ya < 0) dir = 0; // move up

        if(!collision()) {
            x += xa;
            y += ya;
        }
    }

    @Override
    public void update(){

    }

    private boolean collision(){
        return false;
    }

    public void render(){

    }
}
