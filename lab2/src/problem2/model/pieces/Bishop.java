package problem2.model.pieces;

import problem2.model.Piece;
import problem2.model.Position;

public class Bishop extends Piece {

    public Bishop(Position a) {
    	super(a); 
    }

    @Override
    public boolean isLegalMove(Position b, Piece[][] board) {
        int r1 = a.getRow(), c1 = a.getCol();
        int r2 = b.getRow(), c2 = b.getCol();

        return Math.abs(r2 - r1) == Math.abs(c2 - c1);
    }
}