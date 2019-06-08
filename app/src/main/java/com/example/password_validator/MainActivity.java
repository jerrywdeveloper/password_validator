package com.example.password_validator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edit;
    TextView message0;
    TextView message1;
    TextView message2;
    Validator val;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button validate = findViewById(R.id.button);

        message1 = (TextView) findViewById(R.id.textView2);
        message2 = (TextView) findViewById(R.id.textView3);
        message0 = findViewById(R.id.textView);

        edit = findViewById(R.id.editText);


        validate.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                val = new Validator();
                String display = "\u263A";
                String password = edit.getText().toString();

                if (!val.strCheck(password)) {
                    display = "\'password\' is not a strong password";
                } else if (!val.strLenCheck(password)) {
                    display = "Password should be more than 8 characters";
                } else if (!val.stringHasSpecial(password)) {
                    display = "Password should contain special characters";
                } else if (!val.stringHasCase(password)) {
                    display = "Password should have upper and lower cases";
                } else if (!val.stringHasNum(password)) {
                    display = "Password should contain at least one number";
                } else {
                    message1.setText("All Good!");
                }

                message2.setText(display);

                message1.setVisibility(View.VISIBLE);
                message2.setVisibility(View.VISIBLE);
            }
        });

    }
}
