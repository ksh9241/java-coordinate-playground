package mycoordinate;

import java.util.List;

public class Line implements Figure {
    @Override
    public double calculate(List<Point> points) {
        double xd = pointValue(points.get(0).getX(), points.get(1).getX());
        double yd = pointValue(points.get(0).getY(), points.get(1).getY());

        return Double.parseDouble(String.format("%.6f", Math.sqrt(xd + yd)));
    }

    @Override
    public double pointValue (double num1, double num2) {
        return Math.pow(num1 - num2, 2);
    }
}
