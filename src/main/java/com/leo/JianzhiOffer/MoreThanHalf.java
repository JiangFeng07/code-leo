package com.leo.JianzhiOffer;

/**
 * Created by lionel on 18/1/19.
 */
public class MoreThanHalf {
    public int MoreThanHalfNum_Solution(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int result = array[0];
        int times = 1;
        for (int i = 1; i < array.length; i++) {
            if (times == 0) {
                result = array[i];
                times = 1;
            } else if (result == array[i]) {
                times++;
            } else {
                times--;
            }
        }
        if (!checkMoreThanHalf(array, result)) {
            return 0;
        }
        return result;
    }

    private boolean checkMoreThanHalf(int[] array, int result) {
        int length = array.length;
        int times = 0;
        for (int ele : array) {
            if (ele == result) {
                times++;
            }
        }
        return times >= length / 2;
    }

    public static void main(String[] args) {
        System.out.println(3^3);
    }
}
