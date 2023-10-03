
public class Board {
	
	public ChessPiece[][] chessBoard;
	
	public Board() {
		
		chessBoard = new ChessPiece[8][8];
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				chessBoard[i][j] = null;
			}
		}
	}
	
	public void setBoard() {
		chessBoard[Chess.whitePlayer.king.row][Chess.whitePlayer.king.column] = Chess.whitePlayer.king;

		chessBoard[Chess.blackPlayer.king.row][Chess.blackPlayer.king.column] = Chess.blackPlayer.king;
	}
	
	public void showBoard() {
		System.out.println();
		System.out.println("=======================================");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (chessBoard[i][j] == null) {
					System.out.print(chessBoard[i][j] + " ");
				} else {
					System.out.print(chessBoard[i][j].getName() + " ");
				}
			}
			System.out.println();
		}
		System.out.println("=======================================");
		System.out.println();
	}
}

// 00 01 02 03 04 05 06 07
// 10 11 12 13 14 15 16 17
// 20 21 22 23 24 25 26 27
// 30 31 32 33 34 35 36 36
// 40 41 42 43 44 45 46 47
// 50 51 52 53 54 55 56 57
// 60 61 62 63 64 65 66 67
// 70 71 72 73 74 75 76 77