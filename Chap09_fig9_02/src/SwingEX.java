import javax.swing.*;

import java.awt.*;

public class SwingEX extends JFrame {
	public SwingEX() {//»ý¼ºÀÚ
		setTitle("½ºÀ® ÄÄÆ÷³ÍÆ®");
		createMenu();
		createToolBar();
		createSplitPane();
		setSize(500, 400);
		setVisible(true);
	}

	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		mb.add(new JMenu("File"));
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		mb.add(new JMenu("Save"));

		this.setJMenuBar(mb);
	}

	private void createToolBar() {
		JToolBar bar = new JToolBar("kitae Menu");
		
		bar.setBackground(Color.LIGHT_GRAY);
		bar.add(new JButton("new"));
		bar.add(new JButton(new ImageIcon("images/open.jpg")));
		bar.addSeparator();
		bar.add(new JButton(new ImageIcon("images/save.jpg")));
		bar.add(new JLabel("Search"));
		bar.add(new JTextField("text Field"));
		
		JComboBox<String> combo = new JComboBox<String>();
		combo.addItem("java");
		combo.addItem("C#");
		combo.addItem("C");
		combo.addItem("C++");
		add(bar, BorderLayout.NORTH);
	}
	
	private void createSplitPane() {
			String [] fruits = {"apple", "banana","kiwi","Joke","mango",
								"peach", "berry", "strawberry", "blackberry"};
			JList<String> scrollList = new JList<String>(fruits);
			JSplitPane pane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
					new JScrollPane(scrollList),new JScrollPane(new JLabel(new ImageIcon("imgae/img1.jpg"))));
			add(pane, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
			new SwingEX();
	}

}
