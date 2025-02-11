package com.example.bmical;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log);  // Ensure activity_log.xml exists

        // Navigate to HomeActivity upon successful login
        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Assuming login is successful, navigate to HomeActivity
                Intent intent = new Intent(LogActivity.this, home.class);
                startActivity(intent);
                finish();  // Close login activity
            }
        });

        // Navigate to SignupActivity when "Not yet registered? Signup Now" is clicked
        TextView signupText = findViewById(R.id.signuptext);
        signupText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LogActivity.this, SignupActivity.class);
                startActivity(intent);
                finish();  // Close login activity
            }
        });
    }
}
