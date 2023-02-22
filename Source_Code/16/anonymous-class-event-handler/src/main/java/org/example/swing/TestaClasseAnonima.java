package org.example.swing;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestaClasseAnonima {
    private JFrame f;
    private JTextField tf;

    public TestaClasseAnonima() {
        f = new JFrame("Exemplo de Classe Anonima");
        tf = new JTextField(30);
    }

    public void exibeFrame() {
        JLabel label = new JLabel("Clique e arraste o mouse ou Clique em alguma posição");
        // Adiciona os componentes ao frame
        f.add(label, BorderLayout.NORTH);
        f.add(tf, BorderLayout.SOUTH);
        // Adiciona um listener que utiliza uma classe anônima
        f.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                String s = "Mouse movendo: X = " + e.getX() + " Y = " + e.getY();
                tf.setText(s);
            }
        }); // <- observe o parêntese !!!!
        f.addMouseListener(new TratadorCliqueMouse());
        // Define o tamanho e torna o frame disponível
        f.setSize(350, 200);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        TestaClasseAnonima obj = new TestaClasseAnonima();
        obj.exibeFrame();
    }

    class TratadorCliqueMouse extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent m) {
            String s = "Você Clicou na posição: X = " + m.getX() + " Y = " + m.getY();
            tf.setText(s);
        }
    }
}