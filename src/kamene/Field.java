package kamene;

import java.util.Arrays;
import java.util.Collections;

public class Field {

	private final Stone[][] stones;
	private int rowCount;
	private int columnCount;
	private int eRow;
	private int eColumn;
	private int nRow;
	private int nColumn;

	public int getRowCount() {
		return rowCount;
	}

	public int getColumnCount() {
		return columnCount;
	}

	public Stone getStone(int row, int column) {
		return stones[row][column];
	}

	public Field(int rowCount, int columnCount) {

		this.rowCount = rowCount;
		this.columnCount = columnCount;
		stones = new Stone[rowCount][columnCount];
		generate();
		shuffle();
	}

	private void shuffle() {
		Collections.shuffle(Arrays.asList(stones));

	}

	private void generate() {
		int value = 1;
		for (int row = 0; row < rowCount; row++) {
			for (int column = 0; column < columnCount; column++) {
				stones[row][column] = new Stone(value++);

			}
		}
		stones[rowCount - 1][columnCount - 1] = null;
	}

	private void emptyStone() {
		for (int row = 0; row < rowCount; row++) {
			for (int column = 0; column < columnCount; column++) {
				if (stones[row][column] == null) {
					eRow = row;
					eColumn = column;
					return;

				}

			}
		}

	}

	private void numeredStone() {
		for (int row = 0; row < rowCount; row++) {
			for (int column = 0; column < columnCount; column++) {
				if (stones[row][column] != null) {
					nRow = row;
					nColumn = column;
					return;

				}
			}
		}

	}
	
	private void command (String input) {
		for (int row = 0; row < rowCount; row++) {
			for (int column = 0; column < columnCount; column++) {
				switch (input) {
				case "up":
				if (eRow - 1 < rowCount) {
					stones[eRow][eColumn] = stones[eRow - 1][eColumn];
					stones[eRow - 1][eColumn] = null;
					eRow--;
				}
				break;
				case "down":
					if (eRow + 1 < rowCount) {
					stones[eRow][eColumn] = stones[eRow + 1][eColumn];
					stones[eRow + 1][eColumn] = null;
					eRow++;
					}
					break;
				case "left":
					if (eColumn + 1 < columnCount) {
						stones[eRow][eColumn] = stones[eRow][eColumn+1];
						stones[eRow][eColumn+1] = null;
						eColumn++;
						}
					break;
				case "right":
					if (eColumn - 1 < columnCount) {
						stones[eRow][eColumn] = stones[eRow][eColumn-1];
						stones[eRow][eColumn-1] = null;
						eColumn--;
					}
					break;
							
							
							
				}
				
					
				
				}
			}
	}
	
}