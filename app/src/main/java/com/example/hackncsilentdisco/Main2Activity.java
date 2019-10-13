package com.example.hackncsilentdisco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptC;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.hackncsilentdisco.ui.Scoreboard;

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

        String language = getIntent().getStringExtra("language");

        String numCorrectString = getIntent().getStringExtra("numCorrect");
        int numCorrectInt = Integer.parseInt(numCorrectString);
        String numAttemptedString = getIntent().getStringExtra("numAttempted");
        int numAttemptedInt = Integer.parseInt(numAttemptedString);


        if (language.equals("French")){
            Scoreboard.fCorrect += numCorrectInt;
            Scoreboard.fAttempts += numAttemptedInt;
        }else{
            Scoreboard.sCorrect += numCorrectInt;
            Scoreboard.sAttempts += numAttemptedInt;
        }

        frenchAttempts.setText("French Attempts: " + Scoreboard.fAttempts);
        frenchScore.setText("French Average Score: " + Scoreboard.getFrenchAverage());
        spanishAttempts.setText("Spanish Attempts: " + Scoreboard.sAttempts);
        spanishScore.setText("Spanish Average Score: " + Scoreboard.getSpanishAverage());

        playAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(getBaseContext(), Main0Activity.class);
                startActivity(myIntent);
            }
        });
    }
}
