package com.example.hp.kea;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;

public class Alphabetsa extends AppCompatActivity {
    private ImageButton button1, button2, button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabetsa);


        button1 = (ImageButton) findViewById(R.id.Apreviousbutton);
        button2 = (ImageButton) findViewById(R.id.Ahomebutton);
        button3 = (ImageButton) findViewById(R.id.Anextbutton);
        button4 = (ImageButton) findViewById(R.id.Avideobutton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome();
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
                openAlphabetsb();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVideo();
            }
        });

    }

    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void openAlphabetsb() {
        Intent intent = new Intent(this, Alphabetsb.class);
        startActivity(intent);
    }
    public void openVideo() {
        Intent intent = new Intent(this, Videoa.class);
        startActivity(intent);
    }
}
