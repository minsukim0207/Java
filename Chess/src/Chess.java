
public class Chess {

	public static Chess chess;
	public static Board board;
	public static WhitePlayer whitePlayer;
	public static BlackPlayer blackPlayer;
	

	public static void main(String[] args) {
		
		chess = new Chess();
		
		chess.board.setBoard();
		chess.board.showBoard();
		
		chess.gameStart();
	}
	
	public Chess() {
		board = new Board();
		whitePlayer = new WhitePlayer();
		blackPlayer = new BlackPlayer();
	}
	
	public void gameStart() {
		System.out.println("Game Start!!");
		int turn = 1;
		
		while (true) {
			if (turn == 1) {
				System.out.println("White Player Turn");
				chess.whitePlayer.moveChessPiece();
				chess.board.showBoard();
				turn = 2;
			}
			else {
				System.out.println("Black Player Turn");
				chess.blackPlayer.moveChessPiece();
				chess.board.showBoard();
				turn = 1;
			}
		}
	}
	
	static void gameOver() {
		System.out.println("You Win!!");
		System.out.println("Game Over");
		System.exit(0);
	}
}
