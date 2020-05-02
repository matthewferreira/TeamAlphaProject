package tap.src.main;

import java.awt.Graphics;

public class Soda {
	private double x,y;
	private Textures text;
	
	public Soda(double x,double y,Textures text)
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
		graphic.drawImage(text.soda,(int)x,(int)y,null);
	}


}
