package com.example.hp.kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {
    private ImageButton button1,button2,button3, button4, button5,button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        button1= (ImageButton) findViewById(R.id.Alphabets);
        button2= (ImageButton) findViewById(R.id.Numbers);
        button3= (ImageButton) findViewById(R.id.Shapes);
        button4= (ImageButton) findViewById(R.id.Colours);
        button5= (ImageButton) findViewById(R.id.Weekdays);
        button6= (ImageButton) findViewById(R.id.Months);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetsa();
            }


        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNumber0();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShapescircle();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColourblack();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDaysmonday();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMonthsjanuary();
            }
        });
    }
    public void openAlphabetsa() {
        Intent intent = new Intent(this, Alphabetsa.class);
        startActivity(intent);
    }
    public void openNumber0() {
        Intent intent = new Intent(this, Number0.class);
        startActivity(intent);
    }
    public void openShapescircle() {
        Intent intent = new Intent(this, Shapescircle.class);
        startActivity(intent);
    }
    public void openColourblack() {
        Intent intent = new Intent(this, Colourblack.class);
        startActivity(intent);
    }
    public void openDaysmonday() {
        Intent intent = new Intent(this, Daysmonday.class);
        startActivity(intent);
    }
    public void openMonthsjanuary() {
        Intent intent = new Intent(this, Monthsjanuary.class);
        startActivity(intent);
    }
}
