package com.leo.leetcode;

import java.util.*;

/**
 * Created by lionel on 17/12/11.
 */
public class TopKFrequentWords_692 {
    public static List<String> topKFrequent(String[] words, int k) {
        List<String> result = new ArrayList<>();
        if (words == null || words.length == 0 || k <= 0 || k > words.length) {
            return result;
        }
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<Map.Entry<String, Integer>> priorityQueue = new PriorityQueue<>(
                (a, b) -> Objects.equals(a.getValue(), b.getValue()) ? b.getKey().compareTo(a.getKey()) : a.getValue() - b.getValue());

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            priorityQueue.offer(entry);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }
        while (!priorityQueue.isEmpty()) {
            result.add(0,priorityQueue.poll().getKey());
        }
        return result;
    }
}
