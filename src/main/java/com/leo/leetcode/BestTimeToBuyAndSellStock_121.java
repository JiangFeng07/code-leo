package com.leo.leetcode;

/**
 * Created by lionel on 17/12/17.
 */
public class BestTimeToBuyAndSellStock_121 {
    public static int maxProfit(int[] prices) {
        int result = 0;
        if (prices == null || prices.length == 0) {
            return result;
        }
//        int min = Integer.MAX_VALUE;

//        for (int i = 0; i < prices.length - 1; i++) {
//            if (prices[i] < min) {
//                min = prices[i];
//                for (int j = i + 1; j < prices.length; j++) {
//                    if (prices[j] - min > result) {
//                        result = prices[j] - min;
//                    }
//                }
//            }
//
//        }

        int min = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                if (prices[i] - min > result) {
                    result = prices[i] - min;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] prices = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices));
    }
}
