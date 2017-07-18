package com.bmpl.dave.intro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import com.bmpl.dave.GameFrame;
import com.bmpl.dave.users.LoginScreen;

public class GameMainMenu extends JFrame {
	public static JMenuItem mntmLogin = new JMenuItem("Login");
	public static JMenu mnGames = new JMenu("Games");
	private JPanel contentPane;
	StringBuffer title;
	private String prepareTitle(){
		String title = "                                         "+this.getTitle();
		return title;
	}
	private Timer timer ;
	private void rotateTitle(){
		
		timer  = new Timer(100,(e)->{
			char singleChar = title.charAt(0);
			title.append(singleChar);
			title.deleteCharAt(0);
			//System.out.println("Title is "+title);
			GameMainMenu.this.setTitle(title.toString());
		});
		timer.start();
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					GameMainMenu frame = new GameMainMenu();
					frame.setVisible(true);
					frame.rotateTitle();
				
	}

	/**
	 * Create the frame.
	 */
	public GameMainMenu() {
		setTitle("GAMING CONSOLE");
		title = new StringBuffer(prepareTitle());
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
		mntmRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doRegister();
			}
		});
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
	private void doRegister(){
		RegisterScreen register = new RegisterScreen();
		register.setVisible(true);
	}
	
	private void doLogin(){
		LoginScreen login = new LoginScreen();
		login.setVisible(true);
	}
}
