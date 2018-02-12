package com.leo.JianzhiOffer;

/**
 * Created by lionel on 18/2/11.
 */
public class VerifySquenceOfBST {
    public static boolean VerifySequenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        return VerifySequenceOfBST(sequence, 0, sequence.length - 1);


    }

    private static boolean VerifySequenceOfBST(int[] sequence, int start, int end) {
        if (start >= end) {
            return true;
        }
        int i = start;
        while (sequence[i] < sequence[end]) {
            i++;
        }
        for (int j = i; j < end; j++) {
            if (sequence[j] > sequence[end]) {
                continue;
            }
            return false;
        }
        return VerifySequenceOfBST(sequence, start, i - 1) && VerifySequenceOfBST(sequence, i, end - 1);
    }

    public static void main(String[] args) {
        int[] array = {4, 8, 6, 12, 16, 14, 10};
        System.out.println(VerifySequenceOfBST(array));
    }
}
