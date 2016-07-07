import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

// Screen = JFrame
class FirstFrame extends JFrame {
	JButton ok =new JButton("Ok");
	JButton cancel =new JButton("Cancel");
	FirstFrame(){
		this.setTitle("My First Screen - 2016");
		this.setSize(300, 300); // width , height (Pixel)
		// By Default BorderLayout
		//this.getContentPane().setLayout(new FlowLayout());
		this.getContentPane().setLayout(null); // No Layout
		this.getContentPane().add(ok);
		// Listener are the Predefine interfaces in Java
		// Listener Listen the Events 
		// And Developer Implements the Listener and override the method
		
		// When Click Event Happen , ActionListener Will Listen that Event
		ActionListener l = new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(FirstFrame.this, "U Click on Ok");
			}
		};
		ok.addActionListener(l); // Register Listener on Button
		ActionListener l2 = new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(FirstFrame.this, "U Click on Cancel");
			}
		};
		cancel.addActionListener(l2);
		
		this.getContentPane().add(cancel);
		ok.setBounds(10, 20, 70, 50);
		cancel.setBounds(10, 80, 70, 50);
		this.setVisible(true);
		this.setLocation(300, 100);
	}
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstFrame obj = new FirstFrame();
		
		
		

	}

}
