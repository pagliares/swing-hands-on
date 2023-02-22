package org.example.swing;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class FechaJFrame2 {
  private JFrame janela;

    public FechaJFrame2() {
        janela = new JFrame("Fechando o JFrame");
        janela.setSize(300, 200);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main (String[] args){
        FechaJFrame2 f = new FechaJFrame2();
    }
}
