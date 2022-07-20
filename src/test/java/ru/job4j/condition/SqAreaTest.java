package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K4Square4() {
        double expected = 4;
        int p = 10;
        double k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP12K10Square2dot97() {
        double expected = 2.97;
        int p = 12;
        double k = 10;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}