import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class treeGUI extends JFrame{
	JPanel panel;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	Color color;
	
	public treeGUI() {
		panel = new JPanel();
		panel.setVisible(true);
		
		color = new Color(167, 220, 95);
		
		// for add
		btn1 = new JButton("Insert");
		panel.add(btn1);
		btn1.setBounds(190, 610, 70, 18);
		add(btn1);
		
		// for remove
		btn2 = new JButton("Delete");
		panel.add(btn2);
		btn2.setBounds(280, 610, 70, 18);
		add(btn2);
		
		// for search
		btn3 = new JButton("Search");
		panel.add(btn3);
		btn3.setBounds(370, 610, 70, 18);
		add(btn3);
		
		setTitle("2-3-4 Tree Simulator");
		setBackground(color);
		setSize(900, 700);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		final JTextField tf = new JTextField();
		add(tf);
		tf.setBounds(100, 610, 70, 18);
	}
	
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.BLACK);
		
		// root
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(350, 50, 30, 30);
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(380, 50, 30, 30);
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(410, 50, 30, 30);
		
		// from the root to its left child
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawLine(270, 130, 350, 80);
		
		// from the root to its middle left child
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawLine(320, 130, 380, 80);
		
		// from the root to its middle right child
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawLine(470, 130, 410, 80);
		
		// from the root to its right child
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawLine(520, 130, 440, 80);
		
		// left child level 1
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(240, 130, 30, 30);
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(210, 130, 30, 30);
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(180, 130, 30, 30);
		
		// middle left child level 1
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(290, 130, 30, 30);
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(320, 130, 30, 30);
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(350, 130, 30, 30);
		
		// middle right child level 1
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(470, 130, 30, 30);
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(440, 130, 30, 30);
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(410, 130, 30, 30);
		
		// right child level 1
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(520, 130, 30, 30);
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(550, 130, 30, 30);
		g2d.setStroke(new BasicStroke(2f));
		g2d.drawRect(580, 130, 30, 30);

 	}
	
	public static void main(String[] args) {
		new treeGUI();
	}
}
