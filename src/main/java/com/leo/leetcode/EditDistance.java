package com.leo.leetcode;

/**
 * Created by lionel on 18/1/7.
 */
public class EditDistance {
    public static int minDistance(String word1, String word2) {
        if (word1 == null || word2 == null) {
            return 0;
        }

        int length1 = word1.length();
        int length2 = word2.length();

        if (length1 == 0 || length2 == 0) {
            return Math.max(length1, length2);
        }

        int[][] dist = new int[length1 + 1][length2 + 1];
        for (int i = 0; i <= length1; i++) {
            dist[i][0] = i;
        }
        for (int j = 0; j <= length2; j++) {
            dist[0][j] = j;
        }
        int cost = 0;
        for (int i = 1; i <= length1; i++) {
            for (int j = 1; j <= length2; j++) {
                cost = word1.charAt(i - 1) == word2.charAt(j - 1) ? 0 : 1;
                dist[i][j] = Math.min(Math.min(dist[i - 1][j] + 1, dist[i][j - 1] + 1), dist[i - 1][j - 1] + cost);
            }
        }
        return dist[length1][length2];

    }

    public static void main(String[] args) {
        System.out.println(minDistance("eat", "cat"));
    }

}
