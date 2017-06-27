package other;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MyGraphics {
    public static int getPrefferredWidth() {
        return 1600;
    }   
    public static int getPrefferredHeight() {
        return 900;
    }   
    public static void main(String[] args) {

    	// Create the frame.
		JFrame f = new JFrame("hello java graphics world!");
		f.setPreferredSize(new Dimension(getPrefferredWidth(),getPrefferredHeight()));
	
		// Optional: What happens when the frame closes?
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Change the frame icon to an image loaded from a file.
		f.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\js037847\\workspace\\ap_computer_science_a\\src\\other\\emoticon ("+((int)(Math.random() * 4) + 1)+").png"));

		//3. Add a graphics panel
		//RotatingSquarePanel square= new RotatingSquarePanel();f.add(square);
		PinBallPanel circle = new PinBallPanel();f.add(circle);      

        //4. Size the frame to arrange and fit everything 
		f.pack();

		//5.  Set location to NULL to center JFrame on the screen. Then display the JFrame.
		f.setLocationRelativeTo(null);		
		f.setVisible(true);	
	}
}
