package com.masonorovic.cruiser.utilities.assests;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.graphics.Texture;

import java.util.HashMap;

public class CarAssetDescriptors {
    public static final HashMap<String, AssetDescriptor<Texture>> bodyDescriptors = new HashMap<String, AssetDescriptor<Texture>>() {{
        put("tsupramkiv", new AssetDescriptor<>(CarAssets.BODY_TSUPRAMKIV, Texture.class));
    }};
}
