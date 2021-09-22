package mycoordinate;

import java.util.List;

public class Line implements Figure {
    @Override
    public double calculate(List<Point> points) {
        int xd = (int) Math.pow(points.get(0).getX() - points.get(1).getX(), 2);
        int yd = (int) Math.pow(points.get(0).getY() - points.get(1).getY(), 2);
        return Double.parseDouble(String.format("%.6f", Math.sqrt(xd + yd)));
    }
}
