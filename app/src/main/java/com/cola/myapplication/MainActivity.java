package com.cola.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * compute
     */
    private int add(){
        return 0;
    }

    /**
     * find max
     */
    private void getMax(){
        int max = 100;
    }
}
