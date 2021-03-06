import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutSample extends JFrame {
		public GridLayoutSample() {
				setTitle("GridLayoutSample Sample");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				GridLayout grid = new GridLayout(4,3,5,5);
				
				Container c = getContentPane();
				
				c.setLayout(grid);
				for(int i = 1; i<= 9;i++) {
						c.add(new JButton(Integer.toString(i)));
				}
				c.add(new JButton("*"));
				c.add(new JButton("0"));
				c.add(new JButton("#"));
				
				setSize(300,200);
				setVisible(true);
		}
	public static void main(String[] args) {
		
		new GridLayoutSample();
	}

}
