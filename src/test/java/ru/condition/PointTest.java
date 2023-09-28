package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when55to1010then7Dot0710678118654755() {
        double expected = 7.0710678118654755;
        int x1 = 5;
        int y1 = 5;
        int x2 = 10;
        int y2 = 10;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }


    @Test
    void when1525to203then22Dot561028345356956() {
        double expected =22.561028345356956 ;
        int x1 = 15;
        int y1 = 25;
        int x2 = 20;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
    @Test
    void when333to9867then100Dot90094152187085() {
        double expected =100.90094152187085;
        int x1 = 3;
        int y1 = 33;
        int x2 = 98;
        int y2 = 67;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }


}