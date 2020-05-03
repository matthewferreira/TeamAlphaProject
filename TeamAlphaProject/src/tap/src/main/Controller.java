package tap.src.main;

import java.awt.Graphics;
import java.util.LinkedList;
import java.util.Random;

public class Controller {
	
	private LinkedList<Entity> e=new LinkedList<Entity>();
	Entity ent;
	Random r =new Random();
	private Textures text;
	
	public Controller(Textures text)
	{

		this.text=text;
		for(int i=0;i<20;i++)
		{
		addEntity(new VendingMachine(r.nextInt(640),0,text));
		}
	}
	
	public void tick()
	{
		for(int i=0;i<e.size();i++)
		{
			ent=e.get(i);
			ent.tick();
		}
	}
	
	public void render(Graphics graphic)
	{
		for(int i=0;i<e.size();i++)
		{
			ent=e.get(i);
			ent.render(graphic);
		}		
	}
	
	public void addEntity(Entity block)
	{
		e.add(block);
	}
	
	public void removeEntity(Entity block)
	{
		e.remove(block);
	}
	

}
