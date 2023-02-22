package org.example.swing;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestaClasseAninhada {
   private JTextField tf;
   private JFrame f;

   public TestaClasseAninhada() {
     f = new JFrame("Exemplo de classe Interna");
    tf = new JTextField(30);
  }

  public void exibeFrame() {
    JLabel label = new JLabel("Clique e arraste o mouse ou Clique em alguma posição");
    // Adiciona componentes ao frame
    f.add(label, BorderLayout.NORTH);
    f.add(tf, BorderLayout.SOUTH);
    // Adiciona um listener que usa uma Inner class
    f.addMouseMotionListener(new MeuMouseListener());
    f.addMouseListener(new TratadorCliqueMouse());
    // Define o tamanho do frame e o torna visível
    f.setSize(350, 200);
    f.setVisible(true);
  }

   class MeuMouseListener extends MouseMotionAdapter {
	   @Override
	   public void mouseDragged(MouseEvent e) {
		   String s = "Mouse Movendo: X = "+ e.getX()+ " Y = " + e.getY();
		   tf.setText(s);
	   }
  }
   
   class TratadorCliqueMouse extends MouseAdapter {
       @Override
      public void mouseClicked(MouseEvent m) {
          String s = "Você Clicou na posição: X = "  + m.getX()
                  + " Y = " + m.getY();
          tf.setText(s);
      }       
   }

   public static void main(String args[]) {
     TestaClasseAninhada obj = new TestaClasseAninhada();
     obj.exibeFrame();
   }
 }

  

