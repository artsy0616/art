package javabook.ch8;

//-----------------------------------------Ch8Ex8 스윙으로 바꾸는 예제

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class InnerEx08 extends JFrame {
	public InnerEx08() {
		super("익명 내부 클래스");
		getContentPane().setLayout(new FlowLayout());
		JButton b = new JButton("Start");
		getContentPane().add(b);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(350, 200);
		setVisible(true);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!!");
				
			}
		});
	}

	public static void main(String[] args) {
		InnerEx08 app = new InnerEx08();
	}
}