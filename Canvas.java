
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.CubicCurve2D;

import javax.swing.JPanel;
public class Canvas extends JPanel {
	public void paint(Graphics g0){
		super.paint(g0);
		Graphics2D g = (Graphics2D)g0;
		g.setColor(Color.gray);
		g.fillRect(10, 10, 600, 200);
		
		g.setColor(Color.black);
		g.setStroke(new BasicStroke(6));
		g.drawRect(10, 10, 600, 200);
		
		g.setColor(Color.white);
		g.fillOval(10,10,600,200);
		
		g.setColor(Color.LIGHT_GRAY);
		g.fillArc(10,10,600,200,30,-75);
		
		g.setColor(Color.black);
		g.drawOval(10,10,600,200);
		
		g.setColor(Color.blue);
		g.drawLine(310, 110, 10,110);
		
		g.setColor(Color.black);
		g.drawString("Drawing a String", 260, 50);
		
		g.setColor(Color.red);
		g.drawRoundRect(255, 35, 100, 20, 10, 10);
		
		g.setColor(Color.green);
		// create new CubicCurve2D.Double
		CubicCurve2D c = new CubicCurve2D.Double();
		// draw CubicCurve2D.Double with set coordinates
		c.setCurve(310, 110, -100,
		           -100, 100, 100, 310, 110);
		g.draw(c);

	}

}
