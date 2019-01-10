package com.leetcode.problem9;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 9)  return true;
        int power = 0;
        int temp = x;
        while (temp / 10 > 0) {
            power++;
            temp /= 10;
        }
        while (power > 0) {
            int reminder = x % 10;
            int firstDigit = (int) (x / Math.pow(10, power));
            if (firstDigit != reminder) {
                return false;
            }
            x = x - (reminder * (int)Math.pow(10, power)); //remove first digit
            x /= 10; // remove last digit
            power -= 2;
        }
        return true;
    }
}
