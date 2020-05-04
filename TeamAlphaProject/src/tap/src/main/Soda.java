package tap.src.main;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import tap.src.main.classes.PowerDown;

public class Soda extends GameObject implements PowerDown {
	private Textures text;
	Random r= new Random();
	
	public Soda(double x,double y,Textures text)
	{
		super(x, y);
		this.text=text;
	}
	
	public void tick()
	{
		y+=r.nextInt(5)+1;
		if(y>WaterGame.HEIGHT*WaterGame.SCALE)
		{
			y+=r.nextInt(5)+1;
			y=-10;
			x=r.nextInt(WaterGame.WIDTH*WaterGame.SCALE);
		}
	}
	
	public void render(Graphics graphic)
	{
		graphic.drawImage(text.soda,(int)x,(int)y,null);
		graphic.drawRect((int)x, (int)y, 32, 32);
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
