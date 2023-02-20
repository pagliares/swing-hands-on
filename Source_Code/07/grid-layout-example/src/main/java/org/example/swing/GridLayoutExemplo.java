package org.example.swing;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class GridLayoutExemplo {

	private JButton btn1, btn2, btn3, btn4, btn5, btn6;
	private JFrame frame;	
	public GridLayoutExemplo(String titulo){
		frame = new JFrame(titulo);
	}
	
	public void configuraJanela(){
		// configura o layout da janela com duas linhas e 3 colunas
		frame.setLayout(new GridLayout(2,3));
		//cria os botoes
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		btn6 = new JButton("6");
		//adiciona os botoes
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		frame.add(btn6);
		// configura o tamanhho da janela
		frame.setSize(300, 200);
		frame.setVisible(true);
	} 
	public static void main(String[] args) {
		GridLayoutExemplo janela = new GridLayoutExemplo("GridLayout Exemplo");
		janela.configuraJanela();
	}
}
