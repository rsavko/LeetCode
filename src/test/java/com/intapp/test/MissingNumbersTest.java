package com.intapp.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumbersTest {

    @Test
    @DisplayName("Should correctly find difference")
    void missingNumbers() {
        int[] original = new int[]{1, 2, 3, 4, 5};
        int[] updated = new int[]{2, 3, 5};
        int[] expected = new int[]{1, 4};

        int[] actual = new MissingNumbers().missingNumbers(original, updated);
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Should correctly find difference 2")
    void missingNumbers2() {
        int[] original = new int[]{1, 2, 1, 3, 3, 3, 4, 5, 4};
        int[] updated = new int[]{2, 3, 3, 4, 5, 4};
        int[] expected = new int[]{1, 1, 3};

        int[] actual = new MissingNumbers().missingNumbers(original, updated);
        assertArrayEquals(expected, actual);
    }
}