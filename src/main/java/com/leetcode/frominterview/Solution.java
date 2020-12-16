package com.leetcode.frominterview;

import java.util.*;

class Pair {
    final String domain;
    final int count;

    public Pair(String domain, int count) {
        this.domain = domain;
        this.count = count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, count);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) o;
        return domain.equals(pair.domain) && count == pair.count;
    }

    @Override
    public String toString() {
        return domain + ":" + count;
    }
}
public class Solution {
    public Pair[] topDomains(List<String> domains, int limit) {
        Map<String, Integer> map = new HashMap<>(domains.size());
        domains.forEach(domain -> map.put(domain, map.getOrDefault(domain,0) + 1));
        List<String> candidates = new ArrayList<>(map.keySet());
        candidates.sort((d1, d2) -> !map.get(d1).equals(map.get(d2)) ? map.get(d2) - map.get(d1) : d1.compareTo(d2));
        int resultSize = Math.min(domains.size(), limit);
        Pair[] result = new Pair[resultSize];
        int i = 0;
        List<String> subList = candidates.subList(0, resultSize);
        for(String c : subList) {
            result[i++] = new Pair(c, map.get(c));
        }
        return result;
    }
}
