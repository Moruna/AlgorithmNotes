package com.moruna.sorttest.Bubble;

import android.util.Log;

/**
 * Author: Moruna
 * Date: 2017-07-31
 * 冒泡排序
 */
public class BubbleSort {
    private static final String TAG = "BubbleSort";

    public static void sort(int[] args) {
        int len = args.length;
        for (int i = len - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (args[j] < args[j + 1]) {
                    int tmp = args[j];
                    args[j] = args[j + 1];
                    args[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            Log.e(TAG, "sort: " + args[i]);
        }
    }
}
