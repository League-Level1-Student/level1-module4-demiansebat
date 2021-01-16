package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckleclicker implements ActionListener {
JButton joke= new JButton();
JButton punchline= new JButton();
public void makeButtons() {
JFrame frame= new JFrame();
frame.setVisible(true);
JPanel panel= new JPanel();
frame.add(panel);
panel.add(punchline);
panel.add(joke);
frame.pack();
joke.addActionListener(this);
punchline.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent arg0) {
	if(arg0.getSource()== joke) {
		JOptionPane.showMessageDialog(null, "Hi, there is no joke!");
	}
if(arg0.getSource()== punchline) {
		JOptionPane.showMessageDialog(null, "I'm glad you pressed this!");
	}
}
}
