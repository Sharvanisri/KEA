package com.example.hp.kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Shapesoval extends AppCompatActivity {
    ImageButton button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapesoval);

        button1 = (ImageButton) findViewById(R.id.Ovalpreviousbutton);
        button2 = (ImageButton) findViewById(R.id.Ovalhomebutton);
        button3 = (ImageButton) findViewById(R.id.Ovalnextbutton);
        button4 = (ImageButton) findViewById(R.id.Ovalvideobutton);

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
        Intent intent = new Intent(this, Shapescircle.class);
        startActivity(intent);
    }
    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
    public void openNext() {
        Intent intent = new Intent(this, Shapesrectangle.class);
        startActivity(intent);
    }
    public void openVideo() {
        Intent intent = new Intent(this, Videooval.class);
        startActivity(intent);
    }
}
