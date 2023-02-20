package org.example.swing;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExemploPainelDemo {

	public static void main(String[] args) {

		JFrame jFrame = new JFrame("Demo");
		jFrame.setSize(350, 250);
		// configura o layout da janela com 2 linhas e 1 coluna
		jFrame.setLayout(new GridLayout(2, 1));

		for (int i = 0; i < 2; i++) {
			JPanel jPanel = new JPanel();
			jPanel.setBackground(i == 0 ? Color.ORANGE : Color.CYAN);
			
			for (int j = 0; j < 3; j++) {
				jPanel.add(new JButton("Button" + j));
			} // fim do segundo for
			
			jFrame.add(jPanel);
		} // fim do primeiro

		jFrame.setVisible(true);
	} 
}  
