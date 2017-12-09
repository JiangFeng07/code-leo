package com.leo.leetcode;

/**
 * Created by lionel on 17/12/9.
 */
public class HammingDistance_461 {
    public int hammingDistance(int x, int y) {
        String x_tmp = Integer.toBinaryString(x);
        String y_tmp = Integer.toBinaryString(y);
        return diff(x_tmp, y_tmp);
    }

    private int diff(String x, String y) {

        int length = Math.abs(x.length() - y.length());
        if (x.length() > y.length()) {
            for (int i = 0; i < length; i++) {
                y = 0 + y;
            }
        }
        if (x.length() < y.length()) {
            for (int i = 0; i < length; i++) {
                x = 0 + x;
            }
        }
        int num = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) != y.charAt(i)) {
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        HammingDistance_461 hammingDistance461 = new HammingDistance_461();
        int x = 1;
        int y = 4;
        System.out.println(hammingDistance461.hammingDistance(x, y));
    }
}
