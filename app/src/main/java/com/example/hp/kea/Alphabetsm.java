package com.example.hp.kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Alphabetsm extends AppCompatActivity {

    ImageButton button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabetsm);

        button1 = (ImageButton) findViewById(R.id.Mpreviousbutton);
        button2 = (ImageButton) findViewById(R.id.Mhomebutton);
        button3 = (ImageButton) findViewById(R.id.Mnextbutton);
        button4 = (ImageButton) findViewById(R.id.Mvideobutton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetsl();
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
                openAlphabetsn();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVideo();
            }
        });

    }

    public void openAlphabetsl() {
        Intent intent = new Intent(this, Alphabetsl.class);
        startActivity(intent);
    }
    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void openAlphabetsn() {
        Intent intent = new Intent(this, Alphabetsn.class);
        startActivity(intent);
    }
    public void openVideo() {
        Intent intent = new Intent(this, Videom.class);
        startActivity(intent);
    }
}