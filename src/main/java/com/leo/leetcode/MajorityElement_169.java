package com.leo.leetcode;

/**
 * Created by lionel on 17/12/17.
 */
public class MajorityElement_169 {
    public static int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length / 2];

//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//            if (map.get(num) > nums.length / 2) {
//                return num;
//            }
//        }
//        return 0;
        int major = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                major = nums[i];
                count = 1;
            } else if (major == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return major;
    }
}
