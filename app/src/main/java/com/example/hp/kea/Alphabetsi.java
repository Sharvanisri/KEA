package com.example.hp.kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Alphabetsi extends AppCompatActivity {
    ImageButton button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabetsi);

        button1 = (ImageButton) findViewById(R.id.Ipreviousbutton);
        button2 = (ImageButton) findViewById(R.id.Ihomebutton);
        button3 = (ImageButton) findViewById(R.id.Inextbutton);
        button4 = (ImageButton) findViewById(R.id.Ivideobutton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetsh();
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
                openAlphabetsj();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVideo();
            }
        });

    }

    public void openAlphabetsh() {
        Intent intent = new Intent(this, Alphabetsh.class);
        startActivity(intent);
    }
    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void openAlphabetsj() {
        Intent intent = new Intent(this, Alphabetsj.class);
        startActivity(intent);
    }
    public void openVideo() {
        Intent intent = new Intent(this, Videoi.class);
        startActivity(intent);
    }
}
