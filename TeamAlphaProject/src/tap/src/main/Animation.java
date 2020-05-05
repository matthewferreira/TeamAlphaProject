package tap.src.main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Animation {
//Currently only supports 2 frame animations...
		private int speed;
		private int frames;
		private int index = 0;
		private int count = 0;
		
		private BufferedImage img1;
		private BufferedImage img2;
		private BufferedImage currentImg;
		
		public Animation(int speed,BufferedImage img1,BufferedImage img2) {

			this.speed = speed;
			this.img1 = img1;
			this.img2 = img2;
			frames=2;
			
		}
		
		public void runAnimation() // Puts all the sprite sheets in an array.
		{
			index++;
			if(index>speed)
			{
				index=0;
				nextFrame();
			}

		}

		public void nextFrame()//Change the current image with the next sprite.
		{
			if(count==0)
				currentImg=img1;
			if(count==1)
				currentImg=img2;
			count++;
			if(count>frames)
			count=0;
			
		}
		
		public void drawAnimation(Graphics g,double x,double y,int offset)
		{
			g.drawImage(currentImg,(int)x-offset,(int)y,null);
		}
		
		public void setCount(int count)
		{
			this.count=count;
		}
		
		public int getCount()
		{
			return count;
		}
		
		public void setSpeed(int speed)
		{
			this.speed=speed;
		}
		
		public int getSpeed()
		{
			return speed;
		}
				
}

