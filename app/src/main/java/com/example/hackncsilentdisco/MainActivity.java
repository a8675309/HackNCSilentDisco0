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

public class MainActivity extends AppCompatActivity {
int correct =0;
int attempted = 0;
String word ="the";
String translation = "el";

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    TextView textView;

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

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        textView = (TextView) findViewById(R.id.textView1);

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

    }



    public void generateNewQuestion() {
        //word = generateword()
        //translation = generatetranslation(word)
        textView.setText(word);
        //use math.random to determine which button has correct answer next
        //set other three to random incorrect translations

        /*button1.setText();
        button1.setText();
        button1.setText();
        */
   }

    public void clicked(Button button) {
        if (button.getText().equals(translation))
        {
            ++correct;
        }
        ++attempted;
        generateNewQuestion();
    }

}

