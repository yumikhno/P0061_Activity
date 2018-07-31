package com.example.student_39.p0061_activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HW2Screen2Activity extends AppCompatActivity {
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw2_screen2);

        Button button5 = (Button) findViewById(R.id.button5);

        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, HW2Screen3Activity.class);
                intent.putExtra("text", getIntent().getStringExtra("text"));
                startActivity(intent);
            }
        });
    }

}
