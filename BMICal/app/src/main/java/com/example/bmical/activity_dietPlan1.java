package com.example.bmical;


import android.content.Intent;
import android.os.Bundle;



import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;


public class activity_dietPlan1 extends AppCompatActivity {
    ConstraintLayout planView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_diet_plan1);
        planView = findViewById(R.id.plan_viewBtn);


        planView.setOnClickListener(v -> {
            Intent intent = new Intent(activity_dietPlan1.this, activity_dietPlan2.class);
            startActivity(intent);
        });


    }
}