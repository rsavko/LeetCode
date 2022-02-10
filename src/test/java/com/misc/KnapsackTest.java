package com.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnapsackTest {

    @Test
    void solveKnapsack() {
        Knapsack ks = new Knapsack();
        int[] profits = {1, 6, 10, 16};
        int[] weights = {1, 2, 3, 5};
        int maxProfit = ks.solveKnapsack(profits, weights, 7);
        assertEquals(22, maxProfit);
        maxProfit = ks.solveKnapsack(profits, weights, 6);
        assertEquals(17, maxProfit);
    }

    @Test
    void solveKnapsackBottomUp() {
        Knapsack ks = new Knapsack();
        int[] profits = {1, 6, 10, 16};
        int[] weights = {1, 2, 3, 5};
        int maxProfit = ks.solveKnapsackBottomUp(profits, weights, 7);
        assertEquals(22, maxProfit);
        maxProfit = ks.solveKnapsackBottomUp(profits, weights, 6);
        assertEquals(17, maxProfit);
    }
}