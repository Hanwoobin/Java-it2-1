package chap11_ex02;

import java.awt.Container;
import java.awt.FlowLayout;
import java.io.IOException;
import java.net.JarURLConnection;
import java.util.jar.JarFile;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame{
	public LabelEx() {
			setTitle("레이블 예제");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			
			JLabel textLabel = new JLabel("Love");
			
			ImageIcon beauty = new ImageIcon("images/beauty.jpg");
			JLabel imageLabel = new JLabel(beauty);
			
			ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
			JLabel label = new JLabel("보고싶으면 연락",normalIcon,SwingConstants.CENTER);
			
		
			c.add(textLabel);
			c.add(imageLabel);
			c.add(label);
			
			setSize(400,600);
			setVisible(true);
				
				
				
	}
	public static void main(String[] args) {
		new LabelEx();

	}

}
