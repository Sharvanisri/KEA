package com.example.hp.kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Alphabetsg extends AppCompatActivity {
    ImageButton button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabetsg);
        button1 = (ImageButton) findViewById(R.id.Gpreviousbutton);
        button2 = (ImageButton) findViewById(R.id.Ghomebutton);
        button3 = (ImageButton) findViewById(R.id.Gnextbutton);
        button4 = (ImageButton) findViewById(R.id.Gvideobutton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetsf();
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
                openAlphabetsh();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVideo();
            }
        });

    }

    public void openAlphabetsf() {
        Intent intent = new Intent(this, Alphabetsf.class);
        startActivity(intent);
    }
    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void openAlphabetsh() {
        Intent intent = new Intent(this, Alphabetsh.class);
        startActivity(intent);
    }
    public void openVideo() {
        Intent intent = new Intent(this, Videog.class);
        startActivity(intent);
    }
}
