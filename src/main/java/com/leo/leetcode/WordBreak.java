package com.leo.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: lionel
 * @Date: 2019/3/28 23:03
 * @Version 1.0
 */
public class WordBreak {
    public boolean wordBreak(String s, Set<String> dict) {
        if (s == null || s.length() <= 0 || dict == null || dict.size() <= 0) {
            return false;
        }
        int length = s.length();
        boolean[] array = new boolean[length + 1];
        array[0] = true;
        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[j] && dict.contains(s.substring(j, i))) {
                    array[i] = true;
                    break;
                }
            }
        }
        return array[length];
    }

    public static void main(String[] args) {
        WordBreak wordBreak = new WordBreak();
        String str = "leetcode";
        Set<String> set = new HashSet<>();
        set.add("leet");
        set.add("code");
        System.out.println(wordBreak.wordBreak(str, set));
    }
}
