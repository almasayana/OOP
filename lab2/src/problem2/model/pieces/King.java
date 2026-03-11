package problem2.model.pieces;

import problem2.model.Piece;
import problem2.model.Position;

public class King extends Piece {

    public King(Position a) { super(a); }

    @Override
    public boolean isLegalMove(Position b, Piece[][] board) {
        int r1 = a.getRow(), c1 = a.getCol();
        int r2 = b.getRow(), c2 = b.getCol();

        int dr = Math.abs(r2 - r1);
        int dc = Math.abs(c2 - c1);
        return dr <= 1 && dc <= 1;
    }
}