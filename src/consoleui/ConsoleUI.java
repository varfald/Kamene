package consoleui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

import kamene.Field;
import kamene.PuzzleStone;
import kamene.Stone;


public class ConsoleUI implements UserInterface {

	private Field field;
	// private BufferedReader input = new BufferedReader(new
	// InputStreamReader(System.in));

	// private String readLine() {
	// try {
	// return input.readLine();
	// } catch (IOException e) {
	// return null;
	// }
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see consoleui.UserInterface#newGameStarted(kamene.Field)
	 */
	@Override
	public void newGameStarted(Field field) {
		this.field = field;
		print();
		processInput();
		
		
		// processInput();
	}

	 private void processInput() {
		 System.out.println("-----------------------------------------");
	 System.out.println("Vzor zadania:  new/new game; exit/exit game; w/up; s/down; a/left; d/right");
	 System.out.println("Zadaj vstup: ");
	 		
	 }
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see consoleui.UserInterface#print()
	 */

	@Override
	public void print() {
		System.out.println("Welcome " + System.getProperty("user.name") + "!");
		Date datum = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Dnesny datum: " + format.format(datum));
		System.out.println("Cas trvania hry: " + PuzzleStone.getPlayingSeconds());
		System.out.print("-----------------------------------------");
		System.out.println();
		
		Stone stone;
		for (int row = 0; row < field.getRowCount(); row++) {
			for (int column = 0; column < field.getColumnCount(); column++) {
				
				stone = field.getStone(row, column);
				if (stone != null)
					System.out.print(stone.getValue() + "\t");

			}
			System.out.println();
		}
	}
		

	private void move () {
		
		}
		
		
	}
	
	

