package com.leo.leetcode;

import java.util.ArrayList;
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

    public ArrayList<String> wordBreak2(String s, Set<String> dict) {
        ArrayList<String> res = new ArrayList<String>();
        if (s == null || s.length() <= 0 || dict == null || dict.size() <= 0) {
            return res;
        }
        boolean[] tags = new boolean[s.length() + 1];
        tags[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (tags[j] && dict.contains(s.substring(j, i))) {
                    tags[i] = true;
                    break;
                }
            }
        }
        return null;
    }


    public static void main(String[] args) {
        WordBreak wordBreak = new WordBreak();
        String str = "leetcode";
        Set<String> set = new HashSet<String>();
        set.add("leet");
        set.add("code");
        System.out.println(wordBreak.wordBreak(str, set));
    }
}
