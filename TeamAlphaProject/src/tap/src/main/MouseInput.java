package tap.src.main;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInput implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int mx = e.getX();
		int my = e.getY();
		
		
		//Play button
		if(mx >= waterGame.WIDTH/2+120 && mx <= waterGame.WIDTH/2+220) {
			if(my >= 150 && my <= 200) {
				waterGame.State = waterGame.STATE.GAME;
			}
		}
		
		//Quit button
		if(mx >= waterGame.WIDTH/2+120 && mx <= waterGame.WIDTH/2+220) {
			if(my >= 250 && my <= 300) {
				System.exit(1);
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
