package com.example.hp.kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Alphabetsy extends AppCompatActivity {
    ImageButton button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabetsy);

        button1 = (ImageButton) findViewById(R.id.Ypreviousbutton);
        button2 = (ImageButton) findViewById(R.id.Yhomebutton);
        button3 = (ImageButton) findViewById(R.id.Ynextbutton);
        button4 = (ImageButton) findViewById(R.id.Yvideobutton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetsx();
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
                openAlphabetsz();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVideo();
            }
        });

    }

    public void openAlphabetsx() {
        Intent intent = new Intent(this, Alphabetsx.class);
        startActivity(intent);
    }
    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void openAlphabetsz() {
        Intent intent = new Intent(this, Alphabetsz.class);
        startActivity(intent);
    }
    public void openVideo() {
        Intent intent = new Intent(this, Videoy.class);
        startActivity(intent);
    }
}
