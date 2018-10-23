package OOP;

public class Point {
    private float x;
    private float y;

    Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    Point() {
        this.x = 0;
        this.y = 0;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float distance(Point p) {
        return (p.x - this.x) * (p.x - this.x) +
                (p.y - this.y) * (p.y - this.y);
    }

    public static float distance(Point p1, Point p2) {
        return (p1.x - p2.x) * (p1.x - p2.x) +
                (p1.y - p2.y) * (p1.y - p2.y);
    }

    public float distance() {
        return (this.x - 0) * (this.x - 0) +
                (this.y - 0) * (this.y - 0);
    }

    public void translate(float dx, float dy) {
        x = x + dx;
        y = y + dy;
    }

    @Override
    public String toString() {
        return "x: " + x + ", y: " + y;
    }

    public static Point barycenter(Point[] points) {
        Point result = new Point();
        for (Point p : points) {
            result.x += p.x;
            result.y += p.y;
        }
        result.x /= points.length;
        result.y /= points.length;
        return result;
    }
}
