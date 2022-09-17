package codelearning.basic.gui;

import java.awt.Color;
import java.awt.Container;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing_1_HelloWorld {
	public static void main(String[] args) {
		JFrame f = new JFrame();// creating instance of JFrame

		JButton b = new JButton("click");// creating instance of JButton
		b.setBounds(130, 100, 100, 40);// x axis, y axis, width, height
		
		f.add(b);// adding button in JFrame
		
		Container contentPane = f.getContentPane();

		b.addActionListener(e -> contentPane.setBackground(new Color(new Random().nextInt(255))));

		f.setSize(400, 500);// 400 width and 500 height
		f.setLayout(null);// using no layout managers
		f.setVisible(true);// making the frame visible
	}

}
