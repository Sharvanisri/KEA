package com.example.hp.kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Alphabetsk extends AppCompatActivity {
    ImageButton button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabetsk);

        button1 = (ImageButton) findViewById(R.id.Kpreviousbutton);
        button2 = (ImageButton) findViewById(R.id.Khomebutton);
        button3 = (ImageButton) findViewById(R.id.Knextbutton);
        button4 = (ImageButton) findViewById(R.id.Kvideobutton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetsj();
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
                openAlphabetsl();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVideo();
            }
        });

    }

    public void openAlphabetsj() {
        Intent intent = new Intent(this, Alphabetsj.class);
        startActivity(intent);
    }
    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void openAlphabetsl() {
        Intent intent = new Intent(this, Alphabetsl.class);
        startActivity(intent);
    }
    public void openVideo() {
        Intent intent = new Intent(this, Videok.class);
        startActivity(intent);
    }
}
