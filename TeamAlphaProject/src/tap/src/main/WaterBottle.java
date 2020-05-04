package tap.src.main;
//
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import tap.src.main.classes.PowerUp;

public class WaterBottle extends GameObject implements PowerUp {

	private Textures text;
	Random r= new Random();
	waterGame game;
	Controller c;
	Animation anim;
	
	public WaterBottle(double x,double y,Textures text, Controller c, waterGame game)
	{
		super(x, y);
		this.text=text;
		this.game=game;
		this.c=c;
		anim=new Animation(5,text.water[0],text.water[1]);
	}
	
	public void tick()
	{
		y+=r.nextInt(5)+1;
		if(y>waterGame.HEIGHT*waterGame.SCALE)
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
		anim.runAnimation();
	}
	
	public void render(Graphics graphic)
	{
		anim.drawAnimation(graphic, x, y, 0);
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
