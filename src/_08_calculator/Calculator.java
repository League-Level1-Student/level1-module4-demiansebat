package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Calculator implements ActionListener{
	public void setup() {
		
	addit();
	subt();
	mult();
	divid();
	JFrame frame=new JFrame("Simple Calculator");
	JPanel panel= new JPanel();
	JButton add= new JButton("Add");
	JButton sub= new JButton("Sub");
	JButton mul= new JButton("Mul");
	JButton div= new JButton("Div");
	JTextField input= new JTextField(10);
	JTextField text= new JTextField(10);
	frame.add(panel);
	panel.add(add);
	panel.add(sub);
	panel.add(mul);
	panel.add(div);
	panel.add(input);
	panel.add(text);
	frame.setVisible(true);
	frame.pack();
	add.addActionListener(this);
	mul.addActionListener(this);
	sub.addActionListener(this);
	div.addActionListener(this);
	frame.setSize(350, 300);
	
	}

	private void divid() {
		// TODO Auto-generated method stub
		
	}

	private void mult() {
		// TODO Auto-generated method stub
		
	}

	private void subt() {
		// TODO Auto-generated method stub
		
	}

	private void addit() {
		// TODO Auto-generated method stub
	}
		

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}	
}