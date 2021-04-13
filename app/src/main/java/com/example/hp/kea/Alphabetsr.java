package com.example.hp.kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Alphabetsr extends AppCompatActivity {
    ImageButton button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabetsr);

        button1 = (ImageButton) findViewById(R.id.Rpreviousbutton);
        button2 = (ImageButton) findViewById(R.id.Rhomebutton);
        button3 = (ImageButton) findViewById(R.id.Rnextbutton);
        button4 = (ImageButton) findViewById(R.id.Rvideobutton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetsq();
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
                openAlphabetss();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVideo();
            }
        });

    }

    public void openAlphabetsq() {
        Intent intent = new Intent(this, Alphabetsq.class);
        startActivity(intent);
    }
    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void openAlphabetss() {
        Intent intent = new Intent(this, Alphabetss.class);
        startActivity(intent);
    }
    public void openVideo() {
        Intent intent = new Intent(this, Videor.class);
        startActivity(intent);
    }
}
