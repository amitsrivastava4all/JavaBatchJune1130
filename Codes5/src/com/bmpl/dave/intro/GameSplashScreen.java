package com.bmpl.dave.intro;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class GameSplashScreen extends JWindow {

	private JProgressBar progressBar = new JProgressBar();
	private JLabel lblNewLabel = new JLabel("Game-2017");
	private JPanel contentPane;
	private Timer timer;
	private boolean isVisible;
	private int currentProgress;
	private void doAnimation(){
		timer = new Timer(5,(e)->{
			progressBar.setValue(currentProgress);
			currentProgress++;
			if(currentProgress>100){
				timer.stop();
				GameSplashScreen.this.setVisible(false);
				GameSplashScreen.this.dispose();
				GameMainMenu mainMenu = new GameMainMenu();
				mainMenu.setVisible(true);
			}
			lblNewLabel.setVisible(isVisible);
			isVisible = !isVisible;
		});
		timer.start();
	}
		
	
	public static void main(String[] args) {
		
					GameSplashScreen frame = new GameSplashScreen();
					frame.setVisible(true);
					UIManager.put("ProgressBar.background", Color.ORANGE);
					UIManager.put("ProgressBar.foreground", Color.RED);
					UIManager.put("ProgressBar.selectionBackground", Color.RED);
					UIManager.put("ProgressBar.selectionForeground", Color.GREEN);
					frame.doAnimation();
				
	}

	/**
	 * Create the frame.
	 */
	public GameSplashScreen() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize( 450, 382);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(84, 288, 249, 31);
		contentPane.add(lblNewLabel);
		
		JLabel gametitlelbl = new JLabel("");
		gametitlelbl.setBorder(new LineBorder(Color.MAGENTA, 3));
		gametitlelbl.setIcon(new ImageIcon(GameSplashScreen.class.getResource("/com/bmpl/dave/intro/giphy.gif")));
		gametitlelbl.setBounds(6, 6, 438, 267);
		contentPane.add(gametitlelbl);
		
		
		progressBar.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		progressBar.setStringPainted(true);
		progressBar.setBounds(6, 321, 438, 20);
		contentPane.add(progressBar);
		
		
	}
}
