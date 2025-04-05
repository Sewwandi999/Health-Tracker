package com.example.bmical;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);  // Ensure activity_signup.xml exists

        // Navigate back to LogActivity when "Sign In" text is clicked
        TextView signInText = findViewById(R.id.tvSignIn);
        signInText.setOnClickListener(v -> {
            // Navigate to the Login Activity (LogActivity)
            Intent intent = new Intent(SignupActivity.this, LogActivity.class);
            startActivity(intent);
            finish();  // Close current activity
        });

        // Navigate to Home Activity or perform any other sign-up logic when "Sign Up" button is clicked
        Button signUpButton = findViewById(R.id.btnSignUp);
        signUpButton.setOnClickListener(v -> {
            // Assuming signup is successful, go to HomeActivity
            Intent intent = new Intent(SignupActivity.this, HomeActivity.class);
            startActivity(intent);
            finish();  // Close current activity
        });
    }
}
