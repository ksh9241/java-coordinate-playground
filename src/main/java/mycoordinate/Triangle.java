package mycoordinate;

import java.util.List;

public class Triangle implements Figure {
    @Override
    public double calculate(List<Point> points) {
        double line1_x = pointValue(points.get(0).getX(), points.get(1).getX());
        double line1_y = pointValue(points.get(0).getY(), points.get(1).getY());

        double line2_x = pointValue(points.get(1).getX(), points.get(2).getX());
        double line2_y = pointValue(points.get(1).getY(), points.get(2).getY());

        double line3_x = pointValue(points.get(2).getX(), points.get(0).getX());
        double line3_y = pointValue(points.get(2).getY(), points.get(0).getY());

        double line1 = lineValue(line1_x, line1_y);
        double line2 = lineValue(line2_x, line2_y);
        double line3 = lineValue(line3_x, line3_y);

        double s = (line1 + line2 + line3) / 2.0;

        return Math.round(Math.sqrt(s * (s - line1) * (s - line2) * (s- line3)));
    }

    @Override
    public double pointValue(double num1, double num2) {
        return Math.pow(num1 - num2, 2);
    }

    public double lineValue (double pointX, double pointY) {
        return Math.sqrt(pointX + pointY);
    }
}
