package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class piglatintranslate implements ActionListener {
	JFrame frame= new JFrame("Pig Latin Translator");
	JTextField text= new JTextField(20);
	JButton button= new JButton("Translate");
	JLabel label= new JLabel();
	JPanel panel= new JPanel();
	PigLatinTranslator translator= new PigLatinTranslator();
	public void setup() {
		frame.add(panel);
		panel.add(text);
		panel.add(button);
		panel.add(label);
		frame.setVisible(true);
		label.setSize(200, 20);
		frame.pack();
		frame.setSize(645, 65);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button) {
			String piglatin=translator.translate(text.getText());
			label.setText(piglatin);
			}
	}
}
