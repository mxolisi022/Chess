package org.example;

import java.awt.*;

public abstract class ChessPiece {
    protected int x, y;
    protected boolean isWhite;

    public ChessPiece(int x, int y, boolean isWhite) {
        this.x = x;
        this.y = y;
        this.isWhite = isWhite;
    }

    public abstract void draw(Graphics g);

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isWhite() {
        return isWhite;
    }
}
