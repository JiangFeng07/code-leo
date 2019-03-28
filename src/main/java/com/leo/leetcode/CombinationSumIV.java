package com.leo.leetcode;

/**
 * Created by lionel on 18/10/18.
 */
public class CombinationSumIV {

    public static int combinationSum4(int[] nums, int target) {
        if (nums == null || nums.length <= 0 || target <= 0) {
            return 0;
        }
        int result = 0;
        for (int num : nums) {
            if (target - num < 0) {
                continue;
            }
            if (target - num == 0) {
                result += 1;
            }
            if (target - num > 0) {
                result += combinationSum4(nums, target - num);
            }
        }
        return result;
    }

    public static int combinationSum(int[] nums, int target) {
        if (nums == null || nums.length <= 0 || target <= 0) {
            return 0;
        }
        int[] result = new int[target + 1];
        result[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (num <= i) {
                    result[i] += result[i - num];
                }
            }
        }
        return result[target];
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int target = 32;
        System.out.println(combinationSum(nums, target));
    }
}
