package org.example.swing;
import java.awt.*;
import javax.swing.*;

import org.example.swing.utillities.ExitListener;
import org.example.swing.utillities.WindowUtilities;


/** Tiny example showing the main difference in using 
 *  JFrame instead of Frame: using the content pane
 *  and getting the Java (Metal) look and feel by default
 *  instead of the native look and feel.
 *
 *  Taken from Core Web Programming from 
 *  Prentice Hall and Sun Microsystems Press,
 *  http://www.corewebprogramming.com/.
 *  &copy; 2001 Marty Hall and Larry Brown;
 *  may be freely used or adapted. 
 */

public class JFrameExample {
  public static void main(String[] args) {
 
    WindowUtilities.setNativeLookAndFeel();
    // try other look and feel, e.g. WindowUtilities.setMotifLookAndFeel();
    JFrame f = new JFrame("This is a test");
    f.setSize(400, 150);
    
    Container content = f.getContentPane();
    content.setBackground(Color.white);
    content.setLayout(new FlowLayout()); 
    content.add(new JButton("Button 1"));
    content.add(new JButton("Button 2"));
    content.add(new JButton("Button 3"));
    
    f.addWindowListener(new ExitListener());
    f.setVisible(true);
  }
}