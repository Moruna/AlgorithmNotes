package com.moruna.searchtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.moruna.searchtest.bisearch.Bisearch;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] data = {5, 10, 50, 9, 59, 66, 100, 5};

        int index = Bisearch.search(data, 66);
        Log.e(TAG, "onCreate: index = " + index);
    }
}
