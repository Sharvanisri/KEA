package com.example.hp.kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Alphabetsd extends AppCompatActivity {
    ImageButton button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabetsd);
        button1 = (ImageButton) findViewById(R.id.Dpreviousbutton);
        button2 = (ImageButton) findViewById(R.id.Dhomebutton);
        button3 = (ImageButton) findViewById(R.id.Dnextbutton);
        button4 = (ImageButton) findViewById(R.id.Dvideobutton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetsc();
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
                openAlphabetse();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVideo();
            }
        });

    }

    public void openAlphabetsc() {
        Intent intent = new Intent(this, Alphabetsc.class);
        startActivity(intent);
    }
    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void openAlphabetse() {
        Intent intent = new Intent(this, Alphabetse.class);
        startActivity(intent);
    }
    public void openVideo() {
        Intent intent = new Intent(this, Videod.class);
        startActivity(intent);
    }
}
