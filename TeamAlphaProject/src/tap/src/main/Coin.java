package tap.src.main;
//
import java.awt.Graphics;
import java.awt.Rectangle;

import tap.src.main.classes.Ally;



public class Coin extends GameObject implements Ally {
	private Textures text;
	private waterGame game;
	
	public Coin(double x, double y, Textures text, waterGame game)
	{
		super(x, y);
		this.text=text;
		this.game=game;
		
	}
	
	public void tick()
	{
		y-=10;
				
	}
	
	public void render(Graphics graphic)
	{
		graphic.drawImage(text.coin,(int) x,(int) y, null);
	}
	
	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, 32, 32);
	}
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
}
