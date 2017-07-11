package com.bmpl.dave.intro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.bmpl.dave.GameFrame;
import com.bmpl.dave.users.LoginScreen;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameMainMenu extends JFrame {
	public static JMenuItem mntmLogin = new JMenuItem("Login");
	public static JMenu mnGames = new JMenu("Games");
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					GameMainMenu frame = new GameMainMenu();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public GameMainMenu() {
		setTitle("GAMING CONSOLE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		
		mntmLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   doLogin();
			}
		});
		mntmLogin.setIcon(new ImageIcon(GameMainMenu.class.getResource("/com/bmpl/dave/intro/login.png")));
		mnFile.add(mntmLogin);
		
		JMenuItem mntmRegister = new JMenuItem("Register");
		mntmRegister.setIcon(new ImageIcon(GameMainMenu.class.getResource("/com/bmpl/dave/intro/register.png")));
		mnFile.add(mntmRegister);
		
		
		mnGames.setEnabled(false);
		mnGames.setIcon(new ImageIcon(GameMainMenu.class.getResource("/com/bmpl/dave/intro/game.png")));
		mnFile.add(mnGames);
		
		JMenuItem mntmMario = new JMenuItem("Mario");
		mnGames.add(mntmMario);
		
		JMenuItem mntmDave = new JMenuItem("Dave");
		mntmDave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			callDave();
			}
		});
		mnGames.add(mntmDave);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setIcon(new ImageIcon(GameMainMenu.class.getResource("/com/bmpl/dave/intro/exit.png")));
		mnFile.add(mntmExit);
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	
	private void callDave(){
		GameFrame gameFrame = new GameFrame();
		gameFrame.setVisible(true);
	}
	
	private void doLogin(){
		LoginScreen login = new LoginScreen();
		login.setVisible(true);
	}
}
