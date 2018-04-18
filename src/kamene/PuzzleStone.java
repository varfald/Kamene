package kamene;

import consoleui.ConsoleUI;
import consoleui.UserInterface;




public class PuzzleStone {

	private UserInterface userInterface;
	private static PuzzleStone instance;
	private static long startMillis;

	private PuzzleStone () {
		instance = this;
		userInterface = new ConsoleUI();
		setStartMillis(System.currentTimeMillis());
		Field field = new Field (4,4);
		startMillis = getStartMillis();
		userInterface.newGameStarted(field);
	}

	
	public static long getStartMillis() {
		return startMillis;
	}


	public static void setStartMillis(long startMillis) {
		PuzzleStone.startMillis = startMillis;
	}


	public static PuzzleStone getInstance() {
		if (instance == null) {
			new PuzzleStone ();
		}
		return instance;
	}		
		
	public static int getPlayingSeconds() {
		return (int) (System.currentTimeMillis() - startMillis) / 1000;

	}	
		
	public static void main(String[] args) {
		new PuzzleStone();

	}
}
