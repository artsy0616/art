package javabook.ch8;

import java.awt.*;
import java.awt.event.*;

public class InnerEx8 {

	public static void main(String[] args) {
		Frame f = new Frame("익명 내부클래스");
		f.setLayout(new FlowLayout());
		Button b = new Button("Start");
		f.add(b);
		f.setSize(200, 200);
		f.setVisible(true);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!!");
				
			}
		}); //익명 클래스의 끝
	} //메소드의 끝
} //InnerEx8 클래스의 끝
