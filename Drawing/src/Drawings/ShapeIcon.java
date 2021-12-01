package Drawings;
/**
 * @author Leon
 * @Version 1.0
 * @since 8/4/2021
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.Icon;

public class ShapeIcon implements Icon {
	
	private int width;
	private int height;
	CompositeShape shape;
	
	
	/**
	 * This constructor takes the CompositeShape variable and initializes it
	 * @param shape
	 */
	public ShapeIcon(CompositeShape shape) {
		this.shape = shape;
	}
	
	/**
	 *
	 * This method is used to draw the shape of the icon, without it we wouldnt be able to see the icon inside
	 * of the JButton
	 * @param c is a component parameter
	 * @param g is a graphics parameter
	 * @param x is the x axis
	 * @param y is the y axis
	 */
	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		
		Graphics2D g2 = (Graphics2D) g;
		shape.draw(g2);
		
	}
	/**
	 * this method returns the width of the Icon
	 */
	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return width;
	}
	/**
	 * this method returns the height of the icon
	 */
	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return height;
	}

}
