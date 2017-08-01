package com.moruna.sorttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.moruna.sorttest.Bubble.BubbleSort;
import com.moruna.sorttest.quick.QuickSort;
import com.moruna.sorttest.selection.SelectionSort;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] data = {5, 10, 50, 9, 59, 66, 100, 5};
//        SelectionSort.sort(data);
        BubbleSort.sort(data);
    }
}
