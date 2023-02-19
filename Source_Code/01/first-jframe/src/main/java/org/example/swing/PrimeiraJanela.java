package org.example.swing;

import javax.swing.JFrame;

public class PrimeiraJanela {

	public static void main(String[] args) {
	
		//Cria a janela com o titulo primeira moldura
		JFrame j = new JFrame("Primeira janela");
		
		//configura o tamanho da janela
		j.setSize(300, 250);
		
		//configura a visibilidade como true, ou seja, visivel
		j.setVisible(true);
	}
}
