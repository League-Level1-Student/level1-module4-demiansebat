package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nastysurprise implements ActionListener {
JPanel panel= new JPanel();
JFrame frame= new JFrame();
JButton button= new JButton("Trick");
JButton handle= new JButton("Treat");
public void run() {
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.add(panel);
panel.add(button);
panel.add(handle);
button.addActionListener(this);
handle.addActionListener(this);
frame.pack();
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	if(arg0.getSource()==button) {
		showPictureFromTheInternet("https://www.barrettweimaraners.com/wp-content/uploads/2014/12/IMG_5212-e1589428436460.jpg");
	}
	if(arg0.getSource()==handle) {
		showPictureFromTheInternet("https://patch.com/img/cdn20/users/22887534/20161005/065322/styles/raw/public/article_images/clown-1537543_1280-1475707155-2712.jpg");
	}
}
private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}
}