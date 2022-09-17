package codelearning.basic.gui;

import java.awt.Button;
import java.awt.Frame;

public class AWT_0_HelloWorld_Association extends Frame {

	// initializing using constructor
	AWT_0_HelloWorld_Association() {

		// creating a button
		Button b = new Button("Click Me!!");

		// setting button position on screen
		b.setBounds(30, 100, 80, 30);

		// adding button into frame
		add(b);

		// frame size 300 width and 300 height
		setSize(300, 300);

		// setting the title of Frame
		setTitle("This is our basic AWT example");

		// no layout manager
		setLayout(null);

		// now frame will be visible, by default it is not visible
		setVisible(true);
	}

	public static void main(String[] args) {
		new AWT_0_HelloWorld_Association();
	}
}
