package com.misc;

public class FibonacciWithTailRecursion {
    public static long fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return go(n, 0, 1);
    }

    private static long go(int n, int a, int b) {
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }
        return go(n - 1, b, a + b);
    }
}
