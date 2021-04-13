package com.example.hp.kea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dayssunday extends AppCompatActivity {
    ImageButton button1,button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dayssunday);
        button1 = (ImageButton) findViewById(R.id.Sundaypreviousbutton);
        button2 = (ImageButton) findViewById(R.id.Sundayhomebutton);
        button3 = (ImageButton) findViewById(R.id.Sundaynextbutton);

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
                openHome();
            }
        });

    }

    public void openPrevious() {
        Intent intent = new Intent(this, Dayssaturday.class);
        startActivity(intent);
    }
    public void openHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}
