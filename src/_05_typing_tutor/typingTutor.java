package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class typingTutor implements KeyListener {
	char currentLetter;
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JPanel panel = new JPanel();

	public static void main(String[] args) {
		typingTutor tutor = new typingTutor();
		tutor.setup();
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	void setup() {
		frame.setVisible(true);
		currentLetter = generateRandomLetter();
		label.setText("" + currentLetter);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);
		panel.add(label);
		frame.add(panel);
		frame.pack();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You pressed: " + e.getKeyChar());
		if (e.getKeyChar() == currentLetter) {
			JOptionPane.showMessageDialog(null, "CORRECT!!!");
			panel.setBackground(Color.GREEN);
			currentLetter = generateRandomLetter();
			label.setText("" + currentLetter);
			panel.add(panel);
		frame.pack();
		} else {
			panel.setBackground(Color.RED);
		}

	}

	@Override
	public void keyReleased(KeyEvent e){
		// TODO Auto-generated method stub
	}
}
