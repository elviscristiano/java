package question3;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Random;
import javax.swing.JComponent;

/**
* Creates a ball class.
*
* @author  Elvis Tolotti
* @version 1.0
* @since   2017-08-07
*/
public class Ball
{
	private double width;
	private double height;
	private int x;
	private int y;
	private int dx;
	private int dy;
	private JComponent repaintObj;
	private Color color;

	/**
	* Constructor
	* @param x
	* @param y
	* @param width
	* @param height
	* @param jc JComponent
	*/
	public Ball(int x, int y, double width, double height, JComponent jc)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.dx = 2;
		this.dy = 2;
		this.repaintObj = jc;
		this.color = setRandomColor();
	}

	/**
	* Draws the ball
	* @param g Graphis2D
	*/
	public void draw(Graphics2D g)
	{
		g.fill(new Ellipse2D.Double(x, y, width, height));
		g.setColor(color);
	}

	/**
	* Set the color of the ball with random colors
	*/
	public Color setRandomColor()
	{
		Random random = new Random();
		Color ballColor = new Color(random.nextFloat(),random.nextFloat(), random.nextFloat());
		return ballColor;
	}

	/**
	* Move the ball
	* @param x
	* @param y
	* @throws InterruptedException
	*/

	public void move(int dx, int dy) throws InterruptedException
	{
		if (x < 0 || x > (BallViewer.getFrameWidth() + width))
		{
			int bounceXaux = BallViewer.getFrameWidth();
			while (bounceXaux > 0)
			{
				bounceXaux--;
				x = bounceXaux;
				y = bounceXaux;
				Thread.sleep(10);
				repaintObj.repaint();
			}
		}
		else
		{
			x += dx;
		}
		if (y < 0 || y > (BallViewer.getFrameHeight() + height))
		{
			int bounceYaux = BallViewer.getFrameHeight();
			while (bounceYaux > 0)
			{
				bounceYaux--;
				y = bounceYaux;
				x = bounceYaux;
				Thread.sleep(10);
				repaintObj.repaint();
			}
		}
		else
		{
			y += dy;
		}
	}

	/**
	* Animate the ball
	* @throws InterruptedException
	*/
	public void animate() throws InterruptedException
	{
		while(true)
		{
			this.move(1, 1);
			Thread.sleep(10);
			repaintObj.repaint();
		}
	}

}
