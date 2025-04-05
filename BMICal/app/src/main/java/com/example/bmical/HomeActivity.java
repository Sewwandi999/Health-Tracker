package com.example.bmical;


import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
        LinearLayout bmi;
        Button habit;
        Button diet;
        Button activity;
        ImageView menuv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.home_main);

        habit = findViewById(R.id.habitButton);
        bmi = findViewById(R.id.bmi_btn);
        diet = findViewById(R.id.dietPlanButton);
        menuv = findViewById(R.id.menu);
        activity = findViewById(R.id.btn_activity);


        bmi.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, BmiMainActivity.class);
            startActivity(intent);
        });

        activity.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, GoalsActivity.class);
            startActivity(intent);
        });

        habit.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, habit_1.class);
            startActivity(intent);
        });

        diet.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, activity_dietPlan1.class);
            startActivity(intent);
        });

        menuv.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, HealthDashboardActivity.class);
            startActivity(intent);
        });
    }
}
