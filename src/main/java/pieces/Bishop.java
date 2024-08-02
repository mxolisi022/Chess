package pieces;

import org.example.ChessBoard;
import org.example.ChessPiece;

import java.awt.*;

public class Bishop extends ChessPiece {

    public Bishop(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
    }

    @Override
    public void draw(Graphics g) {
        if (isWhite) {
            g.setColor(Color.WHITE);
        } else {
            g.setColor(Color.BLACK);
        }
        int centerX = x * ChessBoard.TILE_SIZE + ChessBoard.TILE_SIZE / 2;
        int centerY = y * ChessBoard.TILE_SIZE + ChessBoard.TILE_SIZE / 2;
        int radius = ChessBoard.TILE_SIZE / 3;
        g.fillOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);
    }
}
