package codelearning.basic.gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingLayout_0_Border1_calculator {
	JFrame f;

	SwingLayout_0_Border1_calculator() {
		f = new JFrame();

		// creating buttons
		JTextField t1 = new JTextField();
		 // the button will be labeled as NORTH
		JButton b2 = new JButton("1");
		JButton b3 = new JButton("2");
		JButton b4 = new JButton("3");
		JButton b5 = new JButton("4");
		JPanel p = new JPanel();
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		
		// No need to set the layout as frame have default border layout
		// f.setLayout(new BorderLayout(20, 15));  

		f.add(t1, BorderLayout.NORTH); // b1 will be placed in the North Direction
		f.add(p); // b2 will be placed in the Center
		f.setSize(300, 300);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new SwingLayout_0_Border1_calculator();
	}

}
