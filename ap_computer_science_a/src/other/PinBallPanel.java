package other;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class PinBallPanel extends JPanel implements ActionListener {
	// 'speed' the objects move in time. less time in between will make it go faster
		Timer t = new Timer (15, this);
	// distance of each new move from the last position
		int distance = 8; 
	// width of each oval
		int ovalWidth = 80;
	// height of each oval
		int ovalHeight = 80;
	// boundaries
		int left   = - ( 800 - ( ovalWidth / 2 ) ); // -x = moves left 
		int right  =   ( 800 - ( ovalWidth / 2 ) ); // +x = moves right
		int top    = - ( 450 - ( ovalWidth / 2 ) ); // -y = moves up (y direction is 'upside down' in panel user space)      
		int bottom =   ( 450 - ( ovalWidth / 2 ) ); // +y = move down 
	// 180  <----- x axis ----->  0 degrees
		double rangeMin = 0;
		double rangeMax = 180;
		Random r = new Random();
		double direction = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
	// radius of each oval				, 
		double radius = ovalWidth / 2; 
	// x location 
		double ballX = 0.0;
	// y location 
		double ballY = 0.0;
		
	public PinBallPanel() {
		setBackground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(Color.WHITE));
		direction = ( Math.random() * 360) + 1;
 	};	
	
 	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		//move/translate origin from top left to center of JPanel.  
		g.translate(1600/2,900/2);  
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLACK);
		
		//redirect when going off left, right, top or bottom of JPanel
		if (-radius+ballX <= left) {
			if (direction >= 90 && direction <= 180) {
				rangeMin = 0;
				rangeMax = 90;	} 
			else {
				rangeMin = 270;
				rangeMax = 360;	 
			}
			direction = rangeMin + (rangeMax - rangeMin) * r.nextDouble();		
		}
		if (radius+ballX >= right) {
			if (direction >= 0 && direction <= 90) {
				rangeMin = 90;
				rangeMax = 180;	} 
			else {
				rangeMin = 180;
				rangeMax = 270;	 
			}
			direction = rangeMin + (rangeMax - rangeMin) * r.nextDouble();		
		}
		if (-radius+ballY < top) {
			if (direction >= 270 && direction <= 360) {
				rangeMin = 0;
				rangeMax = 90;	} 
			else {
				rangeMin = 90;
				rangeMax = 180;	 
			}
			direction = rangeMin + (rangeMax - rangeMin) * r.nextDouble();		
		}
		if (radius+ballY > bottom) {
			if (direction >= 0 && direction <= 90) {
				rangeMin = 270;
				rangeMax = 360;	} 
			else {
				rangeMin = 180;
				rangeMax = 270;	 
			}
			direction = rangeMin + (rangeMax - rangeMin) * r.nextDouble();		
		}
		ballX = ballX + (distance * Math.cos(Math.toRadians(direction)) );  //x
		ballY = ballY + (distance * Math.sin(Math.toRadians(direction)) );  //y
		g2.drawOval( (int)ballX, (int)ballY, ovalWidth, ovalHeight);

		t.start();
	};
	
	public void actionPerformed (ActionEvent e) {
 		repaint();
	}
}