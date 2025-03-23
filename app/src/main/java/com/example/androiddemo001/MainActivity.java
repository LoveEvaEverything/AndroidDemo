package com.example.androiddemo001;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private boolean redBeltState = false;
    private boolean greenBeltState = false;
    private boolean blueBeltState = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButton();// readability.
        initBelts();
    }

    private void initBelts() {
        TextView redBelt = findViewById(R.id.belt_01_id);
        TextView greenBelt = findViewById(R.id.belt_02_id);
        TextView blueBelt = findViewById(R.id.belt_03_id);

        redBelt.setOnClickListener(v -> {
            if (redBeltState) {
                redBelt.setBackgroundColor(getColor(R.color.red));
            } else {
                redBelt.setBackgroundColor(Color.TRANSPARENT);
            }
            redBeltState = !redBeltState;
        });

        greenBelt.setOnClickListener(v -> {
            if (greenBeltState) {
                greenBelt.setBackgroundColor(getColor(R.color.green));
            } else {
                greenBelt.setBackgroundColor(Color.TRANSPARENT);
            }
            greenBeltState = !greenBeltState;
        });

        blueBelt.setOnClickListener(v -> {
            if (blueBeltState) {
                blueBelt.setBackgroundColor(getColor(R.color.dark_blue));
            } else {
                blueBelt.setBackgroundColor(Color.TRANSPARENT);
            }
            blueBeltState = !blueBeltState;
        });
    }


    private void initButton() {
        Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        });
    }

}