package com.bernard.rain.graphics;

public class Sprite {
    public final int SPRITE_SIZE;
    private int x, y;
    public int[] pixels;
    private SpriteSheet sheet;

    public static Sprite grass = new Sprite(16, 0, 0, SpriteSheet.tiles);

    public Sprite(int spriteSize, int x, int y, SpriteSheet sheet){
        SPRITE_SIZE = spriteSize;
        pixels = new int[SPRITE_SIZE * SPRITE_SIZE];
        this.x = x * spriteSize;
        this.y = y * spriteSize;
        this.sheet = sheet;
        load();
    }

    private void load(){
        for (int i = 0; i < SPRITE_SIZE; i++) {
            for (int j = 0; j < SPRITE_SIZE; j++) {
                pixels[j + i * SPRITE_SIZE] = sheet.pixels[(j + this.x) +(i + this.y) * sheet.SIZE];
            }
        }
    }

}
