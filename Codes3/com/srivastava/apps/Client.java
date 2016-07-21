package com.srivastava.apps;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Client extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private Socket socket ;
	final int PORT = 9001;
	final String SERVER_IP = "localhost";
	DataInputStream input ;
	DataOutputStream output;
	JTextArea textArea = new JTextArea();
	
	void initialize() throws IOException{
		socket = new Socket (SERVER_IP,PORT);
		
		input =new DataInputStream(socket.getInputStream());
		output = new DataOutputStream(socket.getOutputStream());
	}
	
	void recMessage() throws IOException{
		String message = "";
		while(!message.equalsIgnoreCase("exit")){
			message = input.readUTF();
			textArea.setText(textArea.getText()+"\nServer :: "+message);
		}
	}
	private void sendMessage(){
		String message = textField.getText();
		try {
			output.writeUTF(message);
			textArea.setText(textArea.getText()+"\nClient :: "+message);
			textField.setText("");
			textField.requestFocus();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Launch the application.
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
					Client frame = new Client();
					frame.setVisible(true);
					frame.initialize();
					frame.recMessage();
				
	
	}

	/**
	 * Create the frame.
	 */
	public Client() {
		setTitle("Client");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 6, 469, 255);
		contentPane.add(scrollPane);
		
		
		scrollPane.setViewportView(textArea);
		
		JLabel lblTypeMessageTo = new JLabel("Type Message to Send");
		lblTypeMessageTo.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblTypeMessageTo.setBounds(16, 262, 240, 25);
		contentPane.add(lblTypeMessageTo);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		textField.setBounds(16, 286, 469, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSend = new JButton("Send");
		btnSend.setMnemonic('S');
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			sendMessage();
			}
		});
		btnSend.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btnSend.setBounds(362, 326, 117, 29);
		contentPane.add(btnSend);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.setBounds(249, 327, 117, 29);
		contentPane.add(btnNewButton);
	}
}
