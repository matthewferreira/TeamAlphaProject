package tap.src.main;

import java.awt.image.BufferedImage;

public class Textures {
	
	public BufferedImage mc,coin;

	public BufferedImage[]vending =new BufferedImage[2];
	public BufferedImage[]soda =new BufferedImage[2];
	public BufferedImage[]water =new BufferedImage[2];
	private SpriteSheet sprite;
	
	public Textures(waterGame game)
	{
		 sprite=new SpriteSheet(game.getSpriteSheet());
		 
		 getTextures();
			
	}
	
	private void getTextures()
	{
		mc=sprite.grabImage(1, 1, 32, 32);
		coin=sprite.grabImage(1, 2, 32, 32);
		
		vending[0]=sprite.grabImage(5, 1, 32, 32);
		vending[1]=sprite.grabImage(6, 1, 32, 32);
		
		soda[0]=sprite.grabImage(3, 1, 32, 32);
		soda[1]=sprite.grabImage(4, 1, 32, 32);
		
		water[0]=sprite.grabImage(7, 1, 32, 32);
		water[1]=sprite.grabImage(8, 1, 32, 32);
	}
	

}
