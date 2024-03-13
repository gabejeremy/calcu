package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLayoutExercise;
    Button btnButtonExercise;
    Button btnCalculatorExercise;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLayoutExercise = findViewById(R.id.LayoutExercise);
        btnLayoutExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(
                        MainActivity.this,
                        LayoutExercise.class
                );
                startActivity(intent1);
            }
        });

        btnButtonExercise = findViewById(R.id.ButtonExercise);
        btnButtonExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(
                        MainActivity.this,
                        ButtonExercise.class
                );
                startActivity(intent2);
            }
        });

        btnCalculatorExercise = findViewById(R.id.CalculatorExercise);
        btnCalculatorExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(
                        MainActivity.this,
                        CalculatorExercise.class
                );
                startActivity(intent3);
            }
        });
    }
}