package Drawings;

/**
 * @author Leon
 * @Version 1.0
 * @since 8/4/2021
 */

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;


public class SnowMan implements CompositeShape {
	
	private int x;
	private int y;
	private int width;
	
	/**
	 * this method is a constructor that is used to initializes x,y and width
	 * @param x initializes the x axis
	 * @param y initializes the y axis
	 * @param width is the width of the object
	 */
	public SnowMan(int x,int y,int width) {
		
		this.x  =x;
		this.y =y;
		this.width =width;
	}
	
	/**
	 * this method is used to create two circles and draw two circles to create a snowman
	 * @param g2
	 */
	public void draw(Graphics2D g2) {
		
		Ellipse2D.Double firstCircle = new Ellipse2D.Double(x, y-12,width, width);
		
		Ellipse2D.Double secondcircle = new Ellipse2D.Double(x,y+12,width,width);
		
		
		g2.draw(firstCircle);
		g2.draw(secondcircle);
		
		
	}

	/**
	 * This method sets the x location
	 * @param is the y axis of the location
	 */
	@Override
	public void setXLocation(int x) {
		this.x =x;
		
	}

	/**
	 * this method sets the y location
	 * @param y is the y axis of the location
	 */
	@Override
	public void setYLocation(int y) {
		this.y =y;
		
	}





}
