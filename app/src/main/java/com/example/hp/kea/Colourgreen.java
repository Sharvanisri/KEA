package com.example.hp.kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Colourgreen extends AppCompatActivity {
    ImageButton button1,button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colourgreen);

        button1 = (ImageButton) findViewById(R.id.Greenpreviousbutton);
        button2 = (ImageButton) findViewById(R.id.Greenhomebutton);
        button3 = (ImageButton) findViewById(R.id.Greennextbutton);

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

    }

    public void openPrevious() {
        Intent intent = new Intent(this, Colourbrown.class);
        startActivity(intent);
    }
    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void openNext() {
        Intent intent = new Intent(this, Colourorange.class);
        startActivity(intent);
    }
}