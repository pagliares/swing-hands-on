package org.example.swing;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class BorderLayoutExemplo {

	private JButton btnNorte, btnSul, btnLeste, btnOeste, btnCentro;
	private JFrame frame;
	
	public BorderLayoutExemplo(String titulo){
		//cria a janela com o titulo fornecido
		frame = new JFrame(titulo);
		//cria os botoes
		btnNorte = new JButton("Norte");
		btnSul = new JButton("Sul");
		btnCentro = new JButton("Centro");
		btnLeste = new JButton("Leste");
		btnOeste = new JButton("Oeste");
	} 
	
	public void configuraJanela(){	
		// configura o layout com espacamento de 5 pixels
		frame.setLayout(new BorderLayout(5,5));
		//adiciona os botoes em suas respectivas posicoes
		frame.add(btnNorte, BorderLayout.NORTH);
		frame.add(btnSul, BorderLayout.SOUTH);
		frame.add(btnCentro, BorderLayout.CENTER);
		frame.add(btnOeste, BorderLayout.WEST);
		frame.add(btnLeste, BorderLayout.EAST);
		frame.setSize(300, 200);
		frame.setVisible(true);
	} 
	
	public static void main(String[] args) {
		BorderLayoutExemplo janela = new BorderLayoutExemplo("BorderLayout Exemplo");
		janela.configuraJanela();
	}
 
}
