package com.bernard.rain.entity.mob;

import com.bernard.rain.entity.Entity;
import com.bernard.rain.graphics.Sprite;

public abstract class Mob extends Entity {

    protected Sprite sprite;
    protected int dir = 0;
    protected boolean moving = false;

    public void move(){

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
