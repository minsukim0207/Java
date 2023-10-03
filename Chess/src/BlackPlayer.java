import java.util.Scanner;

public class BlackPlayer extends Player {
	Scanner sc = new Scanner(System.in);
	
	public BlackPlayer() {
		this.king = new King(0, 3);
	}

	public void moveChessPiece() {
		System.out.println("Choose ChessPiece");
		System.out.print("Row: ");
		int row = sc.nextInt();
		sc.nextLine();
		System.out.print("Column: ");
		int column = sc.nextInt();
		sc.nextLine();
		System.out.println("You choose " + Chess.blackPlayer.selectChessPiece(row, column).getName());
		System.out.println();
		
		System.out.println("Input Destination");
		System.out.print("Row: ");
		int desRow = sc.nextInt();
		sc.nextLine();
		System.out.println("Column: ");
		int desColumn = sc.nextInt();
		sc.nextLine();

		Chess.blackPlayer.selectChessPiece(row, column).move(desRow, desColumn);
		Chess.board.chessBoard[row][column] = null;
		Chess.board.setBoard();
		
		if (desRow == Chess.whitePlayer.king.row && desColumn == Chess.whitePlayer.king.column) {
			Chess.board.showBoard();
			Chess.gameOver();
		}
	}
}
