package com.leetcode.problem29;

public class Solution {
    public int divide(int dividend, int divisor) {
        boolean negative = dividend > 0 && divisor < 0 || dividend < 0 && divisor > 0;
        if (dividend < 0) dividend = -dividend;
        if (divisor < 0) divisor = -divisor;

        if ((dividend >= Integer.MAX_VALUE || dividend <= Integer.MIN_VALUE) && divisor == 1)
            return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        int curr = 1;
        int result = 0;
        if (divisor > dividend) {
            return 0;
        } else if (divisor == dividend)
            return negative ? -1 : 1;

        while (divisor < dividend) {
            divisor <<= 1;
            curr <<= 1;
        }

        divisor >>= 1;
        curr >>= 1;

        while (curr != 0) {
            if (dividend >= divisor) {
                dividend -= divisor;
                result |= curr;
            }
            curr >>= 1;
            divisor >>= 1;
        }
        return negative ? -result : result;
    }

    public int divide2(int dividend, int divisor) {
        int sign = ((dividend < 0) ^
                (divisor < 0)) ? -1 : 1;
        boolean negative = dividend > 0 && divisor < 0 || dividend < 0 && divisor > 0;
        if (dividend < 0) dividend = -dividend;
        if (divisor < 0) divisor = -divisor;

        if ((dividend >= Integer.MAX_VALUE || dividend <= Integer.MIN_VALUE) && divisor == 1)
            return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;

        if (dividend < divisor) return 0;
        int sum = 0, quotient = 0;
        while (sum + sum <= dividend) {
            sum += sum;
            quotient += quotient;
        }
        return negative ? -quotient : quotient;
    }
}
