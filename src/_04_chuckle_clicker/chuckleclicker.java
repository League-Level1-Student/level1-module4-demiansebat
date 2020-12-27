package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckleclicker implements ActionListener {
public static void main(String[] args) {

}

public void makeButtons() {
JFrame frame= new JFrame();
frame.setVisible(true);
JPanel panel= new JPanel();
JButton button= new JButton();
JButton handle= new JButton();
frame.add(panel);
frame.add(handle);
frame.add(button);
frame.pack();
button.addActionListener(this);
handle.addActionListener(this);
	
}

public void run() {
	
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
