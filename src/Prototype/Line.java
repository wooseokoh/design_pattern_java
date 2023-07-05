package Prototype;

public class Line implements Prototype,Shape{
    private Point startPt;
    private Point endPt;

    public Point getStartPt() {
        return startPt;
    }

    public void setStartPt(Point startPt) {
        this.startPt = startPt;
    }

    public Point getEndPt() {
        return endPt;
    }

    public void setEndPt(Point endPt) {
        this.endPt = endPt;
    }

    @Override
    public Object copy() {
        Line result = new Line();

        result.startPt = (Point)startPt.copy();
        result.endPt = (Point)endPt.copy();
        return result;
    }

    @Override
    public String draw() {
        return "LINE(" + startPt.draw() + " " + endPt.draw() + ")";
    }

    @Override
    public void moveOffset(int dx, int dy) {
        startPt.moveOffset(dx, dy);
        endPt.moveOffset(dx, dy);
    }
}
