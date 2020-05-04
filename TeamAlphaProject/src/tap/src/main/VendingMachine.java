package tap.src.main;
//
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import tap.src.main.classes.Ally;
import tap.src.main.classes.Foe;

public class VendingMachine extends GameObject implements Foe {

	private Textures text;
	Random r= new Random();
	private waterGame game;
	private Controller c;
	Animation anim;
	
	public VendingMachine(double x,double y,Textures text, Controller c, waterGame game)
	{
		super(x, y);
		this.text=text;
		this.c = c;
		this.game = game;
		
		anim=new Animation(5,text.vending[0],text.vending[1]);
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
		
		for(int i = 0; i < game.ea.size(); i++) {
			
			Ally tempEnt = game.ea.get(i);
			
			if(Physics.Collision(this, tempEnt))
			{
				c.removeEntity(tempEnt);
				c.removeEntity(this);
				game.setVmKilled(game.getVmKilled()+1);
			}
			
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
