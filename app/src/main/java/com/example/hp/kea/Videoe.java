package com.example.hp.kea;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.VideoView;

public class Videoe extends AppCompatActivity {
    ImageButton button1,button2;
    VideoView videov;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videoe);

        button1=(ImageButton) findViewById(R.id.Veback);
        button2=(ImageButton) findViewById(R.id.Veplay);

        videov= (VideoView) findViewById(R.id.Ve);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPrevious();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String videopath="android.resource://com.example.hp.kea/"+R.raw.ve;
                Uri uri= Uri.parse(videopath);
                videov.setVideoURI(uri);
                videov.requestFocus();
                videov.start();
            }
        });
    }
    public void openPrevious() {
        Intent intent = new Intent(this, Alphabetse.class);
        startActivity(intent);
    }
}

