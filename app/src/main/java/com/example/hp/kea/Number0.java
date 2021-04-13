package com.example.hp.kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Number0 extends AppCompatActivity {
    ImageButton button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number0);
        button1 = (ImageButton) findViewById(R.id.number0previousbutton);
        button2 = (ImageButton) findViewById(R.id.number0homebutton);
        button3 = (ImageButton) findViewById(R.id.number0nextbutton);
        button4 = (ImageButton) findViewById(R.id.number0videobutton);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome();
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
                openNext();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVideo();
            }
        });

    }

    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void openNext() {
        Intent intent = new Intent(this, Number1.class);
        startActivity(intent);
    }
    public void openVideo() {
        Intent intent = new Intent(this, Video0.class);
        startActivity(intent);
    }
}
