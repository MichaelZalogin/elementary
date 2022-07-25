package ru.job4j.array;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap5to8() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int source = 5;
        int dest = 8;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 4, 5, 9, 7, 8, 6, 10};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap3to8() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int source = 3;
        int dest = 8;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 9, 5, 6, 7, 8, 4, 10};
        Assert.assertArrayEquals(expected, result);
    }
}