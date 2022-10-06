
import javax.swing.JFrame;
import java.awt.Rectangle;
import java.util.Random;

public class Darts {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Darts");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(730, 750);
		Drawer component = new Drawer();
		frame.add(component);
		frame.setVisible(true);
		Random rnd = new Random();

		int hits = 0;
		for (int i = 0; i < THROWS; i++) {
			int x = rnd.nextInt(701);
			int y = rnd.nextInt(701);
			double distance = Math.sqrt(((x - 350) * (x - 350)) + ((y - 350) * (y - 350)));
			if (distance <= 350.00)
				hits++;
		}

		System.out.println(
				"Throws: " + THROWS + "\nHits: " + hits + "\nRatio: " + (4 * ((double) hits / (double) THROWS)));
	}

	private static final int THROWS = 10000;
}
