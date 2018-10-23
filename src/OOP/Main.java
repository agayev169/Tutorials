package OOP;

public class Main {
    public static void main(String[] args) {
//        Point p1 = new Point(10, 5);
//        Point p2 = new Point(5, 10);
//        System.out.println("Distance between p1 and p2: " +
//                Point.distance(p1, p2));
//
//
//        System.out.println("Distance between p1 and origin: " +
//                p1.distance());
//
//        System.out.println(p1.toString());
//        p1.translate(5, 10);
//        System.out.println(p1.toString());


//        Point[] points = new Point[5];
//        for (int i = 0; i < points.length; i++) {
//            points[i] = new Point();
//        }
//        System.out.println(Point.barycenter(points));

        Point p1 = new Point();
        Point p2 = new Point();
        Segment seg1 = new Segment(p1, p2);
        Segment seg2 = new Segment(1, 2, 3, 4);
        System.out.println(seg1.p1 + " " + seg1.p2);
        System.out.println(seg1.p1 + " " + seg1.p2);
        seg1 = null;
        seg2 = null;
        System.out.println(p1 + " " + p2);
    }
}
