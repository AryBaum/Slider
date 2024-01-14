package game;

/*
 * Arielle 
 * 2023/01/28
 * Final project game
 * 		- only two levels
 * 		- not completely refined (I could make it better but that would require more time)
 * 		- to get the 1 and 0 for the boolean map1, I used a method created player.y Ben (it is commented below if you are interested) 
 */

import java.awt.Color;

import hsa2.GraphicsConsole;

public class Slider {

	public static void main(String[] args) {
		new Slider().runGame();
	}

	//17 player.y 32
	final static int WINW = 374;
	final static int WINH = 704;
	GraphicsConsole gc = new GraphicsConsole(WINW, WINH, "Slider - Map 1 - Level 1");
	int[][] map1 = {{0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0},
					{1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0},
					{0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0},
					{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0},
					{0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1},
					{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0},
					{1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
					{0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
			};
	int[][] map2 = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
					{0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0},
					{0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
			};
	
	int[][] map3 = {{0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0},
					{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
					{0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
					{0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
					{0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
					{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1},
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0},
			};
	
	
	//22 pixels for each square
	final static int SIZE = 22;
	
	//Dimensions of map1
	static final int mapH = 32;
	static final int mapW = 17;
	
	//check what axis the ball is moving on
	int axis = 0;
	
	//direction (can only be +1 or -1) used for moving ball
	int dir = 0;

	//endpoint/win block cords
	int endx = 15;
	int endy = 30;
	
	PlayerBall player; 
	int lvl = 0;

	//SETUP-------------------------------------------------------------------------------------------------------------------------------------------------
	Slider() {
		gc.setLocationRelativeTo(null);
		gc.setAntiAlias(true);
		gc.setBackgroundColor(new Color (213, 237, 214));
		gc.clear();
		player = new PlayerBall();
	}


	//Game run---------------------------------------------------------------------------------------------------------------
	void runGame() {
		gc.showDialog("- Use WASD or ARROW keys to move the ball \n - Your goal is to reach the endpoint (blue block) \n - If you make a wrong move causing the ball to move off the \n   screen, you will restart the level \n - There are two levels, have fun!", "How to play");
		while(true) {	
			//main game loop
			checkEndPoint();
			if(gc.getKeyCode() >= 37) {
				movePlayer();
			}
			drawGraphics();
			gc.sleep(10);
		}
	}	
	
	//MOVING THE BALL---------------------------------------------------------------------------------------------------------------------------------------
	void movePlayer() {
		
		//get the keys pressed-----------------------------------------------------------------
		if (gc.getKeyCode() == 'A' || gc.getKeyCode() == 37) {
			axis = 0; dir = -1;
		}
		if (gc.getKeyCode() == 'W' || gc.getKeyCode() == 38) {
			axis = 1; dir= -1;
		}
		if (gc.getKeyCode() == 'D' || gc.getKeyCode() == 39) {
			axis = 0; dir= 1;
		}
		if (gc.getKeyCode() == 'S'|| gc.getKeyCode() == 40) {
			axis = 1; 
			dir = 1;
		}

		//Y AXIS MOVEMENT (Up and down)-------------------------------------------------------
		if(axis == 1 && lvl < 2)	
		{
			for (int i = player.y; i < mapH; i+=dir) {
				checkWall(i, 31);
				if(i+dir >= 0 && i+dir < mapH && map1[player.x][i+dir] == 0) {
					player.y+=dir;
					drawGraphics();
					gc.sleep(5);
				}
				else {
					break;
				}
			}
		}

		//X AXIS MOVEMENT (Left and right)-----------------------------------------------------
		if(axis == 0 && lvl < 2) 
		{
			for (int i = player.x; i < mapW; i+=dir) {
				checkWall(i, 16);
				if(i+dir >= 0 && i+dir < mapW && map1[i+dir][player.y] == 0) {
					player.x+=dir;
					drawGraphics();
					gc.sleep(5);
				}
				else {
					break;
				}
			}
		}
		
		
		if(axis == 1 && lvl >= 2 && lvl < 5 )	
		{
			for (int i = player.y; i < mapH; i+=dir) {
				checkWall(i, 31);
				if(i+dir >= 0 && i+dir < mapH && map2[player.x][i+dir] == 0) {
					player.y+=dir;
					drawGraphics();
					gc.sleep(5);
				}
				else {
					break;
				}
			}
		}

		//X AXIS MOVEMENT (Left and right)-----------------------------------------------------
		if(axis == 0 && lvl >= 2 && lvl < 5) 
		{
			for (int i = player.x; i < mapW; i+=dir) {
				checkWall(i, 16);
				if(i+dir >= 0 && i+dir < mapW && map2[i+dir][player.y] == 0) {
					player.x+=dir;
					drawGraphics();
					gc.sleep(5);
				}
				else {
					break;
				}
			}
		}
		
		if(axis == 1 && lvl >= 5)	
		{
			for (int i = player.y; i < mapH; i+=dir) {
				checkWall(i, 31);
				if(i+dir >= 0 && i+dir < mapH && map3[player.x][i+dir] == 0) {
					player.y+=dir;
					drawGraphics();
					gc.sleep(5);
				}
				else {
					break;
				}
			}
		}

		//X AXIS MOVEMENT (Left and right)-----------------------------------------------------
		if(axis == 0 && lvl >= 5) 
		{
			for (int i = player.x; i < mapW; i+=dir) {
				checkWall(i, 16);
				if(i+dir >= 0 && i+dir < mapW && map3[i+dir][player.y] == 0) {
					player.x+=dir;
					drawGraphics();
					gc.sleep(5);
				}
				else {
					break;
				}
			}
		}
	}

	/******************THIS IS A METHOD THAT WAS USED TO TRANSFORM THE COORDINATES OF THE BLOCKS INTO 1 AND 0*******************/
	//	

	//void format2DBooleanArray(String name, boolean[][] array) {
	//		// method player.y Obsidian_Seal | pinniped.page
	//		System.out.println("boolean[][] " + name + " = {");
	//
	//		for (int i = 0; i < array.length; i++) {
	//			System.out.print("\t{");
	//			for (int j = 0; j < array[0].length; j++) {
	//				System.out.print(array[i][j]);
	//				if (j != array[0].length - 1) System.out.print(", ");
	//			}
	//			System.out.println("},");
	//		}
	//		System.out.println("};");
	//	}

	//Method if ball reaches endpoint--------------------------------------------------------------------------------------------
	void checkEndPoint() {
		
			if (player.x==endx && player.y==endy && lvl ==0) {
			gc.showDialog("Great job! Click OK to start a harder level", "Map 1, Level 1 Complete"); 
			gc.clear();
			endx = 15;
			endy = 1;
			player.x = 1;
			player.y = 30;
			gc.setTitle("Slider - Level 2");
			lvl++;
			System.out.println(lvl);
		}
		if (player.x==endx && player.y==endy && lvl ==1) {
			gc.showDialog("Wow... that took so long. Let's try another Map", "Map 1, Level 2 Complete"); 
			gc.clear();
			endx = 4;
			endy = 22;
			player.x = 8;
			player.y = 30;
			gc.setTitle("Slider - Map 2 - Level 1");
			lvl++; 
			System.out.println(lvl);
		}
		
		if (player.x==endx && player.y==endy && lvl ==2) {
			gc.showDialog("That one was easy. Wanna try a hard one?", "Map 2, Level 1 Complete"); 
			gc.clear();
			endx = 13;
			endy = 25;
			player.x = 8;
			player.y = 30;
			gc.setTitle("Slider - Map 2 - Level 2");
			lvl++; 
			System.out.println(lvl);
		}
		
		if (player.x==endx && player.y==endy && lvl ==3) {
			gc.showDialog("Nice! Do you still want to contiue?", "Map 2, Level 2 Complete"); 
			gc.clear();
			endx = 15;
			endy = 1;
			player.x = 8;
			player.y = 30;
			gc.setTitle("Slider - Map 2 - Level 3");
			lvl++; 
			System.out.println(lvl);
		}
		
		if (player.x==endx && player.y==endy && lvl ==4) {
			gc.showDialog("Damnnn took a bit. Next map?", "Map 2, Level 3 Complete"); 
			gc.clear();
			endx = 4;
			endy = 12;
			player.x = 8;
			player.y = 1;
			player.c = new Color(171, 219, 236);
			gc.setTitle("Slider - Map 3 - Level 1");
			lvl++; 
			System.out.println(lvl);
		}
		
		if (player.x==endx && player.y==endy && lvl ==5) {
			gc.showDialog("Nice! Do you still want to contiue?", "Map 2, Level 3 Complete"); 
			gc.clear();
			endx = 15;
			endy = 1;
			player.x = 8;
			player.y = 30;
			gc.setTitle("Slider - Map 2 - Level 5");
			lvl++; 
			System.out.println(lvl);
		}
	}

	//draw all graphics---------------------------------------------------------------------------------------------------------
	void drawGraphics() {
		synchronized(gc) {
			gc.clear();
			gc.setColor(player.c);
			gc.fillOval(player.x*SIZE, player.y*SIZE, player.size, player.size);

			for (int i = 0; i < 32; i++) {
				for (int j = 0; j < 17; j++) {
					gc.setColor(new Color(62, 160, 85));
					if (lvl < 2 && map1[j][i] == 1) gc.fillRect(j * SIZE, i * SIZE, SIZE, SIZE);
					if (lvl >= 2 && lvl < 5 && map2[j][i] == 1) {
						gc.setBackgroundColor(new Color(209, 207, 226));
						gc.setColor(new Color(155, 109, 198));
						gc.fillRect(j * SIZE, i * SIZE, SIZE, SIZE);
					}
					if (lvl >= 5 && map3[j][i] == 1) {
						gc.setBackgroundColor(new Color(254, 201, 201));
						gc.setColor(new Color(249, 102, 94));
						gc.fillRect(j * SIZE, i * SIZE, SIZE, SIZE);
					}
				}
			}

			
			gc.setColor(new Color(126, 196, 207));
			gc.fillRect(endx * SIZE, endy * SIZE, SIZE, SIZE);
		}
	}


	//Reset if ball goes out of bounds--------------------------------------------------------------------------------------
	void checkWall(int place, int ax) {
		if(place + dir > ax || place + dir < 0) {
			gc.showDialog("Retry", "Level Failed");
			if(lvl < 2) {
				player.x = 1;
				player.y = 30;
			}
			if(lvl >= 2 && lvl < 5) {
				player.x = 8;
				player.y = 30;
			}
			if(lvl >= 5) {
				player.x = 8;
				player.y = 1;
			}
		}
	}
}

