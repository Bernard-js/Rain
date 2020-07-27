package com.bernard.rain.graphics;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SpriteSheet {

    private String path;
    public final int SIZE;
    public int[] pixels;

    public static SpriteSheet tiles;

    static {
        try {
            tiles = new SpriteSheet("res/textures/spritesheet.png", 256);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public SpriteSheet(String path, int size) throws IOException {
        this.path = path;
        SIZE = size;
        pixels = new int[SIZE * SIZE];
        load(path);
    }

    private void load(String path) {
        try {
            BufferedImage image = ImageIO.read(new File(path));
            int w = image.getWidth();
            int h = image.getHeight();
            image.getRGB(0, 0, w, h, pixels, 0, w);
        } catch (IOException e){
            e.printStackTrace();
        }

    }

}
