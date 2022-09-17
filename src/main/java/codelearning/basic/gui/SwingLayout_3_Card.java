package codelearning.basic.gui;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingLayout_3_Card extends JFrame implements ActionListener {

	CardLayout crd;

	// button variables to hold the references of buttons
	JButton btn1, btn2, btn3;
	Container cPane;

	// constructor of the class
	SwingLayout_3_Card() {

		cPane = getContentPane();

		// default constructor used
		// therefore, components will
		// cover the whole area
		crd = new CardLayout();

		cPane.setLayout(crd);

		// creating the buttons
		btn1 = new JButton("Apple");
		btn2 = new JButton("Boy");
		btn3 = new JButton("Cat");

		// adding listeners to it
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);

		cPane.add("a", btn1); // first card is the button btn1
		cPane.add("b", btn2); // first card is the button btn2
		cPane.add("c", btn3); // first card is the button btn3

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Upon clicking the button, the next card of the container is shown
		// after the last card, again, the first card of the container is shown upon
		// clicking
		crd.next(cPane);
	}

	// main method
	public static void main(String argvs[]) {
		// creating an object of the class CardLayoutExample1
		SwingLayout_3_Card crdl = new SwingLayout_3_Card();

		// size is 300 * 300
		crdl.setSize(300, 300);
		crdl.setVisible(true);
		crdl.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
