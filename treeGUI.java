import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class treeGUI extends JPanel{
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JTextField tf;
	
	public treeGUI() { 
		// for add
		btn1 = new JButton("Insert");
		btn1.setSize(20, 10);
		btn1.setBackground(Color.gray);
		
		// for remove
		btn2 = new JButton("Delete");
		btn2.setSize(20, 10);
		btn2.setBackground(Color.gray);
		
		// for search
		btn3 = new JButton("Search");
		btn3.setSize(20, 10);
		btn3.setBackground(Color.gray);
		
		tf = new JTextField(10);
		tf.setSize(10, 10);
		
		btn1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				tf.setText("Insert");
			}
		});
		
		btn2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				tf.setText("Delete");
			}
		});
		
		btn3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				tf.setText("Search");
			}
		});
	 
		FlowLayout layout = new FlowLayout();
    setLayout(layout);
    add(tf, BorderLayout.NORTH);
    add(btn1, BorderLayout.NORTH);
    add(btn2, BorderLayout.NORTH);
    add(btn3, BorderLayout.NORTH);
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
		JFrame frame = new JFrame("2-3-4 Tree Simulator");
		Color color = new Color(167, 220, 95);
		frame.add(new treeGUI());
		frame.setTitle("2-3-4 Tree Simulator");
		frame.setBackground(color);
		frame.setSize(900, 700);
//		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}