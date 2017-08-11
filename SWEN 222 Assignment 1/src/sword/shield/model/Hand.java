package sword.shield.model;

import java.util.HashSet;
import java.util.Set;

public class Hand {

	//Hand
	private Set<Piece> hand = new HashSet<Piece>();
	private String playerName;

	//Hand size
	public static final int HANDSIZE = 24;
	//All Permutations
	public static final String A = "a||-#";
	public static final String B = "b||- ";
	public static final String C = "c####";
	public static final String D = "d|#  ";
	public static final String E = "e    ";
	public static final String F = "f|#-#";
	public static final String G = "g||--";
	public static final String H = "h|## ";
	public static final String I = "i   #";
	public static final String J = "j||##";
	public static final String K = "k| -#";
	public static final String L = "l|   ";
	public static final String M = "m|# #";
	public static final String N = "n # #";
	public static final String O = "o||# ";
	public static final String P = "p|#- ";
	public static final String Q = "q| # ";
	public static final String R = "r| ##";
	public static final String S = "s  ##";
	public static final String T = "t||  ";
	public static final String U = "u| - ";
	public static final String V = "v|  #";
	public static final String W = "w|###";
	public static final String X = "x ###";



	public Hand(String name) {
		// TODO Auto-generated constructor stub
		this.setPieces();
		this.playerName = name;
	}

	public void setPieces() {
		Piece piece;
		char[] value;
		value = A.toCharArray();
		piece = new Piece(value[0], value[1], value[2], value[3], value[4]);
		hand.add(piece);
		value = B.toCharArray();
		piece = new Piece(value[0], value[1], value[2], value[3], value[4]);
		hand.add(piece);
		value = C.toCharArray();
		piece = new Piece(value[0], value[1], value[2], value[3], value[4]);
		hand.add(piece);
		value = D.toCharArray();
		piece = new Piece(value[0], value[1], value[2], value[3], value[4]);
		hand.add(piece);
		value = E.toCharArray();
		piece = new Piece(value[0], value[1], value[2], value[3], value[4]);
		hand.add(piece);
		value = F.toCharArray();
		piece = new Piece(value[0], value[1], value[2], value[3], value[4]);
		hand.add(piece);
		value = G.toCharArray();
		piece = new Piece(value[0], value[1], value[2], value[3], value[4]);
		hand.add(piece);
		value = H.toCharArray();
		piece = new Piece(value[0], value[1], value[2], value[3], value[4]);
		hand.add(piece);
		value = I.toCharArray();
		piece = new Piece(value[0], value[1], value[2], value[3], value[4]);
		hand.add(piece);
		value = J.toCharArray();
		piece = new Piece(value[0], value[1], value[2], value[3], value[4]);
		hand.add(piece);
		value = K.toCharArray();
		piece = new Piece(value[0], value[1], value[2], value[3], value[4]);
		hand.add(piece);
		value = L.toCharArray();
		piece = new Piece(value[0], value[1], value[2], value[3], value[4]);
		hand.add(piece);
		value = M.toCharArray();
		piece = new Piece(value[0], value[1], value[2], value[3], value[4]);
		hand.add(piece);
		value = N.toCharArray();
		piece = new Piece(value[0], value[1], value[2], value[3], value[4]);
		hand.add(piece);
		value = O.toCharArray();
		piece = new Piece(value[0], value[1], value[2], value[3], value[4]);
		hand.add(piece);
		value = P.toCharArray();
		piece = new Piece(value[0], value[1], value[2], value[3], value[4]);
		hand.add(piece);
		value = Q.toCharArray();
		piece = new Piece(value[0], value[1], value[2], value[3], value[4]);
		hand.add(piece);
		value = R.toCharArray();
		piece = new Piece(value[0], value[1], value[2], value[3], value[4]);
		hand.add(piece);
		value = S.toCharArray();
		piece = new Piece(value[0], value[1], value[2], value[3], value[4]);
		hand.add(piece);
		value = T.toCharArray();
		piece = new Piece(value[0], value[1], value[2], value[3], value[4]);
		hand.add(piece);
		value = U.toCharArray();
		piece = new Piece(value[0], value[1], value[2], value[3], value[4]);
		hand.add(piece);
		value = V.toCharArray();
		piece = new Piece(value[0], value[1], value[2], value[3], value[4]);
		hand.add(piece);
		value = W.toCharArray();
		piece = new Piece(value[0], value[1], value[2], value[3], value[4]);
		hand.add(piece);
		value = X.toCharArray();
		piece = new Piece(value[0], value[1], value[2], value[3], value[4]);
		hand.add(piece);
	}

	public void printHand() {
		StringBuilder handPrint = new StringBuilder();
		int count = 0;
		for(Piece piece : hand) {
			handPrint.append("\n");
			handPrint.append("Piece # " + count);
			handPrint.append("\n");
			handPrint.append(" ");
			handPrint.append(piece.getTopSide());
			handPrint.append(" ");
			handPrint.append("\n");
			handPrint.append(piece.getLeftSide());
			handPrint.append(" ");
			handPrint.append(piece.getRightSide());
			handPrint.append("\n");
			handPrint.append(" ");
			handPrint.append(piece.getBottomSide());
			handPrint.append(" ");
			handPrint.append("\n");
			count ++;
		}
		System.out.println(handPrint);
	}
}
