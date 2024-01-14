package game;

/*
 * Arielle Tetelbaum
 * 2023/01/28
 * Ball/player class for Slider (final project game)
 */

import java.awt.Color;

class PlayerBall {
	int x,y;
	int vx = 3;
	int vy = 3;
	int size = 20;
	Color c = new Color(240, 144, 144);

	//Constructor
	PlayerBall() {
		vx = vy = 3;
		x = 1;
		y = 30;
	}

	public boolean contains(PlayerBall player) {
		return false;
	}
}
