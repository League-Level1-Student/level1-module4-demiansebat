package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Calculator implements ActionListener{
	double answer;
	int num1;
	int num2;
	JButton add= new JButton("Add");
	JButton sub= new JButton("Sub");
	JButton mul= new JButton("Mul");
	JButton div= new JButton("Div");
	JLabel label= new JLabel();
	JTextField input= new JTextField(10);
	JTextField text= new JTextField(10);
	JFrame frame=new JFrame("Simple Calculator");
	public void setup() {
	JPanel panel= new JPanel();
	frame.add(panel);
	panel.add(add);
	panel.add(sub);
	panel.add(mul);
	panel.add(div);
	panel.add(input);
	panel.add(text);
	panel.add(label);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
	add.addActionListener(this);
	mul.addActionListener(this);
	sub.addActionListener(this);
	div.addActionListener(this);
	frame.setSize(350, 300);
	
	}

	private void divid() {
		// TODO Auto-generated method stub
		answer= num1/num2;
	}

	private void mult() {
		// TODO Auto-generated method stub
		answer= num1*num2;
	}

	private void subt() {
		// TODO Auto-generated method stub
		answer= num1-num2;
	}

	private void addit() {
		// TODO Auto-generated method stub
		answer = num1+num2;
	}
		
	private void getNumbers(){
	String text1=input.getText();
	String text2=text.getText();
	num1= Integer.parseInt(text1);
	num2= Integer.parseInt(text2);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		getNumbers();
		if (e.getSource()==add) {
			addit();
			
		}
		else if (e.getSource()==sub) {
			subt();
		}
		else if (e.getSource()==mul) {
			mult();
		}
		else if (e.getSource()==div) {
			divid();
}
		label.setText(String.valueOf(answer));
	}	
}