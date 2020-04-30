import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/** * A numeric keypad */

public class NumberPad extends JPanel
{    
	private ActionListener listener;

	/**     * Default Constructor     */    
	public NumberPad(ActionListener listener)    
	{        
		super();        
		this.listener = listener;
		setupLayout();    
	}    
	
	/**     * Setup and layout this NumberPad     */    
	private void setupLayout()    
	{        // Setup and layout this NumberPad    }}
		setLayout(new GridLayout(4,3));
		
		for(int i = 1; i < 10; i++ ) 
		{
			addButton("" + i);
		}
		
		addButton("Del");
		addButton("0");
		addButton("C");
	}
	
	private void addButton(String name) 
	{
		JButton btn = new JButton(name);
		btn.addActionListener(listener);
		add(btn);
		
		
	}
	
	
}