package com.bmpl.dave;

import java.awt.Graphics;
import java.awt.Image;

public class Enemy extends Sprite implements GameConstant {
	int orgPos ;
	public Enemy(int x, Image img){
		this.orgPos = this.x = x;
		this.h = this.w = 100;
		this.y = FLOOR - h;
		
		this.speed = -10;
		this.img = img;
	}
	public void drawEnemy(Graphics g){
		g.drawImage(img, x, y, w, h, null);
	}
	public void move(){
		x+=speed;
		outOfScreen();
	}
	public void outOfScreen(){
		if(x<=0){
			x = orgPos;
		}
	}
}
