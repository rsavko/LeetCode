package com.misc;

public class TailRecursion {
    public static long fib(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Number should be positive.");
        }
        if (n == 1) return 1;
        return go(n, 1);
    }

    private static long go(int n, int accumulator) {
        if (n == 1) return accumulator;
        return go(n-1, accumulator * n);
    }
}
