package com.example.hp.kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Alphabetsh extends AppCompatActivity {
    ImageButton button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabetsh);
        button1 = (ImageButton) findViewById(R.id.Hpreviousbutton);
        button2 = (ImageButton) findViewById(R.id.Hhomebutton);
        button3 = (ImageButton) findViewById(R.id.Hnextbutton);
        button4 = (ImageButton) findViewById(R.id.Hvideobutton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetsg();
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
                openAlphabetsi();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVideo();
            }
        });

    }

    public void openAlphabetsg() {
        Intent intent = new Intent(this, Alphabetsg.class);
        startActivity(intent);
    }
    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void openAlphabetsi() {
        Intent intent = new Intent(this, Alphabetsi.class);
        startActivity(intent);
    }
    public void openVideo() {
        Intent intent = new Intent(this, Videoh.class);
        startActivity(intent);
    }
}
