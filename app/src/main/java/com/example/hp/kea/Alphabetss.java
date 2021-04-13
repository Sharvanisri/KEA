package com.example.hp.kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Alphabetss extends AppCompatActivity {
    ImageButton button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabetss);

        button1 = (ImageButton) findViewById(R.id.Spreviousbutton);
        button2 = (ImageButton) findViewById(R.id.Shomebutton);
        button3 = (ImageButton) findViewById(R.id.Snextbutton);
        button4 = (ImageButton) findViewById(R.id.Svideobutton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetsr();
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
                openAlphabetst();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVideo();
            }
        });

    }

    public void openAlphabetsr() {
        Intent intent = new Intent(this, Alphabetsr.class);
        startActivity(intent);
    }
    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void openAlphabetst() {
        Intent intent = new Intent(this, Alphabetst.class);
        startActivity(intent);
    }
    public void openVideo() {
        Intent intent = new Intent(this, Videos.class);
        startActivity(intent);
    }
}
