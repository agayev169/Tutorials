package OOP;

public class Segment {
    Point p1;
    Point p2;

    Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    Segment(float x1, float y1, float x2, float y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    @Override
    public String toString() {
        return p1.toString() + " --> " + p2.toString();
    }
}
