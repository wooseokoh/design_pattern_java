package Prototype;

public class Point implements Prototype,Shape{
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public Object copy() {
        Point result = new Point();
        result.x = this.x;
        result.y = this.y;
        return result;
    }

    @Override
    public String draw() {
        return "(" + x + " " + y + ")";
    }

    @Override
    public void moveOffset(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
}
