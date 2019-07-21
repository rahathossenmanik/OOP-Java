package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class Robi {
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	
	Robi(){
		JFrame frame = new JFrame("Robi");
		frame.setSize(404, 628);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setVisible(true);
		
		ActionListener listener = new AddCalculatorListener();
		
		Border raisedBorder = BorderFactory.createBevelBorder(0);
		
		button1 = new JButton("Stop All Service");
		button2 = new JButton("Check Number");
		button3 = new JButton("Check Data Balance");
		button4 = new JButton("Check Balance");
		button5 = new JButton("Emergency Balance");
		button6 = new JButton("Other Service");
		button1.setBounds(0 , 000 , 400 , 100);
		button2.setBounds(0 , 100 , 400 , 100);
		button3.setBounds(0 , 200 , 400 , 100);
		button4.setBounds(0 , 300 , 400 , 100);
		button5.setBounds(0 , 400 , 400 , 100);
		button6.setBounds(0 , 500 , 400 , 100);
		button1.setFont(new Font("Didot",Font.BOLD,40));
		button2.setFont(new Font("Didot",Font.BOLD,40));
		button3.setFont(new Font("Didot",Font.BOLD,40));
		button4.setFont(new Font("Didot",Font.BOLD,40));
		button5.setFont(new Font("Didot",Font.BOLD,40));
		button6.setFont(new Font("Didot",Font.BOLD,40));
		button1.setBackground(Color.RED);
		button2.setBackground(Color.RED);
		button3.setBackground(Color.RED);
		button4.setBackground(Color.RED);
		button5.setBackground(Color.RED);
		button6.setBackground(Color.RED);
		button1.setBorder(raisedBorder);
		button2.setBorder(raisedBorder);
		button3.setBorder(raisedBorder);
		button4.setBorder(raisedBorder);
		button5.setBorder(raisedBorder);
		button6.setBorder(raisedBorder);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		button3.addActionListener(listener);
		button4.addActionListener(listener);
		button5.addActionListener(listener);
		button6.addActionListener(listener);
	}
	class AddCalculatorListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
//			JButton button = (JButton)event.getSource();
		}
	}
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				new Robi();
			}
		});
	}
}