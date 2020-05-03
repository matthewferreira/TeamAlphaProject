package tap.src.main.classes;

import java.awt.Graphics;
import java.awt.Rectangle;

public interface Foe {

	public void tick();
	public void render(Graphics graphic);
	public Rectangle getBounds();
	
	public double getX();
	public double getY();
	
}
