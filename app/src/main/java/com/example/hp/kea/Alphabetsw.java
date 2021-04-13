package com.example.hp.kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Alphabetsw extends AppCompatActivity {
    ImageButton button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabetsw);

        button1 = (ImageButton) findViewById(R.id.Wpreviousbutton);
        button2 = (ImageButton) findViewById(R.id.Whomebutton);
        button3 = (ImageButton) findViewById(R.id.Wnextbutton);
        button4 = (ImageButton) findViewById(R.id.Wvideobutton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetsv();
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
                openAlphabetsx();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVideo();
            }
        });

    }

    public void openAlphabetsv() {
        Intent intent = new Intent(this, Alphabetsv.class);
        startActivity(intent);
    }
    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void openAlphabetsx() {
        Intent intent = new Intent(this, Alphabetsx.class);
        startActivity(intent);
    }
    public void openVideo() {
        Intent intent = new Intent(this, Videow.class);
        startActivity(intent);
    }
}
