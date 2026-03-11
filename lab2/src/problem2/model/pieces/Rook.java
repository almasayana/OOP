package problem2.model.pieces;

import problem2.model.Piece;
import problem2.model.Position;

public class Rook extends Piece {

    public Rook(Position a) { super(a); }

    @Override
    public boolean isLegalMove(Position b, Piece[][] board) {
        int r1 = a.getRow(), c1 = a.getCol();
        int r2 = b.getRow(), c2 = b.getCol();

        if (r1 != r2 && c1 != c2) return false;

        return true;
    }
}