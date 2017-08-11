package sword.shield.model;

public class Piece {

	private char name;
	private char topSide;
	private char bottomSide;
	private char leftSide;
	private char rightSide;

	public Piece(char name, char top, char bottom, char left, char right) {
		this.name = name;
		this.topSide = top;
		this.bottomSide = bottom;
		this.leftSide = left;
		this.rightSide = right;
	}

	public char getName() {
		return name;
	}

	public char getTopSide() {
		return topSide;
	}

	public char getBottomSide() {
		return bottomSide;
	}

	public char getLeftSide() {
		return leftSide;
	}

	public char getRightSide() {
		return rightSide;
	}
}
