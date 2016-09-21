import java.util.ArrayList;
import java.util.List;

//Finish time:
//ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	//frames.add(Frame)
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		frames.add(frame);
		//to be implemented
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		
		//to be implemented
	}
	
	// Returns the game score
	public int score(){
		int score = 0;
		int counter = 0;
		for (int i=0; i < frames.size(); i++)
		{
			if (frames.get(i).isStrike()){
				for (int j = 0; j < counter; j++) {
					counter++;
					score += 10 + frames.get(i-j).score();
					
				}
			
			}
			else {
			counter = 0;
			score += frames.get(i).score();
			}
		}
		
		
		//to be implemented: should return game score 
		return score;
	}
}
