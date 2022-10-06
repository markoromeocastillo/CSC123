
// secondHandApp.java

import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class secondHandApp extends JComponent {
	
	public secondHandApp() {
		secondHandVisible = true;
		start();
	}
	
	public static void main(String[] args) {
		secondHandApp component = new secondHandApp();
		JFrame frame = new MenuFrame(component);
		frame.setSize(250, 250);
		frame.add(component);
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	

	public void secondOn() {
		secondHandVisible = true;
		repaint();
	}

	public void secondOff() {
		secondHandVisible = false;
		repaint();
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.black);
		// Draw the face of the clock...a circle for this program
		Ellipse2D.Double circle = new Ellipse2D.Double(TOP, LEFT, WIDTH, HEIGHT);
		g2.draw(circle);
		Point2D.Double center = new Point2D.Double((HEIGHT + LEFT + LEFT) / 2, (WIDTH + TOP + TOP) / 2);
		// Get time of day...
		GregorianCalendar currentTime = new GregorianCalendar();
		int seconds = currentTime.get(Calendar.SECOND);
		int minutes = currentTime.get(Calendar.MINUTE);
		int hour = currentTime.get(Calendar.HOUR); //0-11 value
		double hours = hour % 12;
		hours = hours + minutes/60.0; // if it's 60 it will not round properly. need 60.0
		double percent_of_12hours = hours/12.0;
		double percent_of_60secs = seconds / 60.0;
		double percent_of_60min = minutes / 60.0;
		System.out.println("H:"+ hour + " M:"+minutes+" S:"+seconds);
		double x = Math.cos(TWO_PI * percent_of_60secs - HALF_PI) * SECOND_HAND_RADIUS + HOFFSET;
		double y = Math.sin(TWO_PI * percent_of_60secs - HALF_PI) * SECOND_HAND_RADIUS + VOFFSET;
		double xM = Math.cos(TWO_PI * percent_of_60min - HALF_PI) * MINUTE_HAND_RADIUS + HOFFSET;
		double yM = Math.sin(TWO_PI * percent_of_60min - HALF_PI) * MINUTE_HAND_RADIUS + VOFFSET;
		double xH = Math.cos(TWO_PI * percent_of_12hours - HALF_PI) * HOUR_HAND_RADIUS + HOFFSET;
		double yH = Math.sin(TWO_PI * percent_of_12hours - HALF_PI) * HOUR_HAND_RADIUS + VOFFSET;
		
		Point2D.Double p1 = new Point2D.Double(x, y);
		Line2D.Double secondHand = new Line2D.Double(p1, center);
		Point2D.Double p2 = new Point2D.Double(xM, yM);
		Line2D.Double minuteHand = new Line2D.Double(p2, center);
		Point2D.Double p3 = new Point2D.Double(xH, yH);
		Line2D.Double hourHand = new Line2D.Double(p3, center);
		g2.setColor(Color.black);
		g2.draw(minuteHand);
		g2.draw(hourHand);
		if (secondHandVisible)
			g2.draw(secondHand);
	}


	public void start() {
		class EventTimer implements ActionListener 
		{
			public void actionPerformed(ActionEvent event) {
				repaint();
			}
		}
		EventTimer listener = new EventTimer();
		Timer t = new Timer(1000, listener);
		t.start();
	}
	private static final int FRAME_WIDTH = 200;
	private static final int FRAME_HEIGHT = 200;
	public static final int TOP = 10;
	public static final int LEFT = 10;
	public static final int WIDTH = 100;
	public static final int HEIGHT = 100;
	public static final int HOFFSET = (HEIGHT + LEFT + LEFT) / 2;
	public static final int VOFFSET = (WIDTH + TOP + TOP) / 2;
	public static final double TOTAL_PERCENT = 100;
	public static final double RADIUS = 20;
	public static final double TWO_PI = 2.0 * Math.PI;
	public static final int MINUTE_HAND_RADIUS = 35;
	public static final int HOUR_HAND_RADIUS = 22;
	public static final int SECOND_HAND_RADIUS = 40;
	public static final double HALF_PI = Math.PI / 2;
	public static final double MINS_PER_HOUR = 60;
	private boolean secondHandVisible;
}