package com.example.bmical;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class habit_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_habit1);

        TextView welcomeText = findViewById(R.id.welcome_text);
        ProgressBar progressRing = findViewById(R.id.progress_ring);
        Button addHabitFab = findViewById(R.id.add_habit_fab);


        addHabitFab.setOnClickListener(v -> {
            // Open Add Habit screen

        });
    }
}
