package sword.shield.main;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

import sword.shield.model.Grid;
import sword.shield.model.Hand;

public class Game implements Cloneable{
	private Grid grid;
	private Hand player1;
	private Hand Player2;
	private Scanner scan;
	private Boolean playing = true;
	private playersTurn turn;

	public Game() {
		this.grid = new Grid();
		turn = playersTurn.ONE;

		this.player1 = new Hand("Player1");
		this.Player2 = new Hand("Player1");
		this.grid.intialise();
		this.grid.print();
		this.player1.printHand();
	}

	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Player 1 starts:");
		do {
			scan = new Scanner(System.in);
			parser(scan);
		} while (playing);
		scan.close();
	}

	public void parser(Scanner scan) {
		if(turn == playersTurn.ONE) {
			if(scan.next().equals("place")) {
				scan.next();
				if(scan.hasNextInt()) {

				}
			}
		}
		//if(turn == playersTurn.TWO)
	}

	private enum playersTurn{
		ONE, TWO;
	}

}
