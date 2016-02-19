package com.pb.engine.graphics;

public class Spritesheet {

    private Texture texture;
    private String path;
    private float size;

    public static Spritesheet blocks = new Spritesheet("textures/spritesheets/blocks.png", 8);

    public Spritesheet(String path, float size) {
        this.path = path;
        this.size = 1 / size;
        load();
    }

    private void load() {
        texture = Texture.loadTexture(path);
    }

    public void bind() {
        texture.bind();
    }

    public void unbind() {
        texture.unbind();
    }

    public void cleanup() {
        texture.cleanup();
    }

    public float uniformSize() {
        return size;
    }

}
