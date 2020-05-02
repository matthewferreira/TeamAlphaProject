package tap.src.main;

import java.awt.Graphics;

public class WaterBottle {
	private double x,y;
	private Textures text;
	
	public WaterBottle(double x,double y,Textures text)
	{
		this.x=x;
		this.y=y;
		this.text=text;
	}
	
	public void tick()
	{
		y+=5;
	}
	
	public void render(Graphics graphic)
	{
		graphic.drawImage(text.vending,(int)x,(int)y,null);
	}


}
