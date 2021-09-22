package mycoordinate;

import java.util.List;

public class Triangle implements Figure {
    @Override
    public double calculate(List<Point> points) {
        double line1_x = Math.pow(points.get(0).getX() - points.get(1).getX(), 2);
        double line1_y = Math.pow(points.get(0).getY() - points.get(1).getY(), 2);

        double line2_x = Math.pow(points.get(1).getX() - points.get(2).getX(), 2);
        double line2_y = Math.pow(points.get(1).getY() - points.get(2).getY(), 2);

        double line3_x = Math.pow(points.get(2).getX() - points.get(0).getX(), 2);
        double line3_y = Math.pow(points.get(2).getY() - points.get(0).getY(), 2);

        double line1 = Math.sqrt(line1_x + line1_y);
        double line2 = Math.sqrt(line2_x + line2_y);
        double line3 = Math.sqrt(line3_x + line3_y);

        double s = (line1 + line2 + line3) / 2.0;

        System.out.println();
        return Math.round(Math.sqrt(s * (s - line1) * (s - line2) * (s- line3)));
    }
}
