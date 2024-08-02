package org.example;

import pieces.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChessBoard extends JPanel {
    public static final int TILE_SIZE = 80;
    private ChessPiece[][] board;
    private ChessPiece selectedPiece;

    public ChessBoard() {
        this.board = new ChessPiece[8][8];
        initializeBoard();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX() / TILE_SIZE;
                int y = e.getY() / TILE_SIZE;

                if (selectedPiece != null) {
                    selectedPiece.move(x, y);
                    selectedPiece = null;
                } else {
                    selectedPiece = board[x][y];
                }
                repaint();
            }
        });
    }

    private void initializeBoard() {
        for (int i = 0; i < 8; i++) {
            board[i][1] = new Pawn(i, 1, false);
            board[i][6] = new Pawn(i, 6, true);
        }
        // Initialize bishops
        board[2][0] = new Bishop(2, 0, false);
        board[5][0] = new Bishop(5, 0, false);
        board[2][7] = new Bishop(2, 7, true);
        board[5][7] = new Bishop(5, 7, true);

        // Initialize rooks
        board[0][0] = new Rook(0, 0, false);
        board[7][0] = new Rook(7, 0, false);
        board[0][7] = new Rook(0, 7, true);
        board[7][7] = new Rook(7, 7, true);

        // Initialize knights
        board[1][0] = new Knight(1, 0, false);
        board[6][0] = new Knight(6, 0, false);
        board[1][7] = new Knight(1, 7, true);
        board[6][7] = new Knight(6, 7, true);

        // Initialize queens
        board[3][0] = new Queen(3, 0, false);
        board[3][7] = new Queen(3, 7, true);

        // Initialize kings
        board[4][0] = new King(4, 0, false);
        board[4][7] = new King(4, 7, true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    g.setColor(Color.LIGHT_GRAY);
                } else {
                    g.setColor(Color.DARK_GRAY);
                }
                g.fillRect(i * TILE_SIZE, j * TILE_SIZE, TILE_SIZE, TILE_SIZE);

                if (board[i][j] != null) {
                    board[i][j].draw(g);
                }
            }
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(8 * TILE_SIZE, 8 * TILE_SIZE);
    }

    public ChessPiece[][] getBoard() {
        return board;
    }

    public void setBoard(ChessPiece[][] board) {
        this.board = board;
    }
}
