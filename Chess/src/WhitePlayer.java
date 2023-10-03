import java.util.Scanner;

public class WhitePlayer extends Player {
	Scanner sc = new Scanner(System.in);
	
	public WhitePlayer() {
		this.king = new King(7, 3);
	}
	
	public void moveChessPiece() {
		System.out.println("Choose ChessPiece");
		System.out.print("Row: ");
		int row = sc.nextInt();
		sc.nextLine();
		System.out.print("Column: ");
		int column = sc.nextInt();
		sc.nextLine();
		System.out.println("You choose " + Chess.whitePlayer.selectChessPiece(row, column).getName());
		System.out.println();
		
		System.out.println("Input Destination");
		System.out.print("Row: ");
		int desRow = sc.nextInt();
		sc.nextLine();
		System.out.println("Column: ");
		int desColumn = sc.nextInt();
		sc.nextLine();

		Chess.whitePlayer.selectChessPiece(row, column).move(desRow, desColumn);
		Chess.board.chessBoard[row][column] = null;
		Chess.board.setBoard();
		
		if (desRow == Chess.blackPlayer.king.row && desColumn == Chess.blackPlayer.king.column) {
			Chess.board.showBoard();
			Chess.gameOver();
		}
	}
}
