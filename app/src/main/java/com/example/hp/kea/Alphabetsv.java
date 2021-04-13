package com.example.hp.kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Alphabetsv extends AppCompatActivity {
    ImageButton button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabetsv);

        button1 = (ImageButton) findViewById(R.id.Vpreviousbutton);
        button2 = (ImageButton) findViewById(R.id.Vhomebutton);
        button3 = (ImageButton) findViewById(R.id.Vnextbutton);
        button4 = (ImageButton) findViewById(R.id.Vvideobutton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetsu();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetsw();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVideo();
            }
        });

    }

    public void openAlphabetsu() {
        Intent intent = new Intent(this, Alphabetsu.class);
        startActivity(intent);
    }
    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void openAlphabetsw() {
        Intent intent = new Intent(this, Alphabetsw.class);
        startActivity(intent);
    }
    public void openVideo() {
        Intent intent = new Intent(this, Videov.class);
        startActivity(intent);
    }
}
