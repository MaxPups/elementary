package ru.array;

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
    public void whenSort3values() {
        int[] data = new int[]{1,7,3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1,3,7};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5values() {
        int[] data = new int[]{4,9,2,8,3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{2,3,4,8,9};
        assertThat(result).containsExactly(expected);
    }
}