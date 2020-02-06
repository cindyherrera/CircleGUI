import javax.swing.JFrame;

public class CircleMain {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Circle Drawing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new CirclePanel());
		frame.setSize(500, 500);
		frame.setVisible(true);
		
	
	}

}
