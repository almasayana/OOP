package problem2.app;

import problem2.model.Board;
import problem2.model.Position;
import problem2.model.pieces.Rook;
import problem2.model.pieces.Bishop;
import problem2.model.pieces.Knight;
import problem2.model.pieces.Queen;
import problem2.model.pieces.Pawn;
import problem2.model.pieces.King;
	

public class TestBoard {
    public static void main(String[] args) {

        Board board = new Board();

        Rook rook = new Rook(new Position(0,0));
        Bishop bishop = new Bishop(new Position(0,2));
        Knight knight = new Knight(new Position(0,1));
        Queen queen = new Queen(new Position(0,3));
        King king = new King(new Position(0,4));
        Pawn pawn = new Pawn(new Position(1,0));

        board.placePiece(rook);
        board.placePiece(bishop);
        board.placePiece(knight);
        board.placePiece(queen);
        board.placePiece(pawn);
        board.placePiece(king);
        
        board.printBoard();

        System.out.println("\nUser tries to move rook to (0,5)");
        board.movePiece(new Position(0,0), new Position(0,5));
        board.printBoard();

        System.out.println("\nUser tries to move bishop to (3,5)");
        board.movePiece(new Position(0,2), new Position(3,5));
        board.printBoard();

        System.out.println("\nUser tries to move knight to (2,2)");
        board.movePiece(new Position(0,1), new Position(2,2));
        board.printBoard();

        System.out.println("\nUser tries illegal move rook to (1,6)");
        board.movePiece(new Position(0,5), new Position(1,6));
        board.printBoard();
        
        board.movePiece(new Position(0,3), new Position(3,6));
        board.movePiece(new Position(1,0), new Position(2,0));
    }
}