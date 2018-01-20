package question3;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
* Creates a ball's component frame.
*
* @author  Elvis Tolotti
* @version 1.0
* @since   2017-08-07
*/
public class BallFrame extends JFrame
{
	private JButton button;
	private BallComponent component;

	/**
	* Constructor
	*/
	public BallFrame()
	{
		component = new BallComponent();
		button = new JButton("Add a ball");
		this.setLayout(new BorderLayout());
		add(button, BorderLayout.PAGE_END);
		//button listener
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				component.addABall();
		    }
		});
		this.add(component,BorderLayout.CENTER);
	}

}
