package chap09_fig9_04;

import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.*;
import java.awt.*;

public class ContainerComponentEx extends JFrame {
	public ContainerComponentEx() {
		setTitle("Container & Component");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setLayout(null);
		this.setBackground(Color.gray);
		
		Panel1 p1 = new Panel1();
		p1.setSize(150,150);
		p1.setLocation(10,10);
		add(p1);
		Panel2 p2 = new Panel2();
		p2.setSize(150,150);
		p2.setLocation(170,10);
		add(p2);
		
		JButton btn = new JButton("OK");
		btn.setLocation(130, 170);
		btn.setSize(70, 30);
		add(btn);
		setSize(350, 250);
		setVisible(true);
	}
	
	private class Panel1 extends JPanel {
		Panel1() {
			setBackground(Color.YELLOW);
			add(new JLabel(" ID"));
			add(new JTextField(10));
			add(new JLabel("Password"));
			add(new JTextField(10));						
		}
	}
	
	private class Panel2 extends JPanel {
		Panel2() {
			setBackground(Color.GREEN);
			add(new JLabel("plz Check"));
			add(new JCheckBox("C# Box"));
			add(new JCheckBox("C++ Box"));			
		}
	}
	
	public static void main(String[] args) {
		new ContainerComponentEx();
	}
}
