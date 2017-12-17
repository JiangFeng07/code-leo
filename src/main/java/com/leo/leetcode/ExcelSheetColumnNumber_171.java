package com.leo.leetcode;

/**
 * Created by lionel on 17/12/17.
 */
public class ExcelSheetColumnNumber_171 {
    public static int titleToNumber(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            result += (ch - 'A' + 1) * Math.pow(26.0, s.length()-1-i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
        System.out.println(titleToNumber("BA"));
    }
}
