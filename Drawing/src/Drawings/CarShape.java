package Drawings;




/**
 * @author Leon Ta
 * @Version 1.0
 * @since 8/4/2021
 */

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;


public class CarShape implements CompositeShape{
	
	private int x;
	private int y;
	private int width;
	
	
	/**
	 * this method is a constructor that initializes the x, y and width of the object
	 * @param x takes the x axis 
	 * @param y takes the y axis
	 * @param width is the width of the item
	 */
	public CarShape(int x,int y,int width) {
		this.x = x;
		this.y =y;
		this.width =width;
		
	}
	/**
	 * This method crease the body of the car and then draws it.
	 */
	/*
	 * This carShape was taken from our textBook in class
	 */
	public void draw(Graphics2D g2) {
		
		Rectangle2D.Double body = new Rectangle2D.Double(x,y+width/6,width-1,width/6);
		
		Ellipse2D.Double frontTire = new Ellipse2D.Double(x+width/6,y+width/3,width/6,width/6);
		
		Ellipse2D.Double rearTire = new Ellipse2D.Double(x + width *2/3, y+width/3, width/6, width/6);
		
		Point2D.Double r1 = new Point2D.Double(x+width/6, y + width/6);
		
		Point2D.Double r2 = new Point2D.Double(x+width/3, y);
		
		Point2D.Double r3 = new Point2D.Double(x + width *2/3, y);
		
		Point2D.Double r4 = new Point2D.Double(x+width*5/6, y+width/6);
		
		Line2D.Double frontWindShield = new Line2D.Double(r1,r2);
		Line2D.Double roofTop = new Line2D.Double(r2,r3);
		Line2D.Double rearWindShield = new Line2D.Double(r3,r4);
		
		
		g2.draw(body);
		g2.draw(frontTire);
		g2.draw(rearTire);
		g2.draw(frontWindShield);
		g2.draw(roofTop);
		g2.draw(rearWindShield);
		
		
		
	}
	
	/**
	 * This method is used to set the location when using the mouse to click on the panel for the x axis
	 * @param x is the x axis of the location
	 */
	@Override
	public void setXLocation(int x) {
		this.x = x;
		
	}
	/**
	 * This method is used to set the location when using the mouse to click on the panel for the y axis
	 * @param y is the y axis of the location
	 */
	@Override
	public void setYLocation(int y) {
		this.y = y;
		
	}


	

}
