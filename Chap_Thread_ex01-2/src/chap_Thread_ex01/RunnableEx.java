
package chap_Thread_ex01;


import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread implements Runnable {
	private JLabel timerLabel;
	
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	@Override
	public void run() {
		int n= 0;
		while (true) {
				timerLabel.setText(Integer.toString(n));
				n++;
				try{
						Thread.sleep(1000);
				}catch(InterruptedException e) {
					return;
				}
		}
	}
}


public class RunnableEx<TimerRunnable> extends JFrame {
	public RunnableEx() {
		setTitle("Runnable");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,78));
		c.add(timerLabel);
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th = new Thread(runnable);
		
		setSize(300,170);
		setVisible(true);
		
		th.start();
	}
	
	
	public static void main(String[] args) {
		new RunnableEx();

	}

}
