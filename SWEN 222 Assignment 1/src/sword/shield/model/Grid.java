package sword.shield.model;

import sword.shield.impl.Player;

public class Grid {

	public static final int GRID_SIZE = 30;

	private Piece[][] grid = new Piece[GRID_SIZE][GRID_SIZE];

	//intial pieces
	//private Piece player1 = new Player("Player1");
	//private Piece player2 = new Player("Player2");
	//private Piece nothing = new Nothing();
	private Piece player1 = new Piece('P', 'L', 'A', 'Y', '1');
	private Piece player2 = new Piece('P', 'L', 'A', 'Y', '2');
	private Piece nothing = new Piece('-', '-', '-', '-', '-');

	public void print() {
		StringBuilder board = new StringBuilder();
		for(int rows = 0; rows < GRID_SIZE; rows++){
			for (int cols = 0; cols < GRID_SIZE; cols++) {
				if(grid[rows][cols].equals(player1)) board.append("P1");
				if(grid[rows][cols].equals(player2)) board.append("P2");
				if(grid[rows][cols].equals(nothing)) board.append(" ");
			}
			board.append("\n");
		}
		System.out.println(board);
	}

	public void intialise() {
		//intializing the whole board with nothing
		for(int i = 0; i < GRID_SIZE; i++){
			for (int x = 0; x < GRID_SIZE; x++) {
				grid[i][x] = this.nothing;
			}
		}

		for(int i = 3; i < 6; i++) {
			for(int x = 3; x < 6; x++) {
				this.grid[i][x] = this.player1;
			}
		}
		for(int i = 23; i < 26; i++) {
			for(int x = 23; x < 26; x++) {
				this.grid[i][x] = this.player2;
			}
		}
	}
}