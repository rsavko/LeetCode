package com.leetcode.problem12;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static final Map<Integer, String> map = new HashMap<>();

    static {
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
    }

    public String intToRoman(int num) {
        String[] M = new String[]{"", "M", "MM", "MMM"};
        String[] C = new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] X = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] I = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num / 1000] + C[(num % 1000) / 100] + X[(num % 100) / 10] + I[(num % 10)];
    }


    // My original solution
    public String intToRoman2(int num) {
        String result = "";
        StringBuilder cache = new StringBuilder();
        int divider = 1000;
        while (num > 0) {
            cache.setLength(0);
            for (int i = 1; i <= num / divider; i++) {
                if (i == 4 || i == 5 || i == 9) {
                    cache.setLength(0);
                    cache.append(map.get(i * divider));
                } else {
                    cache.append(map.get(divider));
                }
            }
            result += cache.toString();
            num %= divider;
            divider /= 10;
        }
        return result;
    }
}
