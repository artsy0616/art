package javabook.ch8;

//-----------------------------------------Ch8Ex3 스윙으로 바꾸는 예제
import java.awt.*;
import javax.swing.*;

public class Ch8Ex03 extends JFrame {
	public Ch8Ex03() {
		super("AWT 기본예제");
		getContentPane().setLayout(new BorderLayout());
		JLabel t1 = new JLabel("ID");
		JLabel t2 = new JLabel("Passwd");
		JTextField id = new JTextField(10);
		JTextField pwd = new JTextField(10);
		JButton btn = new JButton("Login");

		JPanel p1 = new JPanel();
		p1.add(t1);
		p1.add(id);
		
		JPanel p2 = new JPanel();
		p2.add(t2);
		p2.add(pwd);
		p2.add(btn);
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.SOUTH);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ch8Ex03 app = new Ch8Ex03();
	}
}
