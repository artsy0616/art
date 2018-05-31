package javabook.ch8;

import java.awt.*;
import javax.swing.*;

public class Ch8Ex01 extends JFrame {
	public Ch8Ex01() {
		super("Hello World");
		getContentPane().setLayout(new FlowLayout());
		JLabel label = new JLabel("Welcome to AWT");
		getContentPane().add(label);
		setSize(200, 200);
		setVisible(true);	
	}
}
