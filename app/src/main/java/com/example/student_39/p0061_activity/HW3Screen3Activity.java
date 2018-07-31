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

public class HW3Screen3Activity extends AppCompatActivity {

    Context context = this;
    EditText editText4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw3_screen3);

        getSupportActionBar().setTitle("Screen C");

        editText4 = (EditText) findViewById(R.id.editText4);

        editText4.setText(getIntent().getStringExtra("textFromScreenA"));
    }

    public void onBackPressed() {
        Intent intent = new Intent(context, HW3Screen2Activity.class);
        intent.putExtra("textFromScreenA", getIntent().getStringExtra("textFromScreenA"));
        intent.putExtra("textFromScreenC", editText4.getText().toString());
        startActivity(intent);
    }

}
