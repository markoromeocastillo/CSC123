import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.util.Random;

public class Drawer extends JComponent {
	public Drawer() {
		x = 0;
		y = 0;
	}

	public Drawer(int x, int y) {
		this.x = x;
		this.y = y;

	}

	public void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void paintComponent(Graphics g) {
		Graphics2D gc = (Graphics2D) g;
		Rectangle square = new Rectangle(0, 0, 700, 700);
		gc.draw(square);
		Ellipse2D.Double circle = new Ellipse2D.Double(0, 0, 700, 700);
		gc.draw(circle);
		Random rnd = new Random();

		Drawer[] pts = new Drawer[10000];

		for (int i = 0; i < pts.length; i++) {
			pts[i] = new Drawer(rnd.nextInt(700), rnd.nextInt(700));
		}

		for (int i = 0; i < pts.length; i++) {
			Rectangle box = new Rectangle(pts[i].x, pts[i].y, 1, 1);
			gc.draw(box);
		}

	}

	int x;
	int y;
	static final int HEIGHT = 10;
	static final int WIDTH = 10;
	static final int TOP_LEFT_X = 100;
	static final int TOP_LEFT_Y = 100;
}