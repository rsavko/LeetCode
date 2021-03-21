package com.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialWithTailRecursionTest {

    @Test
    void factorial() {
        long actualResult = FactorialWithTailRecursion.factorial(4);
        long expected = 24;
        assertEquals(expected, actualResult);
    }

    @Test
    void factorial_1() {
        long actualResult = FactorialWithTailRecursion.factorial(1);
        long expected = 1;
        assertEquals(expected, actualResult);
    }

    @Test
    void factorial_0() {
        assertThrows(IllegalArgumentException.class, () -> {
            long actualResult = FactorialWithTailRecursion.factorial(0);
        });
    }
}