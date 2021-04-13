package com.example.hp.kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Number5 extends AppCompatActivity {
    ImageButton button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number5);

        button1 = (ImageButton) findViewById(R.id.number5previousbutton);
        button2 = (ImageButton) findViewById(R.id.number5homebutton);
        button3 = (ImageButton) findViewById(R.id.number5nextbutton);
        button4 = (ImageButton) findViewById(R.id.number5videobutton);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPrevious();
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

    public void openPrevious() {
        Intent intent = new Intent(this, Number4.class);
        startActivity(intent);
    }
    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void openNext() {
        Intent intent = new Intent(this, Number6.class);
        startActivity(intent);
    }
    public void openVideo() {
        Intent intent = new Intent(this, Video5.class);
        startActivity(intent);
    }
}

