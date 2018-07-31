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

public class HW2Screen1Activity extends AppCompatActivity {

    Context context = this;
    EditText editText2;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw2_screen1);

        editText2 = (EditText) findViewById(R.id.editText2);
        button4 = (Button) findViewById(R.id.button4);

        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, HW2Screen2Activity.class);
                intent.putExtra("text", editText2.getText().toString());
                startActivity(intent);
            }
        });

        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(charSequence.length()>0 && editText2.getText().length()>0) {
                    button4.setEnabled(true);
                } else {
                    button4.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }

}
