package com.example.hp.kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Alphabetsc extends AppCompatActivity {
    ImageButton button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabetsc);

        button1 = (ImageButton) findViewById(R.id.Cpreviousbutton);
        button2 = (ImageButton) findViewById(R.id.Chomebutton);
        button3 = (ImageButton) findViewById(R.id.Cnextbutton);
        button4 = (ImageButton) findViewById(R.id.Cvideobutton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetsb();
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
                openAlphabetsd();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVideo();
            }
        });

    }

    public void openAlphabetsb() {
        Intent intent = new Intent(this, Alphabetsb.class);
        startActivity(intent);
    }
    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void openAlphabetsd() {
        Intent intent = new Intent(this, Alphabetsd.class);
        startActivity(intent);
    }
    public void openVideo() {
        Intent intent = new Intent(this, Videoc.class);
        startActivity(intent);
    }
}