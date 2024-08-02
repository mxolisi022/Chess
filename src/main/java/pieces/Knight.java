package pieces;

import org.example.ChessBoard;
import org.example.ChessPiece;

import java.awt.*;

public class Knight extends ChessPiece {

    public Knight(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
    }

    @Override
    public void draw(Graphics g) {
        if (isWhite) {
            g.setColor(Color.WHITE);
        } else {
            g.setColor(Color.BLACK);
        }
        int[] xPoints = { x * ChessBoard.TILE_SIZE + ChessBoard.TILE_SIZE / 2, x * ChessBoard.TILE_SIZE + ChessBoard.TILE_SIZE / 4, x * ChessBoard.TILE_SIZE + 3 * ChessBoard.TILE_SIZE / 4 };
        int[] yPoints = { y * ChessBoard.TILE_SIZE + ChessBoard.TILE_SIZE / 4, y * ChessBoard.TILE_SIZE + 3 * ChessBoard.TILE_SIZE / 4, y * ChessBoard.TILE_SIZE + 3 * ChessBoard.TILE_SIZE / 4 };
        g.fillPolygon(xPoints, yPoints, 3);
    }
}
