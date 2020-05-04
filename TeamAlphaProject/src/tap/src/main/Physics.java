package tap.src.main;

import tap.src.main.classes.Ally;
import tap.src.main.classes.Foe;

import java.util.LinkedList;

public class Physics {
	
	public static boolean Collision(Ally enta, Foe entb) {

		if(enta.getBounds().intersects(entb.getBounds())) {
			return true;
		}		
		return false;
	}
	
	public static boolean Collision(Foe entb, Ally enta) {

		if(entb.getBounds().intersects(enta.getBounds())) {
				return true;
		}
		
		return false;
	}
}
