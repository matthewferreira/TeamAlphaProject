package tap.src.main;

import java.awt.Graphics;
import java.util.LinkedList;
import java.util.Random;

import tap.src.main.classes.Ally;
import tap.src.main.classes.Foe;
import tap.src.main.classes.PowerDown;
import tap.src.main.classes.PowerUp;

public class Controller {
	
	private LinkedList<Ally> ea=new LinkedList<Ally>();
	private LinkedList<Foe> eb=new LinkedList<Foe>();
	private LinkedList<PowerUp> pu=new LinkedList<PowerUp>();
	private LinkedList<PowerDown> pd=new LinkedList<PowerDown>();
	
	
	Ally enta;
	Foe entb;
	PowerUp entpu;
	PowerDown entpd;
	
	Random r =new Random();
	private Textures text;
	
	public Controller(Textures text)
	{

		this.text=text;
		
	}
	
	public void tick()
	{
		//Ally Class
		for(int i=0;i<ea.size();i++)
		{
			enta=ea.get(i);
			enta.tick();
		}
		
		//Foe Class
		for(int i=0;i<eb.size();i++)
		{
			entb=eb.get(i);
			entb.tick();
		}
		
		//PowerUp Class
		for(int i=0;i<pu.size();i++)
		{
			entpu=pu.get(i);
			entpu.tick();
		}
		
		//PowerDown Class
		for(int i=0;i<pd.size();i++)
		{
			entpd=pd.get(i);
			entpd.tick();
		}
	}
	
	public void render(Graphics graphic)
	{
		//Ally Class
		for(int i=0;i<ea.size();i++)
		{
			enta=ea.get(i);
			enta.render(graphic);
		}		
		
		//Foe Class
		for(int i=0;i<eb.size();i++)
		{
			entb=eb.get(i);
			entb.render(graphic);
		}	
		
		//PowerUp Class
		for(int i=0;i<pu.size();i++)
		{
			entpu=pu.get(i);
			entpu.render(graphic);
		}		
		
		//PowerDown Class
		for(int i=0;i<pd.size();i++)
		{
			entpd=pd.get(i);
			entpd.render(graphic);
		}	
	}
	
	public void addEntity(Ally block)
	{
		ea.add(block);
	}
	
	public void removeEntity(Ally block)
	{
		ea.remove(block);
	}
	
	public void addEntity(Foe block)
	{
		eb.add(block);
	}
	
	public void removeEntity(Foe block)
	{
		eb.remove(block);
	}
	
	public void addEntity(PowerUp block)
	{
		pu.add(block);
	}
	
	public void removeEntity(PowerUp block)
	{
		pu.remove(block);
	}
	
	public void addEntity(PowerDown block)
	{
		pd.add(block);
	}
	
	public void removeEntity(PowerDown block)
	{
		pd.remove(block);
	}
	
	public LinkedList<Ally> getAlly(){
		return ea;
	}
	
	public LinkedList<Foe> getFoe(){
		return eb;
	}
	
	public LinkedList<PowerUp> getPowerUp(){
		return pu;
	}
	
	public LinkedList<PowerDown> getPowerDown(){
		return pd;
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
