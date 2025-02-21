package com.example.bmical;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class HealthDashboardActivity extends AppCompatActivity {

    LinearLayout  back;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.health_dashboard);

        back = findViewById(R.id.dash);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HealthDashboardActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
