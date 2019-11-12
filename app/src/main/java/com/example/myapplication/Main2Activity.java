package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextInputEditText editText1 =findViewById(R.id.ID);
        TextInputEditText editText2 = findViewById(R.id.PW);
        MaterialButton button1 = findViewById(R.id.materialButton3);


    }
}
