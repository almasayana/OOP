package problem2.model;

import problem2.model.pieces.*;

public class Board {

    private Piece[][] board = new Piece[8][8];

    public void placePiece(Piece p) {
        board[p.a.getRow()][p.a.getCol()] = p;
    }

    public void movePiece(Position from, Position to) {
        Piece p = board[from.getRow()][from.getCol()];
        if (p == null) {
            System.out.println("No piece at source!");
            return;
        }

        if (!p.isLegalMove(to, board)) {
            System.out.println("Illegal move!");
            return;
        }

        board[to.getRow()][to.getCol()] = p;
        board[from.getRow()][from.getCol()] = null;
        p.a = to;

        System.out.println("Moved piece from (" + from.getRow() + "," + from.getCol() + ") to (" + to.getRow() + "," + to.getCol() + ")");
    }

    public void printBoard() {
        for (int r = 7; r >= 0; r--) {
            System.out.print((r + 1) + " ");
            for (int c = 0; c < 8; c++) {
                Piece p = board[r][c];
                if (p == null) System.out.print(". ");
                else System.out.print(getSymbol(p) + " ");
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    private char getSymbol(Piece p) {
        if (p instanceof Rook) return 'R';
        if (p instanceof Bishop) return 'B';
        if (p instanceof Knight) return 'N';
        if (p instanceof Queen) return 'Q';  
        if (p instanceof Pawn) return 'P'; 
        if (p instanceof King) return 'K'; 
        return '?';
    }
}
