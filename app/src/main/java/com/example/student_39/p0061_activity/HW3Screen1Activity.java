package com.example.student_39.p0061_activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;

public class HW3Screen1Activity extends AppCompatActivity {

    Context context = this;
    EditText editText3;
    Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw3_screen1);

        getSupportActionBar().setTitle("Screen A");

        editText3 = (EditText) findViewById(R.id.editText3);
        button6 = (Button) findViewById(R.id.button6);

        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, HW3Screen2Activity.class);
                intent.putExtra("textFromScreenA", editText3.getText().toString());
                startActivity(intent);
            }
        });

        editText3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(charSequence.length()>0 && editText3.getText().length()>0) {
                    button6.setEnabled(true);
                } else {
                    button6.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        editText3.setText(getIntent().getStringExtra("textFromScreenA"));
        if(getIntent().getStringExtra("textFromScreenC") != null) {
            editText3.setText(getIntent().getStringExtra("textFromScreenC"));
        };
    }
}
