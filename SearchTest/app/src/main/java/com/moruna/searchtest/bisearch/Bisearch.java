package com.moruna.searchtest.bisearch;

/**
 * Author: Moruna
 * Date: 2017-08-01
 * 折半查找
 */
public class Bisearch {

    public static int search(int[] args, int key) {
        int low = 0;
        int high = args.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (args[mid] == key) {
                return mid;
            } else if (args[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
