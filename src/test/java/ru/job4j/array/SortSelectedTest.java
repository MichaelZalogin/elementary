package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[]{8, 3, 13};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{3, 8, 13};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[]{13, 4, 16, 2, 9};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{2, 4, 9, 13, 16};
        assertThat(result).containsExactly(expected);
    }
}