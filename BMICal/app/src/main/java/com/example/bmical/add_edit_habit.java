package com.example.bmical;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class add_edit_habit extends AppCompatActivity {
    private EditText habitName;
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private Switch reminderToggle;
    private TimePicker reminderTimePicker;
    private Spinner frequencySpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_edit_habit);
        habitName = findViewById(R.id.habit_name);
        reminderToggle = findViewById(R.id.reminder_toggle);
        reminderTimePicker = findViewById(R.id.reminder_time_picker);
        frequencySpinner = findViewById(R.id.frequency_spinner);
        Button saveButton = findViewById(R.id.save_button);

        // Show/Hide TimePicker on Reminder Toggle
        reminderToggle.setOnCheckedChangeListener((buttonView, isChecked) -> {
            reminderTimePicker.setVisibility(isChecked ? View.VISIBLE : View.GONE);
        });

        saveButton.setOnClickListener(v -> {
            String name = habitName.getText().toString();
            String frequency = frequencySpinner.getSelectedItem().toString();
            boolean reminderSet = reminderToggle.isChecked();

            if (name.isEmpty()) {
                Toast.makeText(this, "Please enter a habit name", Toast.LENGTH_SHORT).show();
            } else {
                // Save Habit Logic Here
                Toast.makeText(this, "Habit Saved!", Toast.LENGTH_SHORT).show();
                finish(); // Close screen
            }
        });
    }
}