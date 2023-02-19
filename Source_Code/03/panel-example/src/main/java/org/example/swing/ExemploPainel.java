package org.example.swing;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExemploPainel {
	private JFrame jFrame;
	private JPanel jPanel;
	
	public ExemploPainel(String titulo){	
		jFrame = new JFrame(titulo); //cria a janela com o titulo fornecido
		jPanel = new JPanel();

	} 
	
	public void configurarJanela(){
		
		// configura o tamanho da janela 
		jFrame.setSize(300, 200);

		// desabilita o layout default
		jFrame.setLayout(null);
		
		// configura o tamanho do painel
		jPanel.setSize(100,100);
		// configura a cor de fundo
		jPanel.setBackground(Color.RED);
		
		//adiciona o painel à janela
		jFrame.add(jPanel);
		//Torna a janela visível
		jFrame.setVisible(true);	
	} 

	public static void main(String[] args) {
		ExemploPainel ep = new ExemploPainel("Adicionado um painel");	
		ep.configurarJanela();		
	}
}
