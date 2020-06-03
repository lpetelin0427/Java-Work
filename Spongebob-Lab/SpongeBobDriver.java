import javax.swing.JFrame;

public class SpongeBobDriver {

	public static void main(String[] args) {
	SpongeBobJPanel shapesJPanel = new SpongeBobJPanel();
		
		JFrame frame = new JFrame("SpongeBob");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(shapesJPanel);
		frame.setSize(700,700);	
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}

}
