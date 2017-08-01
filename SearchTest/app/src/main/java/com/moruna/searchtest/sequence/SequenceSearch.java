package com.moruna.searchtest.sequence;

/**
 * Author: Moruna
 * Date: 2017-08-01
 * 顺序查找
 */
public class SequenceSearch {
    public static int search(int[] args,int key){
        for (int i = 0; i < args.length; i++) {
            if (args[i] == key){
                return i;
            }
        }
        return -1;
    }
}
