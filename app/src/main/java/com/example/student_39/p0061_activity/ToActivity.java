package com.example.student_39.p0061_activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class ToActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to);

        TextView textView = (TextView) findViewById(R.id.textView);

        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("editText"));

    }
}
