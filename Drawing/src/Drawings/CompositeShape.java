package Drawings;

/**
 * @author Leon Ta
 * @Version 1.0
 * @since 8/4/2021
 */
import java.awt.Graphics2D;

public interface CompositeShape  {
	/**
	 * draw method that draws the shape
	 * @param g2
	 */
	public void draw(Graphics2D g2);
	
	
	/**
	 * this method sets the x location
	 * @param x 
	 */
	public void setXLocation(int x);
	/**
	 * this method sets the y location
	 * @param y
	 */
	public void setYLocation(int y);

	

	
}