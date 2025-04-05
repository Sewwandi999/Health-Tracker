package com.example.bmical;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class activity_dietPlan2 extends AppCompatActivity {
    ConstraintLayout uvBtn;
    ConstraintLayout ovBtn;
    ConstraintLayout hvBtn;
    ConstraintLayout planBack;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_diet_plan2);
        uvBtn = findViewById(R.id.uw_btn);
        ovBtn = findViewById(R.id.ow_btn);
        hvBtn = findViewById(R.id.hw_btn);
        planBack = findViewById(R.id.plan_viewBack);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        uvBtn.setOnClickListener(v -> {
            Intent intent = new Intent(activity_dietPlan2.this, under_weight.class);
            startActivity(intent);
        });
        ovBtn.setOnClickListener(v -> {
            Intent intent = new Intent(activity_dietPlan2.this, over_weight.class);
            startActivity(intent);
        });

        hvBtn.setOnClickListener(v -> {
            Intent intent = new Intent(activity_dietPlan2.this, healthy_weight.class);
            startActivity(intent);
        });

        planBack.setOnClickListener(v -> {
            Intent intent = new Intent(activity_dietPlan2.this, activity_dietPlan1.class);
            startActivity(intent);
        });

    }
}