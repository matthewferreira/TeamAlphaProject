import java.awt.*;
import javax.swing.*;

/** * A window containing a PIN entry pad. */
public class PINPadWindow extends JFrame
{    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
/**     * Default Constructor.     */    
	public PINPadWindow()    
	{        
		super();        
		setupLayout();    
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		pack();
		setResizable(false);
	}  
	/**     * Setup and layout this PINPadWindow     */    
	private void setupLayout()    
	{        
		Container contentPane;
		setSize(300, 300);         
		contentPane = getContentPane();        
		// Layout this PINPadWindow   
		Display d = new Display();
		NumberPad np = new NumberPad(d);
		contentPane.add(d, BorderLayout.NORTH);
		contentPane.add(np);
	}
}
