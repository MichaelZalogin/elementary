package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To3Then3() {
        int left = 2;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax6To8Then8() {
        int left = 6;
        int right = 8;
        int result = Max.max(left, right);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To5To12Then12() {
        int first = 3;
        int second = 5;
        int third = 12;
        int result = Max.max(first, second, third);
        int expected = 12;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax11To4To2Then11() {
        int first = 11;
        int second = 4;
        int third = 2;
        int result = Max.max(first, second, third);
        int expected = 11;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To32To12Then32() {
        int first = 2;
        int second = 32;
        int third = 12;
        int result = Max.max(first, second, third);
        int expected = 32;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To32To12to52Then52() {
        int first = 2;
        int second = 32;
        int third = 12;
        int fourth = 52;
        int result = Max.max(first, second, third, fourth);
        int expected = 52;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To32To52to12Then52() {
        int first = 2;
        int second = 32;
        int third = 52;
        int fourth = 12;
        int result = Max.max(first, second, third, fourth);
        int expected = 52;
        Assert.assertEquals(result, expected);
    }
}