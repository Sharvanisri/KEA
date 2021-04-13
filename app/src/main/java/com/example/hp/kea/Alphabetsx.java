package com.example.hp.kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Alphabetsx extends AppCompatActivity {
    ImageButton button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabetsx);

        button1 = (ImageButton) findViewById(R.id.Xpreviousbutton);
        button2 = (ImageButton) findViewById(R.id.Xhomebutton);
        button3 = (ImageButton) findViewById(R.id.Xnextbutton);
        button4 = (ImageButton) findViewById(R.id.Xvideobutton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetsw();
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
                openAlphabetsy();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVideo();
            }
        });

    }

    public void openAlphabetsw() {
        Intent intent = new Intent(this, Alphabetsw.class);
        startActivity(intent);
    }
    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void openAlphabetsy() {
        Intent intent = new Intent(this, Alphabetsy.class);
        startActivity(intent);
    }
    public void openVideo() {
        Intent intent = new Intent(this, Videox.class);
        startActivity(intent);
    }
}
