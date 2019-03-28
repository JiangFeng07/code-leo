package com.leo.leetcode;

/**
 * @Author: lionel
 * @Date: 2019/3/9 20:58
 * @Version 1.0
 */
public class HeapSort {
    public static void heapAdjust(int[] heap, int s, int m) {
        int rc = heap[s];
        for (int i = 2 * s + 1; i <= m; i = 2 * s + 1) {
            if (i < m && heap[i + 1] < heap[i])
                i++;
            if (heap[s] <= heap[i])
                break;
            //heap[s]=heap[i];
            int temp = heap[s];
            heap[s] = heap[i];
            heap[i] = temp;
            s = i;
        }
        heap[s] = rc;
    }

    public static void heapSort(int[] array) {
        for (int i = (array.length - 1) / 2; i >= 0; --i) {
            heapAdjust(array, i, array.length - 1);
        }
        for (int i = array.length - 1; i > 0; --i) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapAdjust(array, 0, i - 1);
        }
    }

    public static void print(int[] array) {
        for (int anArray : array) {
            System.out.print(anArray + ",");
        }
    }

    public static void main(String[] args) {
        int[] array = {49, 38, 65, 97, 76, 13, 27, 49};
        heapSort(array);
        print(array);
    }
}
