package com.example.hp.kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Alphabetsf extends AppCompatActivity {
    ImageButton button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabetsf);
        button1 = (ImageButton) findViewById(R.id.Fpreviousbutton);
        button2 = (ImageButton) findViewById(R.id.Fhomebutton);
        button3 = (ImageButton) findViewById(R.id.Fnextbutton);
        button4 = (ImageButton) findViewById(R.id.Fvideobutton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetse();
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
                openAlphabetsg();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVideo();
            }
        });

    }

    public void openAlphabetse() {
        Intent intent = new Intent(this, Alphabetse.class);
        startActivity(intent);
    }
    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void openAlphabetsg() {
        Intent intent = new Intent(this, Alphabetsg.class);
        startActivity(intent);
    }
    public void openVideo() {
        Intent intent = new Intent(this, Videof.class);
        startActivity(intent);
    }
}
