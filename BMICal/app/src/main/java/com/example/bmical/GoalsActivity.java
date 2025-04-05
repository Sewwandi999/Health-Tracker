package com.example.bmical;

import android.annotation.SuppressLint;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

public class GoalsActivity extends AppCompatActivity {


    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals);


    }
}
