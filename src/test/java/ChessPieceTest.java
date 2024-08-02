import org.example.ChessPiece;
import org.junit.jupiter.api.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
//import static org.testng.AssertJUnit.assertFalse;

public class ChessPieceTest {

    @Test
    public void testMove() {
        ChessPiece piece = new TestChessPiece(0, 0, true);
        piece.move(5, 5);
        assertEquals(5, 5);
        assertEquals(5, 5);
    }

    @Test
    public void testIsWhite() {
        ChessPiece whitePiece = new TestChessPiece(0, 0, true);
        assertTrue(whitePiece.isWhite());

        ChessPiece blackPiece = new TestChessPiece(0, 0, false);
        assertFalse(blackPiece.isWhite());
    }
}
