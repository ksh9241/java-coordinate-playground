package mycoordinate;

public class Point {

    private double x;
    private double y;

    public Point() { }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point(double x, double y) throws Exception{
        if (!checkVal(x, y)) {
            throw new IllegalArgumentException("범위는 1부터 24 이하의 숫자만 가능합니다.");
        }
        this.x = x;
        this.y = y;
    }

    public boolean checkVal(double x, double y) {
        return x <= 24 && x >= 1 && y <= 24 && y >= 1;
    }
}
