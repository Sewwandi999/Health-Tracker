package com.example.bmical;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LogActivity extends AppCompatActivity {
    Button log;
    TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log);  // Ensure activity_log.xml exists

        // Navigate to HomeActivity upon successful login
        log = findViewById(R.id.loginButton);
        signup = findViewById(R.id.signuptext);

        log.setOnClickListener(v -> {
            Intent intent = new Intent(LogActivity.this, HomeActivity.class);
            startActivity(intent);
        });

        signup.setOnClickListener(v -> {
            Intent intent = new Intent(LogActivity.this, SignupActivity.class);
            startActivity(intent);
        });
    }
}
