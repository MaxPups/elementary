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
    void when55to1010then7Dot07() {
        double expected = 7.07;
        int x1 = 5;
        int y1 = 5;
        int x2 = 10;
        int y2 = 10;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }


    @Test
    void when1525to203then22Dot56() {
        double expected =22.56 ;
        int x1 = 15;
        int y1 = 25;
        int x2 = 20;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when333to9867then100Dot90() {
        double expected =100.90;
        int x1 = 3;
        int y1 = 33;
        int x2 = 98;
        int y2 = 67;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }


    @Test
    void when5466to2267then32Dot01() {
        double expected =32.01;
        int x1 = 54;
        int y1 = 66;
        int x2 = 22;
        int y2 = 67;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }


    @Test
    void when00to10098then140Dot01() {
        double expected =140.01;
        int x1 = 0;
        int y1 = 0;
        int x2 = 100;
        int y2 = 98;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}