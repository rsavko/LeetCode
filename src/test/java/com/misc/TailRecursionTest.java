package com.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TailRecursionTest {

    @Test
    void fib() {
        long actualResult = TailRecursion.fib(4);
        long expected = 24;
        assertEquals(expected, actualResult);
    }

    @Test
    void fib_1() {
        long actualResult = TailRecursion.fib(1);
        long expected = 1;
        assertEquals(expected, actualResult);
    }

    @Test
    void fib_0() {
        assertThrows(IllegalArgumentException.class, () -> {
            long actualResult = TailRecursion.fib(0);
        });
    }
}