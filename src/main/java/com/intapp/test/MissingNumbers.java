package com.intapp.test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.sort;

public class MissingNumbers {
    public int[] missingNumbers(int[] original, int[] updated) {
        sort(original);
        sort(updated);

        int[] result = new int[original.length - updated.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (j < original.length && k < updated.length) {
            if (original[j] < updated[k]) {
                result[i++] = original[j];
                j++;
            } else if (original[j] > updated[k]) {
                result[i++] = updated[k];
                k++;
            } else {
                j++;
                k++;
            }
        }
        return result;
    }

    public int[] missingNumbers2(int[] original, int[] updated) {
        List<Integer> list = new ArrayList<>();

        for (int num : original) {
            list.add(num);
        }
        for (int num : updated) {
            list.remove(Integer.valueOf(num));
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
