package com.example.hp.kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Monthsjune extends AppCompatActivity {
    ImageButton button1,button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monthsjune);

        button1 = (ImageButton) findViewById(R.id.Junepreviousbutton);
        button2 = (ImageButton) findViewById(R.id.Junehomebutton);
        button3 = (ImageButton) findViewById(R.id.Junenextbutton);

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
        Intent intent = new Intent(this, Monthsmay.class);
        startActivity(intent);
    }
    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void openNext() {
        Intent intent = new Intent(this, Monthsjuly.class);
        startActivity(intent);
    }
}

