package com.leo.leetcode;

/**
 * Created by lionel on 17/12/10.
 */
public class TwoSumII_167 {
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int length = numbers.length;
        if (length < 2) {
            return result;
        }
        for (int i = 0, j = length-1; i < j; ) {
            if (numbers[i] + numbers[j] == target) {
                result[0] = i + 1;
                result[1] = j + 1;
                break;
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                i++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4};
        int target = 6;
        for (int ele : twoSum(numbers, target)) {
            System.out.print(ele + " ");
        }
    }
}
