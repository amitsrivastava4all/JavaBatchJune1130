package com.srivastava.apps;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.List;
import java.awt.Choice;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JScrollPane;

public class FileBrowser extends JFrame {
	List list = new List();
	private JPanel contentPane;
	File selectedFile ;
	JTextArea textArea = new JTextArea();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					FileBrowser frame = new FileBrowser();
					frame.setVisible(true);
		
	}
	
	private void applyFilter(String extension){
		list.clear();
		extension = extension.substring(1);
		File files [] = ScanDemo.getFiles(selectedFile, extension);
		if(files.length>0){
			for(File file : files){
				list.add(file.getPath());
			}
		}
	}
	
	private void openDialog(){
		JFileChooser fileChooser =new JFileChooser("/Users/amit/Documents");
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		fileChooser.showOpenDialog(this);
		selectedFile= fileChooser.getSelectedFile();
		System.out.println("Selected File is "+selectedFile.getPath());
		File files [] = ScanDemo.getFiles(selectedFile, null);
		if(files.length>0){
			for(File file : files){
				list.add(file.getPath());
			}
		}
		//fileChooser.setVisible(true);
	}
	private void showColor(){
		Color c = JColorChooser.showDialog(this, "My Color-2016", Color.RED);
		this.getContentPane().setBackground(c);
	}
	private void printFile(String filePath){
		try {
			String fileContent = FileReadDemo.readFile(filePath);
			textArea.setText(fileContent);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * Create the frame.
	 */
	public FileBrowser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openDialog();
			}
		});
		btnBrowse.setBounds(24, 23, 117, 29);
		contentPane.add(btnBrowse);
		
		JButton btnAddColor = new JButton("Add Color");
		btnAddColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			showColor();
			}
		});
		btnAddColor.setBounds(138, 23, 117, 29);
		contentPane.add(btnAddColor);
		list.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				printFile(list.getSelectedItem());
			}
		});
		
		
		list.setBounds(34, 58, 262, 288);
		contentPane.add(list);
		
		Choice choice = new Choice();
		choice.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				applyFilter(choice.getSelectedItem());
			}
		});
		choice.add("*.txt");
		choice.add("*.mp3");
		choice.add("*.jpg");
		choice.add("*.gif");
		choice.add("*.html");
		choice.setBounds(44, 352, 151, 27);
		contentPane.add(choice);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(332, 36, 355, 367);
		contentPane.add(scrollPane);
		scrollPane.getViewport().add(textArea);
		
		textArea.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		textArea.setBounds(348, 36, 323, 367);
		//contentPane.add(textArea);
	}
}
