package tap.src.main;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import tap.src.main.classes.PowerDown;

public class Soda extends GameObject implements PowerDown {
	private Textures text;
	Random r= new Random();
	Animation anim;
	
	public Soda(double x,double y,Textures text)
	{
		super(x, y);
		this.text=text;
		
		anim=new Animation(5,text.soda[0],text.soda[1]);
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
