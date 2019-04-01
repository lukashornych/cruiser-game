package com.masonorovic.cruiser.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.masonorovic.cruiser.Cruiser;
import com.masonorovic.cruiser.objects.car.Car;
import com.masonorovic.cruiser.utilities.assests.CarAssetDescriptors;
import com.masonorovic.cruiser.utilities.car.CarLoader;

public class GameWorldScreen implements Screen {
    private final Cruiser game;
    private final AssetManager assetManager;
    private final CarLoader carLoader;

    private SpriteBatch spriteBatch;

    private Car car;
    private Texture carBodyTexture;

    public GameWorldScreen(Cruiser game) {
        this.game = game;

        assetManager = new AssetManager();
        carLoader = new CarLoader();
        spriteBatch = new SpriteBatch();

        loadGameWorld();
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        spriteBatch.begin();
        spriteBatch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        assetManager.dispose();
        spriteBatch.dispose();
    }

    private void loadGameWorld() {
        car = carLoader.parseCarFile(Gdx.files.internal("cars_data/models/bm3e30.ccf").path());
        System.out.println("car was generated");
        initAssets();
    }

    private void loadAssets() {
        assetManager.load(CarAssetDescriptors.bodyDescriptors.get(car.getCodeName()));

        assetManager.finishLoading();
    }

    private void initAssets() {
        loadAssets();

        carBodyTexture = assetManager.get(CarAssetDescriptors.bodyDescriptors.get(car.getCodeName()));
    }
}
