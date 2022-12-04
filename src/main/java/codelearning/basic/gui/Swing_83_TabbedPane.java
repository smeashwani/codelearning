package codelearning.basic.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Swing_83_TabbedPane  {

	JFrame f;  
	Swing_83_TabbedPane(){  
	    f=new JFrame();  
	    JButton btn1=new JButton("click1");
	    JButton btn2=new JButton("click2");
	    JPanel p1=new JPanel();  
	    p1.add(btn1);
	    p1.add(btn2);  
	    JPanel p2=new JPanel();  
	    JPanel p3=new JPanel();  
	    JTabbedPane tp=new JTabbedPane();  
	    tp.setBounds(50,50,200,200);  
	    tp.add("main",p1);  
	    tp.add("visit",p2);  
	    tp.add("help",p3);    
	    f.add(tp);  
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);  
	}  
	public static void main(String[] args) {
		new Swing_83_TabbedPane();
	}
}

