package tap.src.main;

import java.awt.Graphics;

public interface Entity {

	public void tick();
	public void render(Graphics graphic);
	public double getX();
	public double getY();
	
}
