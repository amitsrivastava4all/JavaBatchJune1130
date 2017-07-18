package com.bmpl.dave;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

import javax.imageio.ImageIO;

public class Camera implements GameConstant {
	BufferedImage bi;
	int speed;
	int x;
	int y;
	public void move(){
		x+=speed;
	}
	public void left(){
		if(x>10){
		speed = -10;
		move();
		}
	}
	public void right(){
		try {
			System.setOut(new PrintStream(new File("/Users/amit/Documents/logs/test.txt")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("X is "+x+" "+(1280-GAME_WIDTH));
		if(x<(1280-(GAME_WIDTH))){
			speed  = 10;
			move();
		}
	}
	public void drawBG(Graphics g){
		BufferedImage subI = bi.getSubimage(x, y, GAME_WIDTH, GAME_HEIGHT);
		g.drawImage(subI,0,0,GAME_WIDTH,GAME_HEIGHT,null);
	}
	public Camera(){
		
			
		try {
			bi  = ImageIO.read(Camera.class.getResource(BG_IMG));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Background not found ");
			//e.printStackTrace();
		}
		
		}
	
}
