package com.leetcode.frominterview;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void topDomains() {
        List<String> domains = asList(
                "domain.com",
                "cnn.com",
                "latimes.com",
                "nytimes.com",
                "guardian.co.uk",
//                "guardian.co.uk",
                "latimes.com",
                "foxnews.com",
                "latimes.com",
                "nytimes.com",
                "nytimes.com",
                "nytimes.com",
                "guardian.co.uk"
        );
        int limit = 3;
        Pair[] expected = new Pair[]{
                new Pair("nytimes.com", 4),
                new Pair("latimes.com", 3),
                new Pair("guardian.co.uk", 2)
        };

        Solution solution = new Solution();
        Pair[] actual = solution.topDomains(domains, limit);

        assertArrayEquals(expected, actual);
    }
}