package com.example.student_39.p0061_activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HW1Screen2Activity extends AppCompatActivity {
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw1_screen2);

        final EditText editText = (EditText) findViewById(R.id.editText);
        Button button3 = (Button) findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, HW1Screen1Activity.class);
                intent.putExtra("text", editText.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }

}
