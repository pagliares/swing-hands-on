package org.example.swing;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JTextFieldExample {
	private JFrame jFrame;
	private JTextField jTextField;
	private JLabel jLabel;
	
	public JTextFieldExample( ) {
		jFrame = new JFrame("JTextField Example");
		jFrame.setLayout(new FlowLayout());
		jLabel = new JLabel("Name");
		jTextField = new JTextField(30);
		jFrame.add(jLabel);
		jFrame.add(jTextField);
	    jFrame.setSize(510, 80);
	    jFrame.setResizable(false);
	    jFrame.setVisible(true);
	}

	public static void main(String[] args) {
		new JTextFieldExample( );
	}	 
}
