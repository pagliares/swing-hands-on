package org.example.swing;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class BoxLayoutFrame extends JFrame {

	public BoxLayoutFrame() {
      super( "Demonstrating BoxLayout" );

      // cria containeres Box com BoxLayout
      Box horizontal1 = Box.createHorizontalBox();
      Box vertical1 = Box.createVerticalBox();    
      Box horizontal2 = Box.createHorizontalBox();
      Box vertical2 = Box.createVerticalBox();    

      final int SIZE = 3; // numero de botoes em cada Box

      // adiciona botoes a Box horizontal1
      for ( int count = 0; count < SIZE; count++ )
         horizontal1.add( new JButton( "Button " + count ) );

      // cria um suporte e adiciona botoes a Box vertical1
      for ( int count = 0; count < SIZE; count++ )  {
         vertical1.add( Box.createVerticalStrut( 25 ) );   
         vertical1.add( new JButton( "Button " + count ) );
      } 

      // cria a cola horizontal e adiciona botoes a Box horizontal2
      for ( int count = 0; count < SIZE; count++ )  {
         horizontal2.add( Box.createHorizontalGlue() );      
         horizontal2.add( new JButton( "Button " + count ) );
      } 

      // cria uma area rigida e adiciona botoes a Box vertical2
      for ( int count = 0; count < SIZE; count++ ) {
         vertical2.add( Box.createRigidArea( new Dimension( 12, 8 ) ) );
         vertical2.add( new JButton( "Button " + count ) );             
      } 

      // cria cola vertical e adiciona botoes ao painel
      JPanel panel = new JPanel();
      panel.setLayout(new BoxLayout( panel, BoxLayout.Y_AXIS ));

      for ( int count = 0; count < SIZE; count++ ) {
         panel.add( Box.createGlue() );                
         panel.add( new JButton( "Button " + count ) );
      } 

      // cria um JTabbedPane - painel com abas
      JTabbedPane tabs = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT );

      // coloca cada aba no painel com abas
      tabs.addTab( "Horizontal Box", horizontal1 );
      tabs.addTab( "Vertical Box com Struts", vertical1 );
      tabs.addTab( "Horizontal Box com Glue", horizontal2 );
      tabs.addTab( "Vertical Box com Rigid Areas", vertical2 );
      tabs.addTab( "Vertical Box com Glue", panel );

      add( tabs ); // coloca o painel com abas no quadro
   } 
   
   public static void main( String args[] ) { 
	      BoxLayoutFrame boxLayoutFrame = new BoxLayoutFrame();  
	      boxLayoutFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	      boxLayoutFrame.setSize( 400, 220 );  
	      boxLayoutFrame.setVisible( true );  
   } 
}