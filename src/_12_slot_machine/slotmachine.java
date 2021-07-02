package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class slotmachine implements ActionListener {
	Icon firefox;
	Icon google;
	Icon explorer;
JFrame frame= new JFrame();
JPanel panel= new JPanel();
JLabel image1= new JLabel();
JLabel image2= new JLabel();
JLabel image3= new JLabel();
JButton button= new JButton("Spin");
Random randy= new Random();
void setup() {
	firefox= createIcon("firefox.png");
	google= createIcon ("google.png");
	explorer=createIcon ("explorer.png");
	frame.add(panel);
	panel.add(image1);
	panel.add(image2);
	panel.add(image3);
	panel.add(button);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	button.addActionListener(this);
	putPicturesOnLabels();
}
void putPicturesOnLabels() {
	int picture;
	picture= randy.nextInt(3);
	if(picture==0) {
		image1.setIcon(firefox);
	}
	else if(picture==1) {
		image1.setIcon(google);
	}
	else if(picture==2) {
		image1.setIcon(explorer);
	}
	picture= randy.nextInt(3);
	if(picture==0) {
		image2.setIcon(firefox);
	}
	else if(picture==1) {
		image2.setIcon(google);
	}
	else if(picture==2) {
		image2.setIcon(explorer);
	}
	picture= randy.nextInt(3);
	if(picture==0) {
		image3.setIcon(firefox);
	}
	else if(picture==1) {
		image3.setIcon(google);
	}
	else if(picture==2) {
		image3.setIcon(explorer);
	}
	if(image1.getIcon()==image2.getIcon()&& image1.getIcon()==image3.getIcon()){
		JOptionPane.showMessageDialog(null, "YOU WIN!");
	}
	frame.pack();
}
private Icon createIcon(String fileName) {
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return null;
}
Icon icon = new ImageIcon(imageURL);
return icon;
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource()==button) {
putPicturesOnLabels();
	}
}
}
