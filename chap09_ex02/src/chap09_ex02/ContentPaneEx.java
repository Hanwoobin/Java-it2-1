package chap09_ex02;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
			setTitle("ContentPane and JFrame");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Container contentpane = getContentPane();
			contentpane.setBackground(Color.red);
			contentpane.setLayout(new FlowLayout());
			
			contentpane.add(new JButton("OK"));
			contentpane.add(new JButton("Cancel"));
			contentpane.add(new JButton("IGNORE"));
			
			setSize(300,200);
			setVisible(true);
	}
	public static void main(String[] args) {
		new ContentPaneEx();

	}

}
