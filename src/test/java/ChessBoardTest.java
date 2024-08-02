

//import org.junit.jupiter.api.Test;
import org.example.ChessBoard;
import pieces.*;

//import static org.junit.jupiter.api.Assertions.*;

import org.example.ChessPiece;
import org.junit.jupiter.api.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ChessBoardTest {

    @Test
    public void testInitializeBoard() {
        ChessBoard chessBoard;
        chessBoard = new ChessBoard();
        ChessPiece[][] board = chessBoard.getBoard();

        // Check pawns
        for (int i = 0; i < 8; i++) {
            assertTrue(board[i][1] instanceof Pawn);
            assertFalse(board[i][1].isWhite());
            assertTrue(board[i][6] instanceof Pawn);
            assertTrue(board[i][6].isWhite());
        }

        // Check bishops
        assertTrue(board[2][0] instanceof Bishop);
        assertFalse(board[2][0].isWhite());
        assertTrue(board[5][0] instanceof Bishop);
        assertFalse(board[5][0].isWhite());
        assertTrue(board[2][7] instanceof Bishop);
        assertTrue(board[2][7].isWhite());
        assertTrue(board[5][7] instanceof Bishop);
        assertTrue(board[5][7].isWhite());

        // Check rooks
        assertTrue(board[0][0] instanceof Rook);
        assertFalse(board[0][0].isWhite());
        assertTrue(board[7][0] instanceof Rook);
        assertFalse(board[7][0].isWhite());
        assertTrue(board[0][7] instanceof Rook);
        assertTrue(board[0][7].isWhite());
        assertTrue(board[7][7] instanceof Rook);
        assertTrue(board[7][7].isWhite());

        // Check knights
        assertTrue(board[1][0] instanceof Knight);
        assertFalse(board[1][0].isWhite());
        assertTrue(board[6][0] instanceof Knight);
        assertFalse(board[6][0].isWhite());
        assertTrue(board[1][7] instanceof Knight);
        assertTrue(board[1][7].isWhite());
        assertTrue(board[6][7] instanceof Knight);
        assertTrue(board[6][7].isWhite());

        // Check queens
        assertTrue(board[3][0] instanceof Queen);
        assertFalse(board[3][0].isWhite());
        assertTrue(board[3][7] instanceof Queen);
        assertTrue(board[3][7].isWhite());

        // Check kings
        assertTrue(board[4][0] instanceof King);
        assertFalse(board[4][0].isWhite());
        assertTrue(board[4][7] instanceof King);
        assertTrue(board[4][7].isWhite());
    }
}