
public class King extends ChessPiece {
	
	public King(int row, int column) {
		this.row = row;
		this.column = column;
		this.name = "King";
	}
	
	@Override
	public void move(int row, int column) {
		if (Math.abs(this.row - row) > 1 || Math.abs(this.column - column) > 1) {
			System.out.println(this.name + " can not move there");
		} else {
			this.row = row;
			this.column = column;
		}
	}
}
