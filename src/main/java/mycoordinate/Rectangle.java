package mycoordinate;

import java.util.List;

public class Rectangle implements Figure{
    @Override
    public double calculate(List<Point> points) {
        double width = pointValue(points.get(0).getX(), points.get(1).getX());
        double height = pointValue(points.get(0).getY(), points.get(3).getY());

        return Double.parseDouble(String.format("%.1f", width * height));
    }

    @Override
    public double pointValue(double num1, double num2) {
        return (int) Math.abs(num1 - num2);
    }
}
