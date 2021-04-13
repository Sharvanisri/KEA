package com.example.hp.kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Alphabetsl extends AppCompatActivity {
    ImageButton button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabetsl);

        button1 = (ImageButton) findViewById(R.id.Lpreviousbutton);
        button2 = (ImageButton) findViewById(R.id.Lhomebutton);
        button3 = (ImageButton) findViewById(R.id.Lnextbutton);
        button4 = (ImageButton) findViewById(R.id.Lvideobutton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlphabetsk();
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
                openAlphabetsm();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVideo();
            }
        });

    }

    public void openAlphabetsk() {
        Intent intent = new Intent(this, Alphabetsk.class);
        startActivity(intent);
    }
    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void openAlphabetsm() {
        Intent intent = new Intent(this, Alphabetsm.class);
        startActivity(intent);
    }
    public void openVideo() {
        Intent intent = new Intent(this, Videol.class);
        startActivity(intent);
    }
}
