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
	BowlingGame game = new BowlingGame();
	Frame frame1 = new Frame(1,5);
	 game.addFrame(frame1);
	 Frame frame2 = new Frame(3,6);
	 game.addFrame(frame2);
	 Frame frame3 = new Frame(7,2);
	 game.addFrame(frame3);
	 Frame frame4 = new Frame(3,6);
	 game.addFrame(frame4);
	 Frame frame5 = new Frame(4,4);
	 game.addFrame(frame5);
	 Frame frame6 = new Frame(5,3);
	 game.addFrame(frame6);
	 Frame frame7 = new Frame(3,3);
	 game.addFrame(frame7);
	 Frame frame8 = new Frame(4,5);
	 game.addFrame(frame8);
	 Frame frame9 = new Frame(8,1);
	 game.addFrame(frame9);
	 Frame frame10 = new Frame(2,6);
	 game.addFrame(frame10);
	 
	 assertEquals(81, game.score());

	}
	@Test
	public void testGame_10frames_strike() {
	BowlingGame game = new BowlingGame();
	Frame frame1 = new Frame(10,0);
	 game.addFrame(frame1);
	 Frame frame2 = new Frame(3,6);
	 game.addFrame(frame2);
	 Frame frame3 = new Frame(7,2);
	 game.addFrame(frame3);
	 Frame frame4 = new Frame(3,6);
	 game.addFrame(frame4);
	 Frame frame5 = new Frame(4,4);
	 game.addFrame(frame5);
	 Frame frame6 = new Frame(5,3);
	 game.addFrame(frame6);
	 Frame frame7 = new Frame(3,3);
	 game.addFrame(frame7);
	 Frame frame8 = new Frame(4,5);
	 game.addFrame(frame8);
	 Frame frame9 = new Frame(8,1);
	 game.addFrame(frame9);
	 Frame frame10 = new Frame(2,6);
	 game.addFrame(frame10);
	 
	 assertEquals(95, game.score());

	}
	@Test
	public void testGame_10frames_spare() {
	BowlingGame game = new BowlingGame();
	Frame frame1 = new Frame(1,9);
	 game.addFrame(frame1);
	 Frame frame2 = new Frame(4,6);
	 game.addFrame(frame2);
	 Frame frame3 = new Frame(7,3);
	 game.addFrame(frame3);
	 Frame frame4 = new Frame(3,6);
	 game.addFrame(frame4);
	 Frame frame5 = new Frame(4,4);
	 game.addFrame(frame5);
	 Frame frame6 = new Frame(5,3);
	 game.addFrame(frame6);
	 Frame frame7 = new Frame(3,3);
	 game.addFrame(frame7);
	 Frame frame8 = new Frame(4,5);
	 game.addFrame(frame8);
	 Frame frame9 = new Frame(8,1);
	 game.addFrame(frame9);
	 Frame frame10 = new Frame(2,6);
	 game.addFrame(frame10);
	 
	 assertEquals(88, game.score());

	}

}
