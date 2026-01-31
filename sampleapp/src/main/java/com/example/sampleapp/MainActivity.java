package com.example.sampleapp;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import com.example.mysimplesdk.MySimpleSdk;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MySimpleSdk.init(this);
        MySimpleSdk.showToast("SDK Working 🎉");
    }
}