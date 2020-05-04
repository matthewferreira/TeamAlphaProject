package tap.src.main;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import tap.src.main.classes.PowerUp;

public class WaterBottle extends GameObject implements PowerUp {

	private Textures text;
	Random r= new Random();
	WaterGame game;
	Controller c;
	
	public WaterBottle(double x,double y,Textures text, Controller c, WaterGame game)
	{
		super(x, y);
		this.text=text;
		this.game=game;
		this.c=c;
	}
	
	public void tick()
	{
		y+=r.nextInt(5)+1;
		if(y>WaterGame.HEIGHT*WaterGame.SCALE)
		{
			//Do-nothing
			/*
			y+=r.nextInt(5)+1;
			y=-10;
			x=r.nextInt(waterGame.WIDTH*waterGame.SCALE);
			*/
			c.removeEntity(this);
			game.setWbCount(game.getWbCount()-1);
		}
	}
	
	public void render(Graphics graphic)
	{
		graphic.drawImage(text.water,(int)x,(int)y,null);
		graphic.drawRect((int)x, (int)y, 32, 32); // change 32 to 16
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
