
public abstract class Player {
	King king;
	
	public ChessPiece selectChessPiece(int row, int column) {
		return Chess.board.chessBoard[row][column];
	}
}
