package com.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciWithTailRecursionTest {

    @Test
    void fib_0() {
        long actual = FibonacciWithTailRecursion.fib(0);
        assertEquals(0, actual);
    }

    @Test
    void fib_1() {
        long actual = FibonacciWithTailRecursion.fib(1);
        assertEquals(1, actual);
    }

    @Test
    void fib_2() {
        long actual = FibonacciWithTailRecursion.fib(2);
        assertEquals(1, actual);
    }

    @Test
    void fib_3() {
        long actual = FibonacciWithTailRecursion.fib(3);
        assertEquals(2, actual);
    }

    @Test
    void fib_4() {
        long actual = FibonacciWithTailRecursion.fib(4);
        assertEquals(3, actual);
    }

    @Test
    void fib_9() {
        long actual = FibonacciWithTailRecursion.fib(9);
        assertEquals(34, actual);
    }

    @Test
    void fib_10() {
        long actual = FibonacciWithTailRecursion.fib(10);
        assertEquals(55, actual);
    }

    @Test
    void fib_12() {
        long actual = FibonacciWithTailRecursion.fib(12);
        assertEquals(144, actual);
    }
}