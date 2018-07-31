package com.example.student_39.p0061_activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HW3Screen2Activity extends AppCompatActivity {

    Context context = this;
    TextView textView4, textView5, textView7;
    Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw3_screen2);

        getSupportActionBar().setTitle("Screen B");

        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView7 = (TextView) findViewById(R.id.textView7);
        button7 = (Button) findViewById(R.id.button7);

        button7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, HW3Screen3Activity.class);
                intent.putExtra("textFromScreenA", getIntent().getStringExtra("textFromScreenA"));
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        textView4.setText(getIntent().getStringExtra("textFromScreenA"));
        if(getIntent().getStringExtra("textFromScreenC") != null) {
            textView5.setText(getIntent().getStringExtra("textFromScreenC"));
            textView5.setVisibility(View.VISIBLE);
            textView7.setVisibility(View.VISIBLE);
        } else {
            textView5.setVisibility(View.GONE);
            textView7.setVisibility(View.GONE);
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(context, HW3Screen1Activity.class);
        intent.putExtra("textFromScreenA", getIntent().getStringExtra("textFromScreenA"));
        intent.putExtra("textFromScreenC", getIntent().getStringExtra("textFromScreenC"));
        startActivity(intent);
    }
}
