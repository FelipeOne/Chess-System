package boardgame;

public class Piece {
	
	Position position;
	Board board;
	
	public Piece(Board board) {
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}

	
	
	
}
