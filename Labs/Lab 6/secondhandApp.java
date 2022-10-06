import javax.swing.JComponent;
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
import javax.swing.JFrame;

public class secondHandApp extends JComponent {

	public secondHandApp() {
		secondHandVisible = false;
		// start();
	}

	public void paintComponent(Graphics g)
	 {
	 Graphics2D g2 = (Graphics2D)g;
	 
	 for(;;){
		 g2.setColor(Color.black);
		 
		 // Draw the face of the clock...a circle for this program
		 
		 Ellipse2D.Double circle = new Ellipse2D.Double(TOP, LEFT, WIDTH, HEIGHT);
		 g2.draw(circle);
		 Point2D.Double center = new Point2D.Double( (HEIGHT+LEFT+LEFT)/2, (WIDTH+TOP+TOP)/2);
		 // Get time of day...
		 
		 GregorianCalendar currentTime = new GregorianCalendar();
		 int seconds = currentTime.get(Calendar.SECOND);
		 
		 double percent_of_60secs = seconds / 60.0;
		 
		 double x = Math.cos(TWO_PI * percent_of_60j;lsecs - HALF_PI) * SECOND_HAND_RADIUS + HOFFSET;
		 double y = Math.sin(TWO_PI * percent_of_60secs - HALF_PI) * SECOND_HAND_RADIUS + VOFFSET;
		 
		 Point2D.Double p1 = new Point2D.Double(x,y);
		 Line2D.Double secondHand = new Line2D.Double(p1, center);
		 
		 g2.setColor(Color.black);
		 g2.draw(secondHand);
	 }
	 
	 }

	// Create a timer to generate an event (call to repaint()) once per second
	public void start() {
		class EventTimer implements ActionListener // Note: a class within a method
		{
			public void actionPerformed(ActionEvent event) {
				repaint();
			}
		}
		EventTimer listener = new EventTimer();
		Timer t = new Timer(1000, listener); // 1000 is the # of milliseconds to wait
		t.start();
	}

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