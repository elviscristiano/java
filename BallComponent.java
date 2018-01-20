package question3;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JComponent;

/**
* Creates a ball's component class.
*
* @author  Elvis Tolotti
* @version 1.0
* @since   2017-08-07
*/
public class BallComponent extends JComponent
{
	private ArrayList<Ball> allBalls;
	private Ball aBall;

	/**
	* Constructor
	*/
	public BallComponent()
	{
		allBalls = new ArrayList<Ball>();
	}

	/**
	* Draw the balls
	* @param graph Graphics
	*/
	public void paintComponent(Graphics graph) {
		for (int i = 0; i < allBalls.size(); i++)
		{
			allBalls.get(i).draw((Graphics2D) graph);
		}
	}

	/**
	* Add a ball and implements run() Runnable method
	*/
	public void addABall()
	{
		private static final int BALL_X = 200;
		private static final int BALL_Y = 0;
		private static final int BALL_WIDTH = 30;
		private static final int BALL_HEIGHT = 30;
		
		aBall = new Ball(BALL_X,BALL_Y,BALL_WIDTH,BALL_HEIGHT,this);

		/**
		* Implements a runnable inner class
		*/
		class A implements Runnable
		{

			@Override
			public void run()
			{
				try
				{
					aBall.animate();
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}

		}
		allBalls.add(aBall);
		Runnable a = new A();
		Thread t = new Thread(a);
		t.start();
	}

}
