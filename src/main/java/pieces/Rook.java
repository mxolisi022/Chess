package pieces;

import org.example.ChessBoard;
import org.example.ChessPiece;

import java.awt.*;

public class Rook extends ChessPiece {

    public Rook(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
    }

    @Override
    public void draw(Graphics g) {
        if (isWhite) {
            g.setColor(Color.WHITE);
        } else {
            g.setColor(Color.BLACK);
        }
        int startX = x * ChessBoard.TILE_SIZE + ChessBoard.TILE_SIZE / 4;
        int startY = y * ChessBoard.TILE_SIZE + ChessBoard.TILE_SIZE / 4;
        int size = ChessBoard.TILE_SIZE / 2;
        g.fillRect(startX, startY, size, size);
    }
}
