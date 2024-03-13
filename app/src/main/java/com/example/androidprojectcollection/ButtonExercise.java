package com.example.androidprojectcollection;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class ButtonExercise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_exercise);

        Button closeButton = findViewById(R.id.closeButton);
        Button toastButton = findViewById(R.id.toastButton);
        Button changeBgButton = findViewById(R.id.changebgButton);
        Button changeBtnBgButton = findViewById(R.id.changebtnbgButton);
        Button disappearButton = findViewById(R.id.disappearButton);

        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentButtonClose = new Intent(ButtonExercise.this, ButtonCloseAdd.class);

                // Start the activity
                startActivity(intentButtonClose);
            }
        });

        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonExercise.this, "Bread is Toasted!", Toast.LENGTH_SHORT).show();
            }
        });

        changeBgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getWindow().getDecorView().setBackgroundColor(ContextCompat.getColor(ButtonExercise.this, android.R.color.holo_blue_light));
            }
        });

        changeBtnBgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeBtnBgButton.setBackgroundColor(ContextCompat.getColor(ButtonExercise.this, android.R.color.holo_orange_light));
            }
        });

        disappearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disappearButton.setVisibility(View.INVISIBLE);
            }
        });
    }
}