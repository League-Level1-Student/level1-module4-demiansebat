package _12_slot_machine;

import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class slotmachine {
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
	frame.pack();
}
void putPicturesOnLabels() {
	int picture;
	picture= randy.nextInt(3);
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
}
