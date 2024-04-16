package com.bzu1211503.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class q1Activity extends AppCompatActivity {

    private RadioButton answerRadioButton1;
    private RadioButton answerRadioButton2;
    private ImageView correctAnswerTextView;
    private Button nextButton;

    private boolean isAnswer1Selected = false; // Default value for selected answer

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);

        // Initialize views
        TextView questionTextView = findViewById(R.id.questionTextView);
        ImageView dialogImageView = findViewById(R.id.dialogImageView);
        answerRadioButton1 = findViewById(R.id.answerRadioButton1);
        answerRadioButton2 = findViewById(R.id.answerRadioButton2);
        Button submitButton = findViewById(R.id.submitButton);
        correctAnswerTextView = findViewById(R.id.correctAnswerTextView);
        nextButton = findViewById(R.id.nextButton);

        // Set up onClickListener for submitButton
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check the selected answer
                checkAnswer();
            }
        });

        // Set up onClickListener for nextButton
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Save the selected answer and open next activity
                saveSelectedAnswer();
                openNextActivity();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Restore the selected answer
        restoreSelectedAnswer();
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Save the selected answer
        saveSelectedAnswer();
    }

    private void checkAnswer() {
        // Get the selected answer
        isAnswer1Selected = answerRadioButton1.isChecked();

        // Check if the correct answer is selected
        boolean isCorrect = isAnswer1Selected;

        // Show the correct answer image
        if (isCorrect) {
            correctAnswerTextView.setVisibility(View.VISIBLE);
            correctAnswerTextView.setImageResource(R.drawable.correct);
        } else {
            correctAnswerTextView.setVisibility(View.VISIBLE);
            correctAnswerTextView.setImageResource(R.drawable.wrong);
        }

        // Show the nextButton
        nextButton.setVisibility(View.VISIBLE);
    }

    private void saveSelectedAnswer() {
        // Save the selected answer
        isAnswer1Selected = answerRadioButton1.isChecked();
    }

    private void restoreSelectedAnswer() {
        // Restore the selected answer
        answerRadioButton1.setChecked(isAnswer1Selected);
        answerRadioButton2.setChecked(!isAnswer1Selected);
    }

    private void openNextActivity() {
        // Start the next activity
        Intent intent = new Intent(this, q2Activity.class);
        startActivity(intent);
    }
}
