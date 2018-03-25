package com.example.crc32.learnandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mHellTextView;
    private EditText mNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHellTextView = findViewById(R.id.textView);
        mNameEditText = findViewById(R.id.editText);
    }

    public void onClick(View view) {

        if (mNameEditText.getText().length() == 0) {
            mHellTextView.setText("Hello Kitty!");
        }else {
            mHellTextView.setText("Hello, " + mNameEditText.getText());
        }

    }
}
