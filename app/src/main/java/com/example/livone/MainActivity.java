package com.example.livone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.mylibsone.MathOps;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvMsg = findViewById(R.id.tvMsg);

        int result = MathOps.sub(10, 5);
        tvMsg.setText(String.valueOf(result));


    }
}