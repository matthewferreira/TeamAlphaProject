package tap.src.main;

import tap.src.main.classes.Ally;
import tap.src.main.classes.Foe;

import java.util.LinkedList;

public class Physics {
	
	public static boolean Collision(Ally enta, LinkedList<Foe> entb) {
		
		for(int i = 0; i < entb.size(); i++) {
			
			if(enta.getBounds().intersects(entb.get(i).getBounds())) {
				return true;
			}
			
		}		
		return false;
	}
	public static boolean Collision(Foe entb, LinkedList<Ally> enta) {
		
		for(int i = 0; i < enta.size(); i++) {
			
			if(entb.getBounds().intersects(enta.get(i).getBounds())) {
				return true;
			}
			
		}
		
		return false;
	}
}
