package tap.src.main;

import java.awt.Graphics;
import java.awt.Rectangle;

import tap.src.main.classes.Ally;


public class MainCharacter extends GameObject implements Ally {
	
	private double vX=0;//velocity
	private double vY=0;
	
	private Textures text;
	
	waterGame game;
	Controller controller;
	
	public MainCharacter(double x, double y,Textures text, waterGame game, Controller controller)//constructor
	{
		super(x, y);
		this.text=text;
		this.game=game;
		this.controller = controller;
		
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
		
		// See if collision is working (placerholder)	
		if(Physics.Collision(this, game.eb)) {
			System.out.println("COLLISION DETECTED");
		}
	
					
//THIS RELATES TO THE HEALTH BAR, NEED COLLISION DONE TO USE THIS
	/*	for(int i=0; i<game.eb.size(); i++) {
			EntityB tempEnt = game.eb.get(i);
			
			if(Physics.Collision(this, tempEnt)) {
				controller.removeEntity(TempEnt);
				game.HEALTH -= 10;
				game.setEnemy_killed(game.getEnemy_killed() + 1);
			}
		} */
		
		
		
	}
	
	public void render(Graphics graphic)
	{
		graphic.drawImage(text.mc, (int)x, (int)y, null);
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
