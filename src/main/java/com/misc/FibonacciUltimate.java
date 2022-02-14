package com.misc;

public class FibonacciUltimate {
    public static long fib(int n) {
        int back2 = 0, back1 = 1;
        int next;
        if (n == 0) return 0;
        for (int i = 2; i < n; i++) {
            next = back2 + back1;
            back2 = back1;
            back1 = next;
        }
        return back1 + back2;
    }
}
