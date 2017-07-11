package com.bmpl.dave;

import java.awt.Color;
import java.awt.Graphics;

public class Bullet extends Sprite implements GameConstant {
	private boolean isVisible;
	public Bullet(int x,int y){
		this.x = x;
		this.y = y;
		this.w = this.h = 10;
		this.speed = 10;
		this.isVisible = true;
	}
	
	
	public boolean isVisible() {
		return isVisible;
	}


	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}


	public void drawBullet(Graphics g){
		g.setColor(Color.BLACK);
		g.fillOval(x,y,w,h);
		move();
	}
	public void move(){
		x+=speed;
		outOfscreen();
	}
	public void outOfscreen(){
		if(x>GAME_WIDTH){
			isVisible = false;
		}
	}
}
