package com.moruna.sorttest.selection;

import android.util.Log;

/**
 * Author: Moruna
 * Date: 2017-07-31
 * 选择排序
 */
public class SelectionSort {
    private static final String TAG = "SelectionSort";

    public static void sort(int[] args) {
        int len = args.length;
        for (int i = 0, k = 0; i < len; i++, k = i) {
            for (int j = i + 1; j < len; j++) {
                if (args[k] > args[j]) {
                    k = j;
                }
            }
            if (i != k) {
                int tmp = args[i];
                args[i] = args[k];
                args[k] = tmp;
            }
        }

        for (int i = 0; i < len; i++) {
            Log.e(TAG, "sort: " + args[i]);
        }
    }
}
