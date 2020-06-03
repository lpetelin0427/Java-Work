import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;


public class SpongeBobJPanel  extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		setBackground(Color.YELLOW);
		
		Graphics2D graph2D = (Graphics2D) g;
			//Eyes, left to right, these 2 are the outer part
			g.setColor(Color.WHITE);
			graph2D.fillOval(125,100,200,200);
			graph2D.fillOval(325,100,200,200);
			//Outlines
			g.setColor(Color.BLACK);
			graph2D.drawOval(125,100,200,200);
			graph2D.drawOval(325,100,200,200);
			//Inner Eyes
			g.setColor(new Color(49,202,240));
			graph2D.fillOval(175,150,100,100);
			graph2D.fillOval(375,150,100,100);
			//Outlines
			g.setColor(Color.BLACK);
			graph2D.drawOval(175,150,100,100);
			graph2D.drawOval(375,150,100,100);
			//Pupils
			g.setColor(Color.BLACK);
			graph2D.fillOval(200,175,50,50);
			graph2D.fillOval(400,175,50,50);
			//Eye lashes
			g.setColor(Color.BLACK);
			
			//left center
			graph2D.fillRect(220, 70, 10, 30);
			
			//Left Right Eye Lash  (Confusing names I know)
			Rectangle2D rightRect = new Rectangle2D.Double(10,30, 10, 30);
			double rotateRight = Math.toRadians(20);
			AffineTransform transform = new AffineTransform();
			transform.rotate(rotateRight);
			transform.translate(275, -50); 
			Shape rotatedRect = transform.createTransformedShape(rightRect);
			graph2D.fill(rotatedRect);
			
			//Left Left Eye Lash 
			Rectangle2D leftRect = new Rectangle2D.Double(10,30, 10, 30);
			double rotateLeft = Math.toRadians(140);
			transform.rotate(rotateLeft);
			transform.translate(90, -55); 
			Shape rotatedLeftRect = transform.createTransformedShape(leftRect);
			graph2D.fill(rotatedLeftRect);
			//right center
			graph2D.fillRect(420, 70, 10, 30);
			
			//Right Right Eye Lash 
			Rectangle2D rightRightRect = new Rectangle2D.Double(10, 30, 10, 30);
			double rotateRight02 = Math.toRadians(20);
			AffineTransform transform1 = new AffineTransform();
			transform1.rotate(rotateRight02);
			transform1.translate(475, -115); 
			Shape rotatedRightRect = transform1.createTransformedShape(rightRightRect);
			graph2D.fill(rotatedRightRect);
			
			//Right Right Eye Lash
			Rectangle2D rightLeftRect = new Rectangle2D.Double(10, 30, 10, 30);
			double rotateLeft02 = Math.toRadians(140);
			transform1.rotate(rotateLeft02);
			transform1.translate(110, -50); 
			Shape rotatedLeftRightRect = transform1.createTransformedShape(rightLeftRect);
			graph2D.fill(rotatedLeftRightRect);
			
			//SpongeBob's Pores(Sponge Holes? Whatever their called)
			g.setColor(new Color(88,178,74));
			graph2D.fillOval(50,75,40,50);
			graph2D.fillOval(30,150,30,40);
			graph2D.fillOval(550,50,35,45);
			graph2D.fillOval(50,470,40,50);
			graph2D.fillOval(100,500,70,80);
			graph2D.fillOval(550,450,70,80);
			graph2D.fillOval(520,520,30,30);
			
			//Nose
			g.setColor(Color.BLACK);
			g.drawArc(275, 260, 100, 175, 10, 150); 
			
			//Mouth
			g.setColor(Color.BLACK);
			g.drawArc(90,150, 500,300, 0, -180); 
			g.drawArc(70, 295, 40,40, 50, 100); 
			g.drawArc(570, 295, 40,40, 50, 100); 
			
			//Teeth
			g.setColor(Color.WHITE);
			g.fillRect(280, 449, 50, 50);
			g.fillRect(340, 449, 50, 50);
			
			//Outline of teeth
			g.setColor(Color.BLACK);
			g.drawRect(280, 449, 50, 50);
			g.drawRect(340, 449, 50, 50);
			
			//Red Outlines Mouth Detail
			g.setColor(Color.RED);
			g.drawArc(5, 225, 150,150, 0, 200); 
			g.drawArc(515, 225, 150,150, 0, 200); 
			//Dots -- Left
			g.fillOval(50, 260, 5, 5);
			g.fillOval(80, 270, 5, 5);
			g.fillOval(100, 250, 5, 5);
			//Dots -- Right
			g.fillOval(550, 260, 5, 5);
			g.fillOval(580, 270, 5, 5);
			g.fillOval(600, 250, 5, 5);
			
			//Mouth Bottom detail (RED SQUIGGLES)
			g.drawArc(240,475, 200,50, 0, -180);

			
	}
}
