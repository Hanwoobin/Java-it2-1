package chap09_fig9_05;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class JFrameEX extends JFrame{
		public JFrameEX() {
				setTitle("������ �����ܰ�");
				
				JMenuBar mb = new JMenuBar();
				JMenu fileMenu = new JMenu("File");
				JMenu editMenu = new JMenu("Edit");
				JMenu sourceMenu = new JMenu("Source");
				JMenu searchMenu = new JMenu("Serach");
				JMenu WindowMenu = new JMenu("window");
				
				mb.add(fileMenu);
				mb.add(editMenu);
				mb.add(sourceMenu);
				mb.add(searchMenu);
				mb.add(WindowMenu);
				setJMenuBar(mb);
				this.getContentPane().setLayout(new FlowLayout());
				this.getContentPane().setBackground(new Color(186, 143, 45));
				this.add(new JButton("add"));
				this.add(new JButton("sub"));
				this.add(new JButton("mul"));
				this.add(new JButton("div"));
				
				setSize(300,200);
				setVisible(true);
		}

	public static void main(String[] args) {
			new JFrameEX();
	}

}
