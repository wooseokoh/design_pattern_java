package Prototype;

public class MainEntry {
    public static void main(String[] args) {
        Point pt1 = new Point();
        pt1.setX(0);
        pt1.setY(0);
        System.out.println(pt1.draw());

        Point pt2 = new Point();
        pt2.setX(100);
        pt2.setY(100);
        System.out.println(pt2.draw());

        Line line1 = new Line();
        line1.setStartPt(pt1);
        line1.setEndPt(pt2);
        System.out.println(line1.draw());
    }
}
