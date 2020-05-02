package tap.src.main;

import java.awt.Graphics;
import java.util.Random;

public class Soda {
	private double x,y;
	private Textures text;
	Random r= new Random();
	
	public Soda(double x,double y,Textures text)
	{
		this.x=x;
		this.y=y;
		this.text=text;
	}
	
	public void tick()
	{
		y+=3;
		if(y>waterGame.HEIGHT*waterGame.SCALE)
		{
			y=0;
			x=r.nextInt(waterGame.WIDTH*waterGame.SCALE);
		}
	}
	
	public void render(Graphics graphic)
	{
		graphic.drawImage(text.soda,(int)x,(int)y,null);
	}
	

}
