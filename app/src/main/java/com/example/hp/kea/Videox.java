package com.example.hp.kea;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.VideoView;

public class Videox extends AppCompatActivity {
    ImageButton button1,button2;
    VideoView videov;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videox);

        button1=(ImageButton) findViewById(R.id.Vxback);
        button2=(ImageButton) findViewById(R.id.Vxplay);

        videov= (VideoView) findViewById(R.id.Vx);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPrevious();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String videopath="android.resource://com.example.hp.kea/"+R.raw.vx;
                Uri uri= Uri.parse(videopath);
                videov.setVideoURI(uri);
                videov.requestFocus();
                videov.start();
            }
        });
    }
    public void openPrevious() {
        Intent intent = new Intent(this, Alphabetsx.class);
        startActivity(intent);
    }
}

