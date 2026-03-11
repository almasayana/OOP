package problem2.model.pieces;

import problem2.model.Piece;
import problem2.model.Position;

public class Knight extends Piece {

    public Knight(Position a) { super(a); }

    @Override
    public boolean isLegalMove(Position b, Piece[][] board) {
        int dx = Math.abs(a.getRow() - b.getRow());
        int dy = Math.abs(a.getCol() - b.getCol());
        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }
}