package Drawings;
/**
 * @author Leon Ta
 * @Version 1.0
 * @since 8/4/2021
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;





public class ShapeDisplayer {
	
	private static CompositeShape shape;
	
	
	/**
	 * This method creates the gui and the button and shapes and the frame. It puts the buttons onto panels and into the frame. It also includes Mouselistener
	 * and a get and set for the mouse location
	 * @param args
	 */
	public static void main(String [] args) {
		
		JFrame frame =new JFrame("Shapes");
		
		frame.setSize(500,500);
		
		JPanel panel = new JPanel();
		JPanel ButtPanel = new JPanel();
		
		Border blueline = BorderFactory.createLineBorder(Color.cyan);
		
		panel.setBorder(blueline);
		
		
		JButton car = new JButton();
		JButton Snowman = new JButton();
		JButton OlympicRing = new JButton();
		
		ShapeIcon cakeicon = new ShapeIcon(new OlympicRingShape(30,20,25));
		
		ShapeIcon caricon = new ShapeIcon(new CarShape(18,25,50));
		
		ShapeIcon snowmanicon = new ShapeIcon(new SnowMan(27,25,25));
		
		OlympicRing.setIcon(cakeicon);
		car.setIcon(caricon);
		Snowman.setIcon(snowmanicon);
		
		OlympicRing.setPreferredSize(new Dimension(80,80));
		car.setPreferredSize(new Dimension(80,80));
		Snowman.setPreferredSize(new Dimension(80,80));
		
		
		OlympicRing.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				shape = new OlympicRingShape(25,25,25);
				
			}
			
			
		});

		car.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				shape = new CarShape(50,50,50);
				
			}
			
		});
		
		Snowman.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				shape = new SnowMan(25,25,25);
			
				
			}
			
		});
		
		panel.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				
				shape.setXLocation(e.getX());
				shape.setYLocation(e.getY());
				Graphics2D g2 = (Graphics2D)panel.getGraphics();
				shape.draw(g2);
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		ButtPanel.add(Snowman);
		ButtPanel.add(car);
		ButtPanel.add(OlympicRing);
		
		
		frame.add(ButtPanel,BorderLayout.NORTH);
		frame.add(panel,BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	 

}
