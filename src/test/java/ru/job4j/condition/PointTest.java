package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2.0;
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to20then2dot23() {
        double expected = 2.23;
        Point first = new Point(0, 1);
        Point second = new Point(2, 0);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to52then4dot123() {
        double expected = 4.123;
        Point first = new Point(1, 1);
        Point second = new Point(5, 2);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when17to53then5dot656() {
        double expected = 4.47;
        Point first = new Point(1, 1);
        Point second = new Point(3, 5);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when59to1219then12dot2() {
        double expected = 12.2;
        Point first = new Point(5, 9);
        Point second = new Point(12, 19);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when5912to121923then16dot432() {
        double expected = 16.432;
        Point first = new Point(5, 9, 12);
        Point second = new Point(12, 19, 23);
        double out = first.distance3d(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when121932to546573then72dot925() {
        double expected = 72.925;
        Point first = new Point(15, 19, 32);
        Point second = new Point(54, 65, 73);
        double out = first.distance3d(second);
        Assert.assertEquals(expected, out, 0.01);
    }
}