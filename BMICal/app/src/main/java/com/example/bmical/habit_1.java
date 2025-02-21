package com.example.bmical;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class habit_1 extends AppCompatActivity {
    Button add_habit;
    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_habit1);

        add_habit = findViewById(R.id.add_habit_fab);

        TextView welcomeText = findViewById(R.id.welcome_text);
        ProgressBar progressRing = findViewById(R.id.progress_ring);

        add_habit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(habit_1.this, add_edit_habit.class);
                startActivity(intent);
            }
        });


    }
}
