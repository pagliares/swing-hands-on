package org.example.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ExemploMouseListener implements ActionListener, MouseListener {
    private JButton btn2;
    private JButton btn1;
    private JFrame frame;
    
    public ExemploMouseListener() {
        frame = new JFrame("Exemplo de Tratadores de Eventos do Mouse");
        btn1 = new JButton("Primeiro");
        btn2 = new JButton("Segundo");
    }
    
    public void configurarJanela() {
        //seta o layout da janela
        frame.setLayout(new FlowLayout());
        //cria os dois botoes
        btn1 = new JButton("Primeiro");
        //registra ouvintes para o botao btn1
        btn1.addActionListener(this);
        btn1.addMouseListener(this);
        frame.add(btn1); //adiciona a janela
        btn2 = new JButton("Segundo");
        //registra ouvintes para o botao btn2
        btn2.addActionListener(this);
        btn2.addMouseListener(this);
        frame.add(btn2); //adiciona a janela
        frame.pack(); //calcula o tamanho da janela
        frame.setVisible(true); //torna visivel
    }  
    
    @Override
    public void mouseEntered(MouseEvent e) { 
        //obtem a referencia do componente que gerou o evento
        Object obj = e.getSource();
        if (obj == btn1) {
            //muda o rotulo do botao primeiro para entrou
            btn1.setText("Entrou");
        } else {
            //muda o rotulo do botao segundo para entrou
            btn2.setText("Entrou");
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
   
        //obtem a referencia do componente que gerou o evento
        Object obj = e.getSource();

        if (obj == btn1) {
            //muda o rotulo do botao primeiro para Saiu
            btn1.setText("Saiu");
         } else {
            //muda o rotulo do botao segundo para Saiu
             btn2.setText("Saiu");
        }
    } 

    @Override
    public void mousePressed(MouseEvent arg0) {
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
    }

    public void actionPerformed(ActionEvent e) {
         //exibe o rotulo do botao clicado
        JOptionPane.showMessageDialog(null, e.getActionCommand());
    }
    
    public static void main(String[] args){
        ExemploMouseListener e = new ExemploMouseListener();
        e.configurarJanela();    
    }
} 