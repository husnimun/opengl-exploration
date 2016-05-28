package models;

import textures.ModelTexture;

/**
 * Created by Husni on 28/05/2016.
 */
public class TexturedModel {
    private RawModel rawModel;
    private ModelTexture texture;

    public TexturedModel(RawModel rawModel, ModelTexture texture) {
        this.rawModel = rawModel;
        this.texture = texture;
    }

    public RawModel getRawModel() {
        return rawModel;
    }

    public ModelTexture getTexture() {
        return texture;
    }
}
