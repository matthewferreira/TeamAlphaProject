package tap.src.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;


public class Menu {
	
	public Rectangle playButton = new Rectangle(waterGame.WIDTH/2+100, 200, 120, 50);
	public Rectangle quitButton = new Rectangle(waterGame.WIDTH/2+100, 300, 120, 50);
	
	
	public void render(Graphics g) {
		

		Graphics2D g2d = (Graphics2D) g;
		
		Font fnt0 = new Font("SANS_SERIF", Font.BOLD, 45);
		Font fnt1 = new Font("SANS_SERIF", Font.BOLD, 30);
		Font fnt2 = new Font("SANS_SERIF", Font.BOLD, 30);
		
		//Title, center
		g.setFont(fnt0);
		g.setColor(Color.white);
		g.drawString("HYDRATION SIMULATOR", 50, 100); 
	
		//Play Button
		g.setFont(fnt1);
		g.setColor(Color.green);
		//g.fillRoundRect(waterGame.WIDTH/2+120, 150 , 100, 50, 50, 50);
		g.fillRect(waterGame.WIDTH/2+100, 200, 120, 50);
		g.setColor(Color.black);
		g.drawString("PLAY", playButton.x + 19, playButton.y + 37);
		g2d.draw(playButton);
		
		//Quit Button
		g.setFont(fnt2);
		g.setColor(Color.red);
		//g.fillRoundRect(waterGame.WIDTH/2+120, 250 , 100, 50, 50, 50);
		g.fillRect(waterGame.WIDTH/2+100, 300, 120, 50);
		g.setColor(Color.black);
		g.drawString("QUIT", quitButton.x + 19, quitButton.y + 37);
		g2d.draw(quitButton);
	}
}
