package com.bmpl.dave;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteLoader {
	BufferedImage img ;
	public SpriteLoader(){
		loadSpriteSheet();
	}
	
	public BufferedImage[] fireAttack(){
		BufferedImage bf[]  = new BufferedImage[5];
		bf[0] = img.getSubimage(116, 212, 59, 66);
		bf[1] = img.getSubimage(0, 162, 117, 34);
		bf[2] = img.getSubimage(0, 198, 112, 37);
		bf[3] = img.getSubimage(0, 237, 115, 33);
		bf[4] = img.getSubimage(184, 435, 39, 88);
		return bf;
		
		
	}
	
	public BufferedImage[] defaultMove(){
		BufferedImage bf[]  = new BufferedImage[4];
		bf[0] = img.getSubimage(70, 1, 69, 77);
		bf[1] = img.getSubimage(140, 1, 54, 81);
		bf[2] = img.getSubimage(0, 78, 86, 76);
		bf[3] = img.getSubimage(86, 83, 92, 79);
		return bf;
		
		
	}
	
	public void loadSpriteSheet(){
		try {
			img = ImageIO.read(SpriteLoader.class.getResource("bisonplayer.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
