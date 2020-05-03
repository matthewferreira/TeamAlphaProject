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
	
	public void addVm(int VmCount)
	{
		for(int i=0;i<VmCount;i++)
		{
			addEntity(new VendingMachine(r.nextInt(640),-10,text));
		}
	}
	
	public void addSoda(int SodaCount)
	{
		for(int i=0;i<SodaCount;i++)
		{
			addEntity(new Soda(r.nextInt(640),-10,text));
		}
	}
	
	public void addWb(int WbCount)
	{
		for(int i=0;i<WbCount;i++)
		{
			addEntity(new WaterBottle(r.nextInt(640),-10,text));
		}
	}

}
