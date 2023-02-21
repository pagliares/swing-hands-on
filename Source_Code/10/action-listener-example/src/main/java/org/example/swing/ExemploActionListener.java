package org.example.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //interface ouvinte
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ExemploActionListener implements ActionListener {

    private JButton btn1;
    private JButton btn2;
    private JFrame frame;

    public ExemploActionListener(String titulo) {
        frame = new JFrame(titulo); //cria a janela
    } 

    public void configurarJanela() {
        //seta o layout da janela
        frame.setLayout(new FlowLayout());
        //cria os dois botoes
        btn1 = new JButton("Primeiro");
        //registra o ouvinte para o botão btn1
        btn1.addActionListener(this);
        frame.add(btn1); //adiciona a janela
        btn2 = new JButton("Segundo");
        //registra o ouvinte para o botão btn2
        btn2.addActionListener(this);
        frame.add(btn2); //adiciona a janela
        frame.pack(); //calcula o tamanho da janela
        frame.setVisible(true); //torna visível
    }  

    public void actionPerformed(ActionEvent evento) {
        //exibe o rotulo do botao clicado
        JOptionPane.showMessageDialog(null, evento.getActionCommand());
    } //fim do tratador de eventos

    public static void main(String[] Args) {
        ExemploActionListener janela = new ExemploActionListener("Tratando Eventos");
        janela.configurarJanela();  
    }  
}  