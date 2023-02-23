package org.example.swing;

import org.example.swing.utilities.ExitListener;
import org.example.swing.utilities.WindowUtilities;

import java.awt.*;
import javax.swing.*;



/**
 * Simple example illustrating the use of JLabel, especially the ability to use
 * HTML text (Swing 1.1.1 and Java 1.2.2 and later only!).
 *
 * Taken from Core Web Programming from Prentice Hall and Sun Microsystems
 * Press, http://www.corewebprogramming.com/. &copy; 2001 Marty Hall and Larry
 * Brown; may be freely used or adapted.
 */

public class JLabelExample extends JFrame {
	public static void main(String[] args) {
		new JLabelExample();
	}

	public JLabelExample() {
		super("Using HTML in JLabels");
		WindowUtilities.setNativeLookAndFeel();
		addWindowListener(new ExitListener());
		Container content = getContentPane();
		Font font = new Font("Serif", Font.PLAIN, 30);
		content.setFont(font);
		String labelText = "<html><FONT COLOR=WHITE>WHITE</FONT> and " + "<FONT COLOR=GRAY>GRAY</FONT> Text</html>";
		JLabel coloredLabel = new JLabel(labelText, JLabel.CENTER);
		coloredLabel.setBorder(BorderFactory.createTitledBorder("Mixed Colors"));
		content.add(coloredLabel, BorderLayout.NORTH);
		labelText = "<html><B>Bold</B> and <I>Italic</I> Text</html>";
		JLabel boldLabel = new JLabel(labelText, JLabel.CENTER);
		boldLabel.setBorder(BorderFactory.createTitledBorder("Mixed Fonts"));
		content.add(boldLabel, BorderLayout.CENTER);
		labelText = "<html>The Applied Physics Laboratory is a division " + "of the Johns Hopkins University." + "<P>"
				+ "Major JHU divisions include:" + "<UL>" + "  <LI>The Applied Physics Laboratory"
				+ "  <LI>The Krieger School of Arts and Sciences" + "  <LI>The Whiting School of Engineering"
				+ "  <LI>The School of Medicine" + "  <LI>The School of Public Health" + "  <LI>The School of Nursing"
				+ "  <LI>The Peabody Institute" + "  <LI>The Nitze School of Advanced International Studies" + "</UL>"
				+ "</html>";

		JLabel fancyLabel = new JLabel(labelText, new ImageIcon("images/JHUAPL.gif"), JLabel.CENTER);

		fancyLabel.setBorder(BorderFactory.createTitledBorder("Fancy HTML"));
		content.add(fancyLabel, BorderLayout.SOUTH);
		pack();
		setVisible(true);
	}
}

