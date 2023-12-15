package com.desenquadros.edrop;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Drop extends Game {
	SpriteBatch batch;
	public BitmapFont font;

	public void create () {
		batch = new SpriteBatch();
		font = new BitmapFont();
		this.setScreen(new MainMenuScreen(this));
	}

	public void render () {
		super.render();

	}
	
	public void dispose () {
		batch.dispose();
		font.dispose();
	}
}
