package com.leo.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lionel on 17/12/9.
 */
public class SelfDividingNumbers_728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        if (left > right) {
            return null;
        }

        for (int i = left; i <= right; i++) {
            if (isTrue(i)) {
                list.add(i);
            }
        }
        return list;

    }

    private boolean isTrue(int element) {
        char[] charArray = String.valueOf(element).toCharArray();
        for (char ele : charArray) {
            int divide = ele - '0';
            if (divide == 0) {
                return false;
            }
            if (element % divide != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SelfDividingNumbers_728 selfDividingNumbers_728 = new SelfDividingNumbers_728();
        int left = 1;
        int right = 22;
        System.out.println(selfDividingNumbers_728.selfDividingNumbers(left, right));
    }
}
