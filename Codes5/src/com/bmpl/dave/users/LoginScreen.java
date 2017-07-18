package com.bmpl.dave.users;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.bmpl.common.dto.UserDTO;
import com.bmpl.dave.intro.GameMainMenu;
import com.bmpl.game.demo.FileOperations;

public class LoginScreen extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					LoginScreen frame = new LoginScreen();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public LoginScreen() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				askBeforeClose();
			}
		});
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 372, 259);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserid = new JLabel("Userid");
		lblUserid.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblUserid.setBounds(31, 49, 91, 38);
		contentPane.add(lblUserid);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblPassword.setBounds(31, 105, 118, 38);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(141, 58, 220, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(141, 114, 220, 26);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLogin();
			}
		});
		btnLogin.setBounds(32, 177, 117, 29);
		contentPane.add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(194, 177, 117, 29);
		contentPane.add(btnCancel);
	}
	private void askBeforeClose(){
		int choice = JOptionPane.showConfirmDialog(this, "Do u really want to close this window","Login",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		if(choice == JOptionPane.YES_OPTION){
			this.setVisible(false);
			this.dispose();
		}
		else
		if(choice == JOptionPane.NO_OPTION){
			return ;
		}
	}
	
	private void checkLogin(){
		String userid = textField.getText();
		String password = passwordField.getText();
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(userid);
		userDTO.setPassword(password);
		String message="";
		try {
			message = FileOperations.readObjectFromFile(userDTO);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "Can't Do Login Due to Some Problem");
			return;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "Can't Do Login Due to Some Problem");
			return ;
		}
		if(message.startsWith("Welcome")){
		//if(userid.equals(password)){
			JOptionPane.showMessageDialog(this, "Welcome "+userid);
			GameMainMenu.mnGames.setEnabled(true);
			GameMainMenu.mntmLogin.setEnabled(false);
			this.setVisible(false);
			this.dispose();
		}
		//}
		else{
			JOptionPane.showMessageDialog(this, "Invalid userid or Password ");
		}
	}
}
