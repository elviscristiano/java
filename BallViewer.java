package question3;

import javax.swing.JFrame;

/**
* Creates a ball's frame viewer class.
*
* @author  Elvis Tolotti
* @version 1.0
* @since   2017-08-07
*/
public class BallViewer
{
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 400;

	public static void main(String[] args)
	{
		JFrame frame = new BallFrame();
	    frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	    frame.setTitle("Ball frame");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
	}

	/**
	* Get the frame width
	* @return frame width
	*/
	public static int getFrameWidth()
	{
		return FRAME_WIDTH;
	}

	/**
	* Get the frame height
	* @return frame height
	*/
	public static int getFrameHeight()
	{
		return FRAME_HEIGHT;
	}
}
