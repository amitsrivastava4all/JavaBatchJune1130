package com.bmpl.dave;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements GameConstant{
	Image bg;
	Player player;
	Timer timer;
	Camera camera;
	Enemy enemies[] = new Enemy[MAX_ENEMY];
	public void prepareEnemy(){
		Image img;
		int gap = 0;
		for(int i = 0 ; i<enemies.length; i++){
			if(i%2==0){
				img = new ImageIcon(Board.class.getResource("dragon.gif")).getImage();
			}
			else
			{
				img = new ImageIcon(Board.class.getResource("fly.gif")).getImage(); 
			}
			enemies[i] = new Enemy(GAME_WIDTH + gap, img);
			gap += 400;
		}
	}
	
	public Board(){
		setSize(GAME_WIDTH,GAME_HEIGHT);
		player = new Player();
		//bg  = new ImageIcon(Board.class.getResource(BG_IMG)).getImage();
		camera = new Camera();
		setFocusable(true);
		bindEvents();
		prepareEnemy();
		gameLoop();
		
	}
	
	private void drawEnemies(Graphics g){
		for(Enemy enemy : enemies){
			enemy.drawEnemy(g);
			enemy.move();
		}
	}
	
	private void bindEvents(){
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode()==KeyEvent.VK_F){
					player.setFireAttack();
				}
				if(e.getKeyCode()==KeyEvent.VK_SPACE){
					player.fire();
				}
				if(e.getKeyCode()==KeyEvent.VK_RIGHT){
					camera.right();
					//camera.move();
					//player.setSpeed(10);
					//player.move();
				}
				if(e.getKeyCode()==KeyEvent.VK_LEFT){
					camera.left();
					//camera.move();
					//player.setSpeed(-10);
					//player.move();
				}
				if(e.getKeyCode()==KeyEvent.VK_UP){
					player.jump();
				}
			}
		});
	}
	
	private void gameLoop(){
		timer= new Timer(GAME_SPEED, (e)->{
				repaint();
				player.fall();
				checkCollision();
				score();
		});
		timer.start();
	}
	
	public boolean alternateIsCollision(Player player, Enemy enemy){
		Rectangle one = new Rectangle(player.getX(), player.getY(), player.getW(), player.getH());
		Rectangle two = new Rectangle(enemy.getX(), enemy.getY(), enemy.getW(), enemy.getH());
		return one.intersects(two);
	}
	
	public boolean isCollision(Player player, Enemy enemy){
		int xDistance = Math.abs(player.getX()- enemy.getX());
		int yDistance = Math.abs(player.getY()- enemy.getY());
		int width = Math.max(player.getW(), enemy.getW());
		int height = Math.max(player.getH(), enemy.getH());
		//return xDistance<=enemy.getW()-40 && yDistance<=enemy.getH()-40;
		return xDistance<=width-40 && yDistance<=height-40;
	}
	
	int counter;
	private void score(){
		counter++;
		
	}
	
	boolean isGameOver = false;
	public void checkCollision(){
		for(Enemy enemy: enemies){
			if(isCollision(player, enemy)){
				isGameOver = true;
				//repaint();
				//timer.stop();
			}
		}
	}
	
	public void drawBullets(Graphics g){
		for(Bullet bullet : player.getBulletList()){
			if(bullet.isVisible()){
			bullet.drawBullet(g);
			}
		}
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		camera.drawBG(g);
		//drawBackGround(g);
//		if(isGameOver){
//			gameOver(g);
//			return;
//		}
		player.drawPlayer(g);
		drawBullets(g);
		drawEnemies(g);
		g.setColor(Color.RED);
		g.drawString("Score "+counter, GAME_WIDTH-200, 70);
	}
	
	public void gameOver(Graphics g){
		g.setColor(Color.RED);
		g.setFont(new Font("Arial",Font.BOLD,40));
		g.drawString("Game Over", GAME_WIDTH/2, GAME_HEIGHT/2);
	}
	
//	public void drawBackGround(Graphics g){
//		g.drawImage(bg, 0, 0, GAME_WIDTH, GAME_HEIGHT, null);
//	}
}
