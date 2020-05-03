package tap.src.main;

import java.awt.Graphics;
import java.util.Random;

public class VendingMachine implements Entity {
	
	private double x,y;
	private Textures text;
	Random r= new Random();
	
	public VendingMachine(double x,double y,Textures text)
	{
		this.x=x;
		this.y=y;
		this.text=text;
	}
	
	public void tick()
	{
		y+=3;
		if(y>waterGame.HEIGHT*waterGame.SCALE)
		{
			y=0;
			x=r.nextInt(waterGame.WIDTH*waterGame.SCALE);
		}
	}
	
	public void render(Graphics graphic)
	{
		graphic.drawImage(text.vending,(int)x,(int)y,null);
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
