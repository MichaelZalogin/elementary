package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int result = 5;
        int expected = 120;
        assertEquals(expected, Factorial.calc(result), "Test failed");
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int result = 0;
        int expected = 1;
        assertEquals(expected, Factorial.calc(result), "Test failed");
    }
}