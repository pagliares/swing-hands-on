package org.example.swing;

import javax.swing.JFrame;

public class SegundaJanela extends JFrame  {

	//construtor
	public SegundaJanela(){
		
		//informa à superclasse o titulo da janela
		super("Segunda Janela");
		
		//configura o tamanho da janela
		this.setSize(300, 250);
		
		//indica a visibilidade da janela
		this.setVisible(true);
		
	}//fim do construtor
	
	public static void main(String [] args) {
	    JFrame janela = new SegundaJanela( );
	}
	
} 
