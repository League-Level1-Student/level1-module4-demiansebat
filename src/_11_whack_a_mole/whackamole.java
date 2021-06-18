package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class whackamole implements ActionListener {
	Random randy= new Random();
	JButton molebutton;
	JFrame frame;
public void setup() {
	frame= new JFrame ("Whack a Button!");
	JPanel panel= new JPanel();
	frame.add(panel);
	frame.setVisible(true);
	frame.setSize(280, 300);
	int moleposition= randy.nextInt(24);
	for (int i = 0; i < 24; i++) {
		JButton button= new JButton();
		panel.add(button);
		button.addActionListener(this);
		if(i== moleposition) {
			button.setText("Mole!");
			molebutton= button;
			
		}
	}
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
if (e.getSource()==molebutton) {
		speak( "Correct!");
	}
else {
	speak("Your very dumb!");
}
frame.dispose();
setup();

}
static void speak(String words) {
    if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
        String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                + words + "');\"";
        try {
            Runtime.getRuntime().exec( cmd ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    } else {
        try {
            Runtime.getRuntime().exec( "say " + words ).waitFor();
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }
}
}
