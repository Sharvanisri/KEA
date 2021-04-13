package com.example.hp.kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Alphabetsp extends AppCompatActivity {
    ImageButton button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabetsp);

        button1 = (ImageButton) findViewById(R.id.Ppreviousbutton);
        button2 = (ImageButton) findViewById(R.id.Phomebutton);
        button3 = (ImageButton) findViewById(R.id.Pnextbutton);
        button4 = (ImageButton) findViewById(R.id.Pvideobutton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetso();
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
                openAlphabetsq();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVideo();
            }
        });

    }

    public void openAlphabetso() {
        Intent intent = new Intent(this, Alphabetso.class);
        startActivity(intent);
    }
    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void openAlphabetsq() {
        Intent intent = new Intent(this, Alphabetsq.class);
        startActivity(intent);
    }
    public void openVideo() {
        Intent intent = new Intent(this, Videop.class);
        startActivity(intent);
    }
}

