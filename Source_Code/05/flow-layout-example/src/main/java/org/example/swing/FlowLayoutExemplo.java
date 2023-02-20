package org.example.swing;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
public class FlowLayoutExemplo {
	
	private JButton btn1, btn2, btn3;
	private JFrame jFrame;
	
	public FlowLayoutExemplo(String titulo){
		//cria a janela como titulo informado
		jFrame = new JFrame(titulo);	
		//cria os tres botoes
		btn1 = new JButton("Primeiro");
		btn2 = new JButton("Segundo");	
		btn3 = new JButton("Terceiro");
 	} 
	
	public void configuraJanela(){
		//seta o layout da janela
		jFrame.setLayout(new FlowLayout());
		//adiciona os botoes
		jFrame.add(btn1);
		jFrame.add(btn2);
		jFrame.add(btn3);

 		//calcula o tamanho da janela em relacao aos componentes
		jFrame.pack();
		jFrame.setVisible(true);		
	} 
	
	public static void main(String[] args) {
		
		FlowLayoutExemplo janela = new FlowLayoutExemplo("Exemplo FlowLayout");
		janela.configuraJanela();
	} 
} 
