package point;

public class Point  implements Movable{
    private double x;
    private double y;

    public Point(){
        this.x = 1;
        this.y = 1;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "point.Point[" +
                "x=" + x +
                ", y=" + y +
                ']';
    }

    @Override
    public void moveUp() {
        y += 1;
    }

    @Override
    public void moveDown() {
        y -= 1;
    }

    @Override
    public void moveLeft() {
        x -= 1;
    }

    @Override
    public void moveRight() {
        x += 1;
    }


}
