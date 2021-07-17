package randomthing;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class randomthing implements ActionListener {
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
void setup(){
	frame.add(panel);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	for (int i = 0; i < 25; i++) {
		JButton button= new JButton(""+(i+1));
		panel.add(button);
		button.addActionListener(this);
		toggle(button);
	}
	frame.setSize(400, 200);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton clicked = (JButton)e.getSource();
	int number= Integer.parseInt(clicked.getText());
	toggle(clicked);
	if(number-5>0) {
		toggle((JButton) panel.getComponent(number-6));
		
	}
	
	if(number+2<25) {
		toggle((JButton) panel.getComponent(number+2));
	}
	if(number>0) {
		toggle((JButton) panel.getComponent(number));
	}
	if(number+4<25)
	toggle((JButton) panel.getComponent(number+4));
}


public void toggle(JButton a) {
	if(a.getBackground()==Color.BLUE) {
		a.setBackground(Color.GREEN);
		a.setOpaque(true);
	}
	else {
		a.setBackground(Color.BLUE);
		a.setOpaque(true);
	}
}
}
