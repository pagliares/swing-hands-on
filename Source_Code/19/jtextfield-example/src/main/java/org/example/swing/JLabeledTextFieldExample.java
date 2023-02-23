package org.example.swing;
import javax.swing.*;
import java.awt.*;

/** A JPanel that combines a JLabel and a JTextField.
 *
 *  Taken from Core Web Programming from 
 *  Prentice Hall and Sun Microsystems Press,
 *  http://www.corewebprogramming.com/.
 *  &copy; 2001 Marty Hall and Larry Brown;
 *  may be freely used or adapted.
 */ 

public class JLabeledTextFieldExample extends JPanel {
	
  private JLabel label;
  private JTextField textField;

  public JLabeledTextFieldExample(String labelString, String textFieldString, LayoutManager layout) {
    super();
    setLayout(layout);
    label = new JLabel(labelString);
    textField = new JTextField(textFieldString, 30);
    add(label);
    add(textField);
  }
 
  public JLabeledTextFieldExample(String labelString,  String textFieldString) {
    this(labelString, textFieldString, new FlowLayout(FlowLayout.LEFT));
  }

  public JLabel getJLabel() {
    return(label); 
  }

  public JTextField getJTextField() { 
    return(textField);
  }

  public String getText() {
    return(getJTextField().getText());
  }

  public void setText(String textFieldString) {
    getJTextField().setText(textFieldString);
  }

  public void setFonts(Font f) {
    getJLabel().setFont(f);
    getJTextField().setFont(f);
  }

  public void setEnabled(boolean status) {
   getJLabel().setEnabled(status);
   getJTextField().setEnabled(status);
   super.setEnabled(status);
  }
  
   public static void main(String[] args) {
		JFrame jFrame = new JFrame( );
		JLabeledTextFieldExample panel = new JLabeledTextFieldExample("Name", "text");
		jFrame.add(panel, BorderLayout.CENTER);
		jFrame.setSize(510, 80);
		jFrame.setVisible(true);
	}
}
