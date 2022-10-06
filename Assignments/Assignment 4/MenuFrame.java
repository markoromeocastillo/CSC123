
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuFrame extends JFrame {
	public MenuFrame(secondHandApp component) {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		menuBar.add(createFileMenu());
		menuBar.add(sMenu());
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.component = component;
	}
	

	public JMenu createFileMenu() {
		JMenu menu = new JMenu("File");
		menu.add(createFileExitItem());
		return menu;
	}

	public JMenuItem createFileExitItem() {
		JMenuItem item = new JMenuItem("Exit");

		class MenuItemListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		}

		ActionListener listener = new MenuItemListener();
		item.addActionListener(listener);
		return item;
	}
	
	public JMenu sMenu() {
		JMenu menu = new JMenu("Show");
		menu.add(sOn());
		menu.add(sOff());
		return menu;
	}
	
	public JMenuItem sOn() {
		JMenuItem item = new JMenuItem("Second Hand On");

		class MenuItemListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				component.secondOn();
				System.out.println("Second Hand Turned On");
			}
		}

		ActionListener listener = new MenuItemListener();
		item.addActionListener(listener);
		return item;
	}

	public JMenuItem sOff() {
		JMenuItem item = new JMenuItem("Second Hand Off");

		class MenuItemListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				component.secondOff();
				System.out.println("Second Hand Turned Off");
			}
		}

		ActionListener listener = new MenuItemListener();
		item.addActionListener(listener);
		return item;
	}
	
	
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 200;
	private secondHandApp component;
}