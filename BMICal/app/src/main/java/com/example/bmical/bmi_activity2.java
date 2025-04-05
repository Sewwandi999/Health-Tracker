package com.example.bmical;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class bmi_activity2 extends AppCompatActivity {

    ImageView listimg;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bmi2);
        listimg = findViewById(R.id.list);



        listimg.setOnClickListener(v -> {
            Intent intent = new Intent(bmi_activity2.this, activity_bmi3.class);
            startActivity(intent);
        });
    }
}