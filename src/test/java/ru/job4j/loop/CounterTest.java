package ru.job4j.loop;

import org.junit.Test;

import org.junit.Assert;

public class CounterTest {

    @Test
    public void whenSumNumbersFromZeroToFiveThenFifteen() {
        int start = 0;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 15;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumNumbersFromFiveToTenThenFortyFive() {
        int start = 5;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 45;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromTwoToSixteenThenThirty() {
        int start = 2;
        int finish = 16;
        int result = Counter.sumByEven(start, finish);
        int expected = 72;
        Assert.assertEquals(expected, result);
    }
}