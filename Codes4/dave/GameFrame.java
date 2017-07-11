package com.bmpl.dave;

import javax.swing.JFrame;



public class GameFrame extends JFrame implements GameConstant {
	public GameFrame(){
		setSize(GAME_WIDTH,GAME_HEIGHT);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle(TITLE);
		Board board = new Board();
		add(board);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameFrame obj = new GameFrame();

	}

}
