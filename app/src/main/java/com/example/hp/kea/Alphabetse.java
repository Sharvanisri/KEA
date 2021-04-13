package com.example.hp.kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Alphabetse extends AppCompatActivity {
    ImageButton button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabetse);
        button1 = (ImageButton) findViewById(R.id.Epreviousbutton);
        button2 = (ImageButton) findViewById(R.id.Ehomebutton);
        button3 = (ImageButton) findViewById(R.id.Enextbutton);
        button4 = (ImageButton) findViewById(R.id.Evideobutton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetsd();
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
                openAlphabetsf();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVideo();
            }
        });

    }

    public void openAlphabetsd() {
        Intent intent = new Intent(this, Alphabetsd.class);
        startActivity(intent);
    }
    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void openAlphabetsf() {
        Intent intent = new Intent(this, Alphabetsf.class);
        startActivity(intent);
    }
    public void openVideo() {
        Intent intent = new Intent(this, Videoe.class);
        startActivity(intent);
    }
}
