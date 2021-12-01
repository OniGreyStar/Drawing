package Drawings;
import java.awt.Color;
/**
 * @author Leon
 * @Version 1.0
 * @since 8/4/2021
 */
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D.Double;


public class OlympicRingShape implements CompositeShape {
	
	private int x;
	private int y;
	private int width;
	
	
	/**
	 * This constructor is used to initializes the Olympic Rings
	 * @param x is the x axis 
	 * @param y is the y axis
	 * @param width is the width of the icon
	 */
	public OlympicRingShape(int x,int y,int width) {
		this.x =x;
		this.y =y;
		this.width = width;
	}
	
	/**
	 * This method creates the objects and draws them
	 * @param g2
	 */
	@Override
	public void draw(Graphics2D g2) {
		
		
	
		
		Ellipse2D.Double circle = new Ellipse2D.Double(x, y, width, width);
		Ellipse2D.Double circle1 = new Ellipse2D.Double(x+13, y+12, width, width);
		Ellipse2D.Double circle2 = new Ellipse2D.Double(x-13,y+13,width,width);
		Ellipse2D.Double circle3 = new Ellipse2D.Double(x-26, y, width, width);
		Ellipse2D.Double circle4 = new Ellipse2D.Double(x+25,y,width,width);
		
	
		
		g2.draw(circle);
		g2.setColor(Color.GREEN);
		g2.draw(circle1);
		g2.setColor(Color.YELLOW);
		g2.draw(circle2);
		g2.setColor(Color.CYAN);
		g2.draw(circle3);
		g2.setColor(Color.RED);
		g2.draw(circle4);
		
	}
	
	

	/**
	 * This method sets the location
	 * @param x is the x axis of the Panel
	 */
	@Override
	public void setXLocation(int x) {
		this.x =x;
		
	}
	
	/**
	 * This method sets the location
	 * @param y is the y axis of the Panel
	 */
	@Override
	public void setYLocation(int y) {
		this.y =y;
		
	}
	
	
	
	
	
	
	

}
