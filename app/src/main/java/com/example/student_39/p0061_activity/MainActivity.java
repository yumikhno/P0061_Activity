package com.example.student_39.p0061_activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewActivityLifeCycle = (TextView) findViewById(R.id.textViewActivityLifeCycle);
        TextView textViewIntentData = (TextView) findViewById(R.id.textViewIntentData);
        TextView textViewHW1 = (TextView) findViewById(R.id.textViewHW1);
        TextView textViewHW2 = (TextView) findViewById(R.id.textViewHW2);
        TextView textViewHW3 = (TextView) findViewById(R.id.textViewHW3);

        textViewActivityLifeCycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ActivityLifeCycle.class);
                startActivity(intent);
            }
        });

        textViewIntentData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, FromActivity.class);
                startActivity(intent);
            }
        });

        textViewHW1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, HW1Screen1Activity.class);
                startActivity(intent);
            }
        });

        textViewHW2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, HW2Screen1Activity.class);
                startActivity(intent);
            }
        });

        textViewHW3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, HW3Screen1Activity.class);
                startActivity(intent);
            }
        });

    }
}


