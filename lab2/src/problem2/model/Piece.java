package problem2.model;

public abstract class Piece {
	protected Position a;

    public Piece(Position a) {
        this.a = a;
    }

    public abstract boolean isLegalMove(Position b, Piece[][] board);

    public void move(Position b, Piece[][] board) {
        if (isLegalMove(b, board)) {
            a = b;
            System.out.println("Move successful to (" + b.getRow() + "," + b.getCol() + ")");
        } else {
            System.out.println("Illegal move!");
        }
    }
}
