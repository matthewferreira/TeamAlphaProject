import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Display extends JLabel implements ActionListener
{

	/**
	 * 
	 */
	private String contents;
	private static final long serialVersionUID = 1L;

	//private static final String ERASE_TO_THE_LEFT = "Del";
	
	private static final String CLEAR = "C";
	
	public Display() 
	{
		super(" ", SwingConstants.RIGHT);
		setBorder(BorderFactory.createEtchedBorder());
		contents = "";
		updateDisplay();
	}
	
	public void actionPerformed(ActionEvent ae) 
	{
		String ac;
		
		ac = ae.getActionCommand();
		if(ac.contentEquals(CLEAR)) 
		{
			setText(" ");
		}
		else 
		{
			setText(getText()+ac);
		}
	}
	
	private void updateDisplay() 
	{
		if(contents.equals("")) 
		{
			setForeground(Color.GRAY);
			setText("Enter your PIN");
		}
		else 
		{
			String asterisks = "";
			for(int i = 0; i < contents.length(); i++) 
			{
				asterisks += "*";
			}
			setForeground(Color.RED);
			setText(asterisks);
		}
	}
}