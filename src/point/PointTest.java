package point;

public class PointTest {
    public static void main(String[] args) {
        Point p = new Point(2.5, 2.5);
        System.out.println(p);

        Point3D p2 = new Point3D(1.5, 1.5, 1.8);
        System.out.println(p2);

        Movable c = new Circle(p, 5);
        System.out.println(c);
        c.moveDown();
        System.out.println(c);
    }
}
