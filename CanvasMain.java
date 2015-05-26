import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;

import javax.swing.JFrame;
public class Main {
	public static void main(String [] args){
		JFrame frame = new JFrame("Drawing Demonstration");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(640,260));
		frame.setContentPane(new Canvas());
		//Canvas myPanal = new Canvas();
		//frame.setContentPane(myPanal);
		frame.setVisible(true);
		//try{
		//	Thread.sleep(100);
		//}catch(InterruptedException e){
		//	e.printStackTrace();
		//}
		//Graphics2D g = (Graphics2D)myPanal.getGraphics();
		//g.setColor(Color.red);
		//g.setStroke(new BasicStroke(6));
		//g.drawLine(10,10,100,100);
	}
	
}
