package javabook.ch8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	private String[] labels = {
			"Back", "", "", "CE", "C",
			"7", "8", "9", "/", "sqrt",
			"4", "5", "6", "x", "%",
			"1", "2", "3", "-", "÷",
			"0", "+/-",".", "+", "=",
	};
	
	public Calculator() {
		tField = new JTextField(35);
		panel = new JPanel();
		tField.setText("0.");
		tField.setEnabled(false);
		tField.setSize(200, 200);
		
		panel.setLayout(new GridLayout(0, 5, 0, 0));
		buttons = new JButton[25];
		int index = 0;
		for(int rows = 0; rows < 5; rows++) {
			for(int cols = 0; cols < 5; cols++) {
				buttons[index] = new JButton(labels[index]);
				if(cols >= 3)
					buttons[index].setForeground(Color.white);
				else
					buttons[index].setForeground(Color.black);
				buttons[index].setBackground(Color.gray);
				panel.add(buttons[index]);
				index++;
			}
		}
		add(tField, BorderLayout.NORTH);
		add(panel,BorderLayout.CENTER);
		
		setSize(400, 400);
		setVisible(true);
		//pack();
	}
	
	public static void main(String[] args) {
		Calculator s = new Calculator();
	}
}
