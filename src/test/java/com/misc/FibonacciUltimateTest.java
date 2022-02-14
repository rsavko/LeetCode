package com.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciUltimateTest {

    @Test
    void fib_1() {
        long actual = FibonacciUltimate.fib(1);
        assertEquals(1, actual);
    }

    @Test
    void fib_2() {
        long actual = FibonacciUltimate.fib(2);
        assertEquals(1, actual);
    }

    @Test
    void fib_3() {
        long actual = FibonacciUltimate.fib(3);
        assertEquals(2, actual);
    }

    @Test
    void fib_4() {
        long actual = FibonacciUltimate.fib(4);
        assertEquals(3, actual);
    }

    @Test
    void fib_9() {
        long actual = FibonacciUltimate.fib(9);
        assertEquals(34, actual);
    }

    @Test
    void fib_10() {
        long actual = FibonacciUltimate.fib(10);
        assertEquals(55, actual);
    }

    @Test
    void fib_12() {
        long actual = FibonacciUltimate.fib(12);
        assertEquals(144, actual);
    }
}