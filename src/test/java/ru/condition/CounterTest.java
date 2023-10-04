package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromTenToTwelveThenTwentyTwo() {
        int start = 10;
        int finish = 12;
        int result = Counter.sumByEven(start, finish);
        int expected = 22;
        assertThat(result).isEqualTo(expected);
    }
}