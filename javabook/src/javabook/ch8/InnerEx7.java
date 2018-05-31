package javabook.ch8;

import java.awt.*;
import java.awt.event.*;

class InnerEx7 {

	public static void main(String[] args) {
		
		Frame f = new Frame("익명 내부클래스");
		f.setLayout(new FlowLayout());
		Button b = new Button("Start");
		f.add(b);
		f.setSize(200, 200);
		f.setVisible(true);
		
		//Button b = new Button("Start");
		b.addActionListener(new EventHandler());
	}
}

class EventHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred!!");
	}
}