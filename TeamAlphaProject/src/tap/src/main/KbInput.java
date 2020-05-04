package tap.src.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KbInput extends KeyAdapter {
	
	WaterGame game;
	
	public KbInput(WaterGame game)//constructor
	{
		this.game=game;
	}
	
	public void keyPressed(KeyEvent e)
	{
		game.keyPressed(e);
	}
	
	public void keyReleased(KeyEvent e)
	{
		game.keyReleased(e);
	}
	
	

}
