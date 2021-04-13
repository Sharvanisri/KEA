package com.example.hp.kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Alphabetsq extends AppCompatActivity {
    ImageButton button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabetsq);

        button1 = (ImageButton) findViewById(R.id.Qpreviousbutton);
        button2 = (ImageButton) findViewById(R.id.Qhomebutton);
        button3 = (ImageButton) findViewById(R.id.Qnextbutton);
        button4 = (ImageButton) findViewById(R.id.Qvideobutton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetsp();
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
                openAlphabetsr();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVideo();
            }
        });

    }

    public void openAlphabetsp() {
        Intent intent = new Intent(this, Alphabetsp.class);
        startActivity(intent);
    }
    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void openAlphabetsr() {
        Intent intent = new Intent(this, Alphabetsr.class);
        startActivity(intent);
    }
    public void openVideo() {
        Intent intent = new Intent(this, Videoq.class);
        startActivity(intent);
    }
}
