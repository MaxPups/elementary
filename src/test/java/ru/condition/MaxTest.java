package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax13To2Then13() {
        int left = 13;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 13;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax9To9Then9() {
        int left = 9;
        int right = 9;
        int result = Max.max(left, right);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

}