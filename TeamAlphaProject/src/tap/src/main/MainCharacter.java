package tap.src.main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class MainCharacter {
	
	private double x;//x coordinate
	private double y;//y coordinate
	
	private double vX=0;//velocity
	private double vY=0;
	
	private BufferedImage player;
	
	public MainCharacter(double x, double y,waterGame game)//constructor
	{
		this.x=x;
		this.y=y;
		SpriteSheet sprite= new SpriteSheet(game.getSpriteSheet());
		
		player=sprite.grabImage(1,1,32,32);
	}
	
	public void tick()
	{
		x+=vX;
		y+=vY;
		
		if(x<=0)
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
		graphic.drawImage(player, (int)x, (int)y, null);
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
