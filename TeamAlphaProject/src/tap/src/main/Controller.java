package tap.src.main;

import java.awt.Graphics;
import java.util.LinkedList;

public class Controller {
	
	private LinkedList<Coin> c=new LinkedList<Coin>();
	private LinkedList<VendingMachine>vm=new LinkedList<VendingMachine>();
	private LinkedList<Soda>s=new LinkedList<Soda>();
	private LinkedList<WaterBottle>wb=new LinkedList<WaterBottle>();
	
	Coin TempCoin;
	VendingMachine TempVm;
	Soda TempSoda;
	WaterBottle TempWb;
	waterGame game;
	Textures text;
	
	public Controller(waterGame game, Textures text)
	{
		this.game=game;
		this.text=text;
		for(int x=0;x<waterGame.WIDTH*waterGame.SCALE;x+=64)
		{
			addVendingMachine(new VendingMachine(x,0,text));
		}
		
	}
	
	public void tick()
	{
		for(int i=0;i<c.size();i++)
		{
			TempCoin=c.get(i);
			
			if(TempCoin.getY()<0)
				removeCoin(TempCoin);
			
			TempCoin.tick();
		}
		
		for(int i=0;i<vm.size();i++)
		{
			TempVm=vm.get(i);
			TempVm.tick();
		}
		
		for(int i=0;i<s.size();i++)
		{
			TempSoda=s.get(i);
			TempSoda.tick();
		}
		
		for(int i=0;i<wb.size();i++)
		{
			TempWb=wb.get(i);
			TempWb.tick();
		}
	}
	
	public void render(Graphics graphic)
	{
		for(int i=0;i<c.size();i++)
		{
			TempCoin=c.get(i);
			
			TempCoin.render(graphic);
		}
		
		for(int i=0;i<vm.size();i++)
		{
			TempVm=vm.get(i);
			
			TempVm.render(graphic);
		}
		
		for(int i=0;i<s.size();i++)
		{
			TempSoda=s.get(i);
			
			TempSoda.render(graphic);
		}
		
		for(int i=0;i<wb.size();i++)
		{
			TempWb=wb.get(i);
			
			TempWb.render(graphic);
		}
		
		
	}
	
	public void addCoin(Coin block)
	{
		c.add(block);
		
	}
	
	public void removeCoin(Coin block)
	{
		c.remove(block);
	}
	
	public void addVendingMachine(VendingMachine block)
	{
		vm.add(block);
		
	}
	
	public void removeVendingMachine(VendingMachine block)
	{
		vm.remove(block);
	}
	
	public void addSoda(Soda block)
	{
		s.add(block);
		
	}
	
	public void removeSoda(Soda block)
	{
		s.remove(block);
	}
	
	public void addWaterBottle(WaterBottle block)
	{
		wb.add(block);
		
	}
	
	public void removeWaterBottle(WaterBottle block)
	{
		wb.remove(block);
	}

}
