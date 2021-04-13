package com.example.hp.kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Alphabetso extends AppCompatActivity {
    ImageButton button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabetso);


        button1 = (ImageButton) findViewById(R.id.Opreviousbutton);
        button2 = (ImageButton) findViewById(R.id.Ohomebutton);
        button3 = (ImageButton) findViewById(R.id.Onextbutton);
        button4 = (ImageButton) findViewById(R.id.Ovideobutton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetsn();
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
                openAlphabetsp();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVideo();
            }
        });

    }

    public void openAlphabetsn() {
        Intent intent = new Intent(this, Alphabetsn.class);
        startActivity(intent);
    }
    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void openAlphabetsp() {
        Intent intent = new Intent(this, Alphabetsp.class);
        startActivity(intent);
    }
    public void openVideo() {
        Intent intent = new Intent(this, Videoo.class);
        startActivity(intent);
    }
}