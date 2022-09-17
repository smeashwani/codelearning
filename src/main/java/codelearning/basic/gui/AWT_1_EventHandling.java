package codelearning.basic.gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWT_1_EventHandling extends Frame implements ActionListener {

	TextField tf;

	AWT_1_EventHandling() {

		// create components
		tf = new TextField();
		tf.setBounds(60, 50, 170, 20);
		Button b = new Button("click me");
		b.setBounds(100, 120, 80, 30);
		
		// register listener
		//b.addActionListener(e -> tf.setText("welcome"));
		b.addActionListener(this);
		// add components and set size, layout and visibility
		add(b);
		add(tf);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		tf.setText("Welcome");
	}

	public static void main(String[] args) {
		new AWT_1_EventHandling();
	}
}

class OuterEvent implements ActionListener {
	AWT_1_EventHandling obj;

	OuterEvent(AWT_1_EventHandling obj) {
		this.obj = obj;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("welcome");
		obj.tf.setText("welcome");
	}
}
