package com.example.hackncsilentdisco;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
int correct =0;
int attempted = 0;
boolean isSpanish= true;
Word dictionary;


String word = "the"; //dictionary.getEnglishWord();
String translation = "el/la"; //dictionary.getSpanishWord();

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    TextView textView;
    TextView score;
    TextView attempts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);

        String language = getIntent().getStringExtra("language");
        if (language.equals("French")){
            isSpanish = false;
        }

        if (isSpanish== true) {
            dictionary = new Word(LanguageHashMap.makeSpanishDictionary());
        }
        else {
            dictionary = new Word(LanguageHashMap.makeFrenchDictionary());
        }

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R. id.button5);
        button6 = (Button) findViewById(R. id.button6);
        textView = (TextView) findViewById(R.id.textView1);
        score = (TextView) findViewById(R.id.textView2);
        attempts = (TextView) findViewById(R.id.textView3);

        score.setText("Score: "+correct);
        attempts.setText("Attempted: "+ attempted);

        updateScreen();


        button1.setOnClickListener(new OnClickListener() {


            @Override
            public void onClick(View view) {
               clicked(button1);
            }

        });

        button2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                // Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
                clicked(button2);
            }

        });

        button3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                // Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
                clicked(button3);
            }

        });

        button4.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                // Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
                clicked(button4);
            }

        });

        button5.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view) {
                correct = 0;
                attempted = 0;
                updateScreen();
                dictionary = new Word(LanguageHashMap.makeDictionary());

            }
        });

        button6.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {

                  Intent myIntent = new Intent(getBaseContext(), Main2Activity.class);

                  if (isSpanish)
                myIntent.putExtra("language", "Spanish");
                  else
                      myIntent.putExtra("language", "French");

                myIntent.putExtra("numCorrect", ""+correct);
                myIntent.putExtra("numAttempted", ""+attempted);


                    startActivity(myIntent);

            }

        });


    }



    public void updateScreen() {
        dictionary.recalculate();
        word = dictionary.getEnglishWord();
        translation = dictionary.getSpanishWord();
        textView.setText(word);
        score.setText("Score: " + correct);
        attempts.setText("Attempted: " + attempted);
        button6.setVisibility(View.GONE);
        int randomInteger = (int)(Math.random() * 4) + 1;
        switch (randomInteger){
            case 1:
                button1.setText(dictionary.getSpanishWord());
                dictionary.recalculate();
                button2.setText(dictionary.getSpanishWord());
                dictionary.recalculate();
                button3.setText(dictionary.getSpanishWord());
                dictionary.recalculate();
                button4.setText(dictionary.getSpanishWord());
                break;
            case 2:
                button2.setText(dictionary.getSpanishWord());
                dictionary.recalculate();
                button1.setText(dictionary.getSpanishWord());
                dictionary.recalculate();
                button3.setText(dictionary.getSpanishWord());
                dictionary.recalculate();
                button4.setText(dictionary.getSpanishWord());
                break;
            case 3:
                button3.setText(dictionary.getSpanishWord());
                dictionary.recalculate();
                button1.setText(dictionary.getSpanishWord());
                dictionary.recalculate();
                button2.setText(dictionary.getSpanishWord());
                dictionary.recalculate();
                button4.setText(dictionary.getSpanishWord());
                break;
            case 4:
                button4.setText(dictionary.getSpanishWord());
                dictionary.recalculate();
                button2.setText(dictionary.getSpanishWord());
                dictionary.recalculate();
                button3.setText(dictionary.getSpanishWord());
                dictionary.recalculate();
                button1.setText(dictionary.getSpanishWord());
                break;

        }


        //use math.random to determine which button has correct answer next
        //set other three to random incorrect translations
        /*button1.setText();
        button1.setText();
        button1.setText();
        */
   }

    public void clicked(Button button) {
        if (attempted<10){
            if(button.getText().equals(translation)){
                ++correct;
            }
            ++attempted;

            updateScreen();
        }
        else {
            button6.setVisibility(View.VISIBLE);
        }

    }

}

