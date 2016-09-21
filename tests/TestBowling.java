import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test() {
	 Frame frame = new Frame(2,4);
	 
	 
	 
	 assertEquals(2, frame.getFirstThrow());
	 assertEquals(4, frame.getSecondThrow());
	}
	
	@Test
	public void testScore() {
	 Frame frame = new Frame(2,6);
	 
	 
	 
	 assertEquals(8, frame.score());

	}
	@Test
	public void testGame_10frames() {
	BowlingGame Game = new BowlingGame();
	 Frame frame = new Frame(2,6);
	 Frame frame = new Frame(2,6);
	 Frame frame = new Frame(2,6);
	 Frame frame = new Frame(2,6);
	 Frame frame = new Frame(2,6);
	 Frame frame = new Frame(2,6);
	 Frame frame = new Frame(2,6);
	 Frame frame = new Frame(2,6);
	 Frame frame = new Frame(2,6);
	 Frame frame = new Frame(2,6);
	 
	 assertEquals(8, frame.score());

	}

}
