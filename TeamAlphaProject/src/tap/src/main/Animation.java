package tap.src.main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
//handles animation
public class Animation {

		private int speed;
		private int frames;
		private int index = 0;
		private int count = 0;
		private int col;//The number of columns of the image to run the animation.
		private int row;//The number of rows of the image to run the animation
		private BufferedImage image;//image to get the sprite sheets.
		private BufferedImage[] images;//array of sprites
		private BufferedImage currentImage;//current sprite
		private boolean alive;//find out if animation is finished

		public Animation(BufferedImage image, int frames, int speed, int col, int row) {

			this.image = image;

			this.frames = frames;

			this.speed = speed;
			this.col = col;
			this.row = row;
			images = new BufferedImage[frames];
			alive = true;

			fillSprites();

		}
		
		public void fillSprites() // Puts all the sprite sheets in an array.
		{

			SpriteSheet ss = new SpriteSheet(image);

			int k = 0;

			for (int i = 1; i <= row; i++) {

				for (int j = 1; j <= col; j++, k++) {

					images[k] = ss.grabImage(i, j, (int) image.getWidth() / col, (int) image.getHeight() / row);

				}

			}

		}

		public void nextFrame()//Change the current image with the next sprite.
		{

			currentImage = images[count];

			count++;

			if (count >= frames - 1) {  // You can modify frames - 1 to another number if your image does not have sprite sheets in all the image.
										// If your image has sprite sheets in all the image you can put only frames.
				alive = false;
				count = 0;

			}

		}

		public boolean isAlive() {
			return alive;
		}

		public void setAlive(boolean alive) {
			this.alive = alive;
		}

		public void runAnimation()//Uses the method next frames to simulate an animation changing frames in an execution
		{

			index++;
			if (index > speed) {

				index = 0;
				nextFrame();

			}

		}

		public void drawAnimation(Graphics g, double x, double y, int offset) {

			g.drawImage(currentImage, (int) x - offset, (int) y, null);

		}

		public void setImage(BufferedImage image) {
			
		this.image = image;	
			
		}
		
		public void setFrames(int frames) {
		
		this.frames = frames;
		}
		
		public void setCol(int col) {
		
			this.col = col;
			
		}
		
		public void setRow(int row) {
			
		this.row = row;	
			
		}
			
}
