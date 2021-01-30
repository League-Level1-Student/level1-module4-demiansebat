package _06_book_of_illusions;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
 
/** Were going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be loaded. **/

public class BookOfIllusions extends MouseAdapter {

	// 1. Make a JFrame variable and initialize it using "new JFrame()"
	JLabel label;
JFrame frame= new JFrame();
	public void run() {
		// 2. make the frame visible
		frame.setVisible(true);
		// 3. set the size of the frame
		frame.setSize(20, 20);
		// 4. find 2 images and save them to your projects default package
		// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"
		String illusions="illusion1.jpg";
		// 6. create a variable of type "JLabel" but dont initialize it yet
		JLabel label= loadImageFromComputer(illusions);
		// 7. use the "loadImage..." methods below to initialize your JLabel
		
		// 8. add your JLabel to the frame
		frame.add(label);
		// 9. call the pack() method on the frame
		frame.pack();
		// 10. add a mouse listener to your frame (hint: use *this*)
		frame.addMouseListener(this);
	}

	public void mousePressed(MouseEvent e) {
		frame.dispose();
		frame= new JFrame();
		frame.setVisible(true);
		// 11. Print "clicked!" to the console when the mouse is pressed
		JOptionPane.showMessageDialog(null, "Clicked!");
		// 12. remove everything from the frame that was added earlier
		String illusions="illusion2.jpg";
		JLabel label= loadImageFromComputer(illusions);
		frame.add(label);
		frame.pack();
		// 13. load a new image like before (this is more than one line of code)
		// 14. pack the frame
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}


