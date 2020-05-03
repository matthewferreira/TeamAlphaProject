package tap.src.main;

import java.awt.Graphics;


public class Coin extends GameObject implements Entity {
	private double x,y;
	private Textures text;
	
	public Coin(double x,double y,Textures text)
	{
		super(x, y);
		this.text=text;
		
	}
	
	public void tick()
	{
		y-=10;
	}
	
	public void render(Graphics graphic)
	{
		graphic.drawImage(text.coin,(int) x,(int) y, null);
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
