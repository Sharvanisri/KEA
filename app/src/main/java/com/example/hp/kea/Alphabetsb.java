package com.example.hp.kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Alphabetsb extends AppCompatActivity {
    ImageButton button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabetsb);

        button1 = (ImageButton) findViewById(R.id.Bpreviousbutton);
        button2 = (ImageButton) findViewById(R.id.Bhomebutton);
        button3 = (ImageButton) findViewById(R.id.Bnextbutton);
        button4 = (ImageButton) findViewById(R.id.Bvideobutton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetsa();
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
                openAlphabetsc();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVideo();
            }
        });

    }

    public void openAlphabetsa() {
        Intent intent = new Intent(this, Alphabetsa.class);
        startActivity(intent);
    }
    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void openAlphabetsc() {
        Intent intent = new Intent(this, Alphabetsc.class);
        startActivity(intent);
    }
    public void openVideo() {
        Intent intent = new Intent(this, Videob.class);
        startActivity(intent);
    }
}

