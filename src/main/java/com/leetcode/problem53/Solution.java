package com.leetcode.problem53;

public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        return findMax(nums, 0, nums.length-1);
    }
    private int findMax(int[] a, int low, int high) {
        if (low == high) {
            return a[low];
        } else {
            int mid = (low + high) / 2;
            int maxLeft = findMax(a, low, mid);
            int maxRight = findMax(a, mid + 1, high);
            int crossSum = findCrossSum(a, low, mid, high);
            if (maxLeft >= maxRight && maxLeft >= crossSum) return maxLeft;
            if (maxRight >= maxLeft && maxRight >= crossSum) return maxRight;
            return crossSum;
        }
    }

    private int findCrossSum(int[] a, int low, int mid, int high) {
        long leftSum = Integer.MIN_VALUE;
        long sum = 0;
        for (int i = mid; i >= low; i--) {
            sum += a[i];
            if (sum > leftSum) {
                leftSum = sum;
            }
        }
        long rightSum = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid+1; i <= high; i++) {
            sum += a[i];
            if (sum > rightSum) {
                rightSum = sum;
            }
        }
        return (int) (leftSum + rightSum);
    }
}
