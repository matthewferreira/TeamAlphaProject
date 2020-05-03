package tap.src.main;

import java.awt.Graphics;
import java.util.Random;

public class VendingMachine extends GameObject implements Entity {

	private Textures text;
	Random r= new Random();
	
	public VendingMachine(double x,double y,Textures text)
	{
		super(x, y);
		this.text=text;
	}
	
	public void tick()
	{
		y+=r.nextInt(5)+1;
		if(y>waterGame.HEIGHT*waterGame.SCALE)
		{
			y+=r.nextInt(5)+1;
			y=-10;
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
