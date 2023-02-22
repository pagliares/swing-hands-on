package org.example.swing;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class FechaJFrame1 {
    private JFrame janela;

    public FechaJFrame1() {
        janela = new JFrame("Fechando o JFrame");
        janela.setSize(300, 200);
        janela.setVisible(true);
        janela.addWindowListener(new TratadorJanela());           
       
    }
    
    public static void main (String[] args){
        FechaJFrame1 f = new FechaJFrame1();
    }
    
    class TratadorJanela extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
    }
}