package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @SuppressLint("SetTextI18n")
    public void Add(View v){
        EditText et1 =(EditText) findViewById(R.id.editTextNumber);
        EditText et2 =(EditText) findViewById(R.id.editTextNumber2);
        EditText et3 =(EditText) findViewById(R.id.editTextNumber3);


        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());

        int result = n1 + n2;

        et3.setText("Total Value " + result);

    }

    @SuppressLint("SetTextI18n")
    public void Subtract(View v){
        EditText et1 =(EditText) findViewById(R.id.editTextNumber);
        EditText et2 =(EditText) findViewById(R.id.editTextNumber2);
        EditText et3 =(EditText) findViewById(R.id.editTextNumber3);


        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());

        int result = n1 - n2;

        et3.setText("Subtract Value " + result);

    }
}