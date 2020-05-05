package tap.src.main;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class waterGameTest {

	@Test
	public void Vmkilledtest() {
		int VmKilled = 0;
		waterGame game;
		game = new waterGame();
		assertEquals(0,game.getVmKilled());
	}

}
