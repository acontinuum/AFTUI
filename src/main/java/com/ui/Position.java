package com.droneviewui;
public class Position {
    private int x;
    private int y;
    private int z;

    public Position() {
        x = y = z = 0;
    }

    public Position(int x, int y, int z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }
}