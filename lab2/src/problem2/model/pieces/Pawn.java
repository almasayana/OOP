package problem2.model.pieces;

import problem2.model.Piece;
import problem2.model.Position;

public class Pawn extends Piece {

    public Pawn(Position a) { super(a); }

    @Override
    public boolean isLegalMove(Position b, Piece[][] board) {
        int r1 = a.getRow(), c1 = a.getCol();
        int r2 = b.getRow(), c2 = b.getCol();

        if (c1 == c2 && r2 == r1 + 1 && board[r2][c2] == null) return true;

        if (Math.abs(c2 - c1) == 1 && r2 == r1 + 1 && board[r2][c2] != null) return true;

        return false;
    }
}