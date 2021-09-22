package mycoordinate;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class FigureTest {
    List<Point> list = new ArrayList<>();
    Point P;
    Figure F;

    @BeforeEach
    void init () {
         P = new Point();
    }

    @Test
    void inputDataCheck_success() {
        boolean checkVal = P.checkVal(1, 24);
        assertThat(checkVal).isTrue();
    }

    @Test
    void inputDataCheck_fail() {
        boolean checkVal = P.checkVal(0, 25);
        assertThat(checkVal).isFalse();
    }

    @Test
    void 포인트만들기_성공() throws Exception {
        Point x = new Point(10,10);
        Point y = new Point(14,15);
        list.add(x);
        list.add(y);
        assertThat(list.size()).isEqualTo(2);
    }

    @Test
    void 포인트만들기_실패() throws Exception {
        assertThatThrownBy(() -> {
            new Point(10, 25);
        }).isInstanceOf(IllegalArgumentException.class);
    }
    
    @Test
    void 라인_값_구하기() throws Exception {
        list.add(new Point(10,10));
        list.add(new Point(14,15));

        F = new Line();
        double result = F.calculate(list);
        assertThat(result).isEqualTo(6.403124);
        assertThat(F.getName(list)).isEqualTo("선");
    }
    
    @Test
    void 사각형_면적_구하기() throws Exception {
        list.add(new Point(10,10));
        list.add(new Point(22,10));
        list.add(new Point(22,18));
        list.add(new Point(10,18));

        F = new Rectangle();
        assertThat(F.getName(list)).isEqualTo("사각형");
        assertThat(F.calculate(list)).isEqualTo(96.0);
    }

    @Test
    void 삼각형_면적_구하기() throws Exception{
        list.add(new Point(10,10));
        list.add(new Point(14,15));
        list.add(new Point(20,8));
        F = new Triangle();
        assertThat(F.getName(list)).isEqualTo("삼각형");
        assertThat(F.calculate(list)).isEqualTo(29);
    }

}
