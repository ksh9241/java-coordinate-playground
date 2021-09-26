package mycoordinate;

import java.util.List;

public interface Figure {
    public double calculate (List<Point> points);

    public double pointValue(double num1, double num2);

    default String getName (List<Point> points) {
        if (points.size() == 2) {
            return "선";
        }
        if (points.size() == 3) {
            return "삼각형";
        }
        if (points.size() == 4) {
            return "사각형";
        }
        return null;
    };
}
