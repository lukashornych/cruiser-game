package com.masonorovic.cruiser;

import com.badlogic.gdx.Game;
import com.masonorovic.cruiser.screens.GameWorldScreen;

public class Cruiser extends Game {

	@Override
	public void create () {
		setScreen(new GameWorldScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}

	@Override
	public void dispose() {

	}
}
