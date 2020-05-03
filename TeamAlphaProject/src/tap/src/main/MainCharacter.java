package tap.src.main;

import java.awt.Graphics;


public class MainCharacter extends GameObject {
	
	private double vX=0;//velocity
	private double vY=0;
	
	private Textures text;
	
	public MainCharacter(double x, double y,Textures text)//constructor
	{
		super(x, y);
		this.text=text;
	
	}
	
	public void tick()
	{
		x+=vX;
		y+=vY;
		
		if(x<=0)//set borders
		{
			x=0;
		}
		if(x>=640-20)
		{
			x=640-20;
		}
		if(y<=0)
		{
			y=0;
		}
		if(y>=480-32)
		{
			y=480-32;
		}
	}
	
	public void render(Graphics graphic)
	{
		graphic.drawImage(text.mc, (int)x, (int)y, null);
		graphic.drawRect((int)x, (int)y, 32, 32);
	}
	
	public double getX()
	{
		return x;
	}
	public double getY()
	{
		return y;
	}
	public void setX(double x)
	{
		this.x=x;
	}
	public void setY(double y)
	{
		this.y=y;
	}
	public void setVelocityX(double vX)
	{
		this.vX=vX;
	}
	public void setVelocityY(double vY)
	
	{
		this.vY=vY;
	}

}
