package com.leetcode.problem121;


public class Solution {
    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int price : prices) {
            if (price < minprice)
                minprice = price;
            else if (price - minprice > maxprofit)
                maxprofit = price - minprice;
        }
        return maxprofit;
    }

    public int maxProfit2(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int[] changes = new int[prices.length - 1];
        int k = 0;
        for (int i = 1, len = prices.length; i < len; i++) {
            changes[k++] = prices[i] - prices[i - 1];
        }
        int maxProfit = findMax(changes, 0, changes.length - 1);
        return Math.max(maxProfit,0);
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
