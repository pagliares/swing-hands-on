package org.example.swing;

import java.awt.GridBagLayout;     
import java.awt.GridBagConstraints;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class GridBagFrame extends JFrame { 
   private GridBagLayout layout; // layout dessa janela                
   private GridBagConstraints constraints; // restricoes do layout
    
   public GridBagFrame() {
      super( "Usando GridBagLayout" );
      layout = new GridBagLayout();                                     
      setLayout( layout); // configura o layout da janela
      constraints = new GridBagConstraints(); // instancia restricoes no layout

      // cria componentes GUI
      JTextArea textArea1 = new JTextArea( "TextArea1", 5, 10 );
      JTextArea textArea2 = new JTextArea( "TextArea2", 2, 2 );

      String names[] = { "Ferro", "Aco", "Latao" };
      JComboBox<String> comboBox = new JComboBox<>( names );

      JTextField textField = new JTextField( "TextField" );
      
      JButton button1 = new JButton( "Button 1" );
      JButton button2 = new JButton( "Button 2" );
      JButton button3 = new JButton( "Button 3" );

      // weightx e weighty para textArea1 sao 0: o padrao
      // anchor para todos os componentes CENTER: o padrao
      constraints.fill = GridBagConstraints.BOTH;
      addComponent( textArea1, 0, 0, 1, 3 );     
       
      // weightx e weighty para button1 sao 0: o padrao
      constraints.fill = GridBagConstraints.HORIZONTAL;
      addComponent( button1, 0, 1, 2, 1 );             
      
      // weightx e weighty para comboBox sao 0: o padrao
      // fill o HORIZONTAL
      addComponent( comboBox, 2, 1, 2, 1 );

      // button2
      constraints.weightx = 1000;  // pode crescer na largura
      constraints.weighty = 1;     // pode crescer na altura
      constraints.fill = GridBagConstraints.BOTH;    
      addComponent( button2, 1, 1, 1, 1 );           
       
      // preenchimento o BOTH para button3
      constraints.weightx = 0;            
      constraints.weighty = 0;            
      addComponent( button3, 1, 2, 1, 1 );
       
      // weightx e weighty para textField sao 0, preenchimento  BOTH
      addComponent( textField, 3, 0, 2, 1 );

      // weightx e weighty para textArea2 sao 0, preenchimento  BOTH
      addComponent( textArea2, 3, 2, 1, 1 );
   } 

   // metodo para configurar restricoes em
   private void addComponent( Component component,int row, int column, int width, int height ){
      constraints.gridx = column; // configura gridx                           
      constraints.gridy = row; // configura gridy                              
      constraints.gridwidth = width; // configura gridwidth                    
      constraints.gridheight = height; // configure gridheight                 
      layout.setConstraints( component, constraints ); // configura constraints
      add( component ); 
   } 
   
   public static void main( String args[] ){ 
      GridBagFrame gridBagFrame = new GridBagFrame(); 
      gridBagFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      gridBagFrame.setSize( 300, 150 ); // configura o tamanho do frame
      gridBagFrame.setVisible( true ); // exibe o frame
   } 
} 
