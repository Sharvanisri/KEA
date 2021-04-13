package com.example.hp.kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Alphabetsn extends AppCompatActivity {
    ImageButton button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabetsn);

        button1 = (ImageButton) findViewById(R.id.Npreviousbutton);
        button2 = (ImageButton) findViewById(R.id.Nhomebutton);
        button3 = (ImageButton) findViewById(R.id.Nnextbutton);
        button4 = (ImageButton) findViewById(R.id.Nvideobutton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetsm();
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
                openAlphabetso();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVideo();
            }
        });

    }

    public void openAlphabetsm() {
        Intent intent = new Intent(this, Alphabetsm.class);
        startActivity(intent);
    }
    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void openAlphabetso() {
        Intent intent = new Intent(this, Alphabetso.class);
        startActivity(intent);
    }
    public void openVideo() {
        Intent intent = new Intent(this, Videon.class);
        startActivity(intent);
    }
}
