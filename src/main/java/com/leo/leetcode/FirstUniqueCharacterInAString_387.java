package com.leo.leetcode;

/**
 * Created by lionel on 17/12/17.
 */
public class FirstUniqueCharacterInAString_387 {
    public static int firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        if (s.length() == 1) {
            return 0;
        }
        char[] chars = s.toCharArray();
        int slow = 0;
        int fast = 1;


        return -1;
    }


}
