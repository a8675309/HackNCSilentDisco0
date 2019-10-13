package com.example.hackncsilentdisco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    Button playAgain;
    TextView frenchScore;
    TextView frenchAttempts;
    TextView spanishScore;
    TextView spanishAttempts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
         playAgain = (Button) findViewById(R.id.playAgain);
        frenchAttempts = (TextView) findViewById(R.id.frenchAttempts);
        frenchScore = (TextView) findViewById(R.id.frenchScore);
        spanishAttempts = (TextView) findViewById(R.id.spanishAttempts);
        spanishScore = (TextView) findViewById(R.id.spanishScore);

        frenchAttempts.setText("French Attempts: " + 0);
        frenchScore.setText("French Score: " + 0);
        spanishAttempts.setText("Spanish Attempts: " + 0);
        spanishScore.setText("Spanish Score: " + 0);

        playAgain.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(myIntent);

            }

        });
    }
}
