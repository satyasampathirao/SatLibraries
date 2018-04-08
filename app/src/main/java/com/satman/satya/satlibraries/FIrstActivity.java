package com.satman.satya.satlibraries;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.satman.satya.arthematic.Operations;

public class FIrstActivity extends AppCompatActivity {


    Operations op ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        op = new Operations();

        int sum = op.add(10,20);


    }

}



