package com.example.hackncsilentdisco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;
import android.widget.TextView;
public class Main0Activity extends AppCompatActivity {


    Button frenchButton;
    Button spanishButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);

        frenchButton = (Button)findViewById(R.id.frenchButton);
        spanishButton = (Button)findViewById(R.id.spanishButton);

        frenchButton.setOnClickListener(new OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(myIntent);
            }

        });
        spanishButton.setOnClickListener(new OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(myIntent);
            }

        });


    }
}
