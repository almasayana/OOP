package problem2.model.pieces;

import problem2.model.Piece;
import problem2.model.Position;

public class Queen extends Piece {

    public Queen(Position a) { super(a); }

    @Override
    public boolean isLegalMove(Position b, Piece[][] board) {
        Bishop p = new Bishop(b);
        Rook r = new Rook(b);
        

        return p.isLegalMove(b , board) || r.isLegalMove(b, board);
    }
}