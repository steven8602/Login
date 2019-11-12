package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextInputEditText editText1 =findViewById(R.id.editext_ID);
        TextInputEditText editText2 = findViewById(R.id.editext_PW);
        MaterialButton button1 = findViewById(R.id.materialButton); //로그인 버튼
        MaterialButton button2 = findViewById(R.id.materialButton2); //회원가입 버튼

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Main2Activity.class));
            }
        });



    }
}
