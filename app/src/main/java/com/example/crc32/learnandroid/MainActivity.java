package com.example.crc32.learnandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView mHellTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHellTextView = findViewById(R.id.textView);
    }

    public void onClick(View view) {
        mHellTextView.setText("Hello Kitty!");
    }
}
