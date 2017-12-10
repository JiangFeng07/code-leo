package com.leo.leetcode;

import java.util.*;

/**
 * Created by lionel on 17/12/9.
 */
public class TopKFrequentElements_347 {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        if (k < 1 || k > nums.length) {
            return null;
        }
        List<Integer> result = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> mapList = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());

        Collections.sort(mapList, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        int n=0;
        for (Map.Entry<Integer, Integer> map1 : mapList) {
            result.add(map1.getKey());
            n++;
            if (n==k) {
                break;
            }
        }

        return result;
    }
}
