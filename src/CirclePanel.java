import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

public class CirclePanel extends JPanel{
	private Point point1 = null, point2 = null;
	private Point OriginPoint = null;
	private double distance;
	
	//constructor to listen for mouse events
	public CirclePanel() {
		LineListener c = new LineListener();
		addMouseListener(c);
		addMouseMotionListener(c);
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(500, 500));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.pink);
		if(point1 !=null && point2 != null)
			g.drawOval(point1.x, point1.y,((int)distance),((int)distance));
	}
	
	private class LineListener implements MouseListener, MouseMotionListener {
	
		public void mousePressed(MouseEvent event) {
			point1= event.getPoint();
	}
		public void mouseDragged(MouseEvent event) {
			point2 = event.getPoint();
			distance = (int)Math.sqrt(Math.pow(point2.x - point1.x,2)
					+ Math.pow((point2.y - point2.y), 2));
			repaint(); 
		
	}
	//provide empty definitions for unused mouse events
	public void mouseEntered(MouseEvent event) {}
	public void mouseExited(MouseEvent event) {}
	public void mouseMoved(MouseEvent event) {}
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	
}
}
	
	


