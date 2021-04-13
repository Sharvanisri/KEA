package com.example.hp.kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Daysmonday extends AppCompatActivity {
    ImageButton button1,button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daysmonday);

        button1 = (ImageButton) findViewById(R.id.Mondaypreviousbutton);
        button2 = (ImageButton) findViewById(R.id.Mondayhomebutton);
        button3 = (ImageButton) findViewById(R.id.Mondaynextbutton);

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

    }

    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void openNext() {
        Intent intent = new Intent(this, Daystuesday.class);
        startActivity(intent);
    }
}
