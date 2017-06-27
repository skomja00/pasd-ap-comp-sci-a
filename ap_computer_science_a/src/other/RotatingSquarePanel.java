package other;

import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.geom.Ellipse2D;
//import java.awt.geom.Rectangle2D;

class RotatingSquarePanel extends JPanel implements ActionListener { 
	static final long serialVersionUID=0;
	Timer t = new Timer (40, this);
    double inc = 3.0,
        	h = 275,
        	w = 275,
        	t0 = 135.0,
        	t1 = 045.0,
        	t2 = 315.0,
        	t3 = 225.0,        		
        	r=Math.sqrt(Math.pow(h,2)+Math.pow(w,2));
	int i = 0,
		count = 360 / (int)inc;
	double[][] sq = new double[count][8];
    public RotatingSquarePanel() {
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createLineBorder(Color.WHITE));
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);   
        g.translate(1600/2,900/2); //move origin from top left to center of JPanel
		Graphics2D g2 = (Graphics2D) g;
		g2.drawLine((int)sq[i][0],(int)sq[i][1],(int)sq[i][2],(int)sq[i][3]); //"top" side
		g2.drawLine((int)sq[i][2],(int)sq[i][3],(int)sq[i][4],(int)sq[i][5]); //right 
		g2.drawLine((int)sq[i][4],(int)sq[i][5],(int)sq[i][6],(int)sq[i][7]); //bottom
		g2.drawLine((int)sq[i][6],(int)sq[i][7],(int)sq[i][0],(int)sq[i][1]); //left
		t.start();
	}    
	public void actionPerformed (ActionEvent e) {
    	sq[i][0]=r*Math.cos(Math.toRadians(t0));//"top" left corner 
    	sq[i][1]=r*Math.sin(Math.toRadians(t0));
    	sq[i][2]=r*Math.cos(Math.toRadians(t1));//top right corner
    	sq[i][3]=r*Math.sin(Math.toRadians(t1));
    	sq[i][4]=r*Math.cos(Math.toRadians(t2));//bottom right corner 
    	sq[i][5]=r*Math.sin(Math.toRadians(t2));
    	sq[i][6]=r*Math.cos(Math.toRadians(t3));//bottom left corner
    	sq[i][7]=r*Math.sin(Math.toRadians(t3));		
    	t0=t0+inc; if (t0>360.0) {t0=t0-360;}
    	t1=t1+inc; if (t1>360.0) {t1=t1-360;}
    	t2=t2+inc; if (t2>360.0) {t2=t2-360;}
    	t3=t3+inc; if (t3>360.0) {t3=t3-360;}
    	repaint();
	}
}

