package com.leo.leetcode;

/**
 * @Author: lionel
 * @Date: 2019/3/9 19:13
 * @Version 1.0
 */
public class ShellSort {
    public static void shellSort(int[] array, int N) {
        for (int Increment = N / 2; Increment > 0; Increment = Increment / 2) {
            for (int i = Increment; i < N; i++) {
                int temp = array[i];
                int j;
                for (j = i; j >= Increment; j -= Increment) {
                    if (array[j - Increment] > temp) {
                        array[j] = array[j - Increment];
                    } else
                        break;
                }
                array[j] = temp;
            }
        }
    }


    private static void printArray(int[] array) {
        for (int anArray : array) {
            System.out.print(anArray + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {81, 94, 11, 96, 12, 36, 17, 95, 28, 58, 41, 75, 15};
        shellSort(array, array.length);
        printArray(array);

    }
}
