package com.bernard.rain.entity;

import com.bernard.rain.graphics.Screen;
import com.bernard.rain.level.Level;

import java.util.Random;

public abstract class Entity {

    public int x, y;
    private boolean removed = false;
    protected Level level;
    protected Random random = new Random();

    public void update(){

    }

    public void render(Screen screen){

    }

    public void remove(){
        //Remove From Level
        this.removed = true;
    }

    public boolean isRemoved(){
        return removed;
    }
}
