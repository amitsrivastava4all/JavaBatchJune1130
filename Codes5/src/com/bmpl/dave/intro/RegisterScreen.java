package com.bmpl.dave.intro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.bmpl.common.dto.UserDTO;
import com.bmpl.game.demo.FileOperations;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterScreen extends JFrame {
	JLabel strongweaklbl = new JLabel("hfhgfg");
	private JPanel contentPane;
	private JTextField userTxt;
	private JPasswordField passwordField;
	JRadioButton rdbtnMale = new JRadioButton("Male");
	JRadioButton rdbtnFemale = new JRadioButton("Female");
	JComboBox comboBox = new JComboBox();
	JTextArea textArea = new JTextArea();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					RegisterScreen frame = new RegisterScreen();
					frame.setVisible(true);
			
	}

	/**
	 * Create the frame.
	 */
	public RegisterScreen() {
		setResizable(false);
		setTitle("Register Screen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 463, 441);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserid = new JLabel("Userid");
		lblUserid.setBounds(21, 35, 61, 16);
		contentPane.add(lblUserid);
		
		userTxt = new JTextField();
		userTxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					passwordField.requestFocus();
				}
			}
		});
		userTxt.setBounds(94, 30, 182, 26);
		contentPane.add(userTxt);
		userTxt.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(21, 84, 83, 16);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('#');
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				checkWeakStrongPwd();
			}
		});
		passwordField.setBounds(94, 79, 172, 26);
		contentPane.add(passwordField);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(21, 131, 61, 16);
		contentPane.add(lblGender);
		ButtonGroup bg = new ButtonGroup();
		
		bg.add(rdbtnMale);
		rdbtnMale.setBounds(93, 127, 74, 23);
		
		contentPane.add(rdbtnMale);
		
		
		bg.add(rdbtnFemale);
		rdbtnFemale.setBounds(183, 127, 93, 23);
		contentPane.add(rdbtnFemale);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(21, 188, 61, 16);
		contentPane.add(lblCountry);
		
		
		comboBox.addItem("Select Country");
		comboBox.addItem("India");
		comboBox.addItem("Srilanka");
		comboBox.setBounds(107, 184, 125, 27);
		contentPane.add(comboBox);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(21, 241, 61, 16);
		contentPane.add(lblAddress);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doRegister();
			}
		});
		btnRegister.setToolTipText("Click to Register");
		btnRegister.setBounds(20, 366, 117, 29);
		contentPane.add(btnRegister);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(136, 366, 117, 29);
		contentPane.add(btnClear);
		strongweaklbl.setBackground(Color.CYAN);
		
		
		strongweaklbl.setBounds(278, 84, 125, 16);
		contentPane.add(strongweaklbl);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(100, 229, 228, 121);
		contentPane.add(scrollPane);
		
		
		scrollPane.setViewportView(textArea);
	}
	
	private void doRegister(){
		String userid  = userTxt.getText();
		String pwd = passwordField.getText();
		String gender = "";
		if(rdbtnMale.isSelected()){
			gender = "Male";
		}
		else
		if(rdbtnFemale.isSelected()){
			gender = "Female";
		}
		String city = (String)comboBox.getSelectedItem();
		String address = textArea.getText();
		// Fill all the values in DTO
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(userid);
		userDTO.setPassword(pwd);
		userDTO.setAddress(address);
		userDTO.setCity(city);
		userDTO.setGender(gender);
		try {
			String message = FileOperations.storeObjectInFile(userDTO);
			JOptionPane.showMessageDialog(this, message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "Can't Register there is some problem");
		}
	}
	
	private void checkWeakStrongPwd(){
		String data = passwordField.getText();
		if(data.length()<5){
			strongweaklbl.setBackground(Color.RED);
			strongweaklbl.setForeground(Color.BLACK);
			strongweaklbl.setText("Weak");
		}
		else
			if(data.length()>=5 && data.length()<=10){
				strongweaklbl.setBackground(Color.YELLOW);
				strongweaklbl.setForeground(Color.BLACK);
				strongweaklbl.setText("Average");
			}
			else
				if(data.length()>10 ){
					strongweaklbl.setBackground(Color.GREEN);
					strongweaklbl.setForeground(Color.BLACK);
					strongweaklbl.setText("Strong");
				}	
	}
}
