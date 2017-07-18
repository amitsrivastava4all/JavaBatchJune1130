package com.bmpl.dave;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Player extends Sprite implements GameConstant,PlayerState {
	int acc;
	int currentState;
	ArrayList<Bullet> bulletList = new ArrayList<>();
	SpriteLoader sloader = new SpriteLoader();
	BufferedImage defaultMove[] = sloader.defaultMove();
	BufferedImage fireAttack[] = sloader.fireAttack();
	public Player(){
		currentState = DEFAULT_WALK;
		speed = 0;
		x = 166;
		h = w = 100;
		y = FLOOR - (h + 10);
		img = new ImageIcon(Player.class.getResource(PLAYER_IMG)).getImage();
	}
	
	public void fall(){
		if(y<(FLOOR-(h+10))){
			acc = acc + GRAVITY;
			y += acc;
		}
		if(y>=(FLOOR-(h+10))){
			y  =(FLOOR-(h+10));
			isJump = false;
		}
	}
	
	public void fire(){
		bulletList.add(new Bullet((x+w/2),(y+h/2)));
	}
	
	private boolean isJump;
	public void jump(){
		if(!isJump){
		 acc = -15;
		 y+=acc;
		isJump = true;
		}
	}
	
	public void move(){
		x +=speed;
	}
	
	
	
	public ArrayList<Bullet> getBulletList() {
		return bulletList;
	}

	public void setBulletList(ArrayList<Bullet> bulletList) {
		this.bulletList = bulletList;
	}
	public void setFireAttack(){
		currentState = FIRE_ATTACK;
		fireMove = 0;
		speed = 10;
	}
	public void drawPlayer(Graphics g){
		//g.drawImage(img, x, y, w, h, null);
		if(currentState == DEFAULT_WALK){
		drawDefaultImage(g);
		}
		else
		if(currentState==FIRE_ATTACK){	
		drawFireAttack(g);
		}
	}
	int fireMove = 0;
	public void drawFireAttack(Graphics g){
		g.drawImage(fireAttack[fireMove],x,y,w,h,null);
		fireMove++;
		move();
		if(fireMove>4){
			fireMove=0;
			speed = 0;
			currentState = DEFAULT_WALK;
			currentMove = 0;
		}
	}
	
	int currentMove = 0;
	public void drawDefaultImage(Graphics g){
		g.drawImage(defaultMove[currentMove],x,y,w,h,null);
		currentMove++;
		if(currentMove>3){
			currentMove=0;
		}
	}

}
