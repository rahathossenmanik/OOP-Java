package main;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
public class Window {
	Window(){
		JFrame frame = new JFrame("Closable Graphical Window");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				new Window();
			}
		});
	}
}