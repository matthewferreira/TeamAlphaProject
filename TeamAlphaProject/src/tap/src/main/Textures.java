package tap.src.main;

import java.awt.image.BufferedImage;

public class Textures {
	public BufferedImage mc,coin,vending,soda,water;
	private SpriteSheet sprite;
	
	public Textures(WaterGame game)
	{
		 sprite=new SpriteSheet(game.getSpriteSheet());
		 
		 getTextures();
			
	}
	
	private void getTextures()
	{
		mc=sprite.grabImage(1, 1, 32, 32);
		coin=sprite.grabImage(1, 2, 32, 32);
		vending=sprite.grabImage(5, 1, 32, 32);
		soda=sprite.grabImage(3, 1, 32, 32);
		water=sprite.grabImage(7, 1, 32, 32);
	}
	

}
