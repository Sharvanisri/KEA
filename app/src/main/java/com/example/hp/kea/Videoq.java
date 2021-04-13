package com.example.hp.kea;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.VideoView;

public class Videoq extends AppCompatActivity {
    ImageButton button1,button2;
    VideoView videov;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videoq);

        button1=(ImageButton) findViewById(R.id.Vqback);
        button2=(ImageButton) findViewById(R.id.Vqplay);

        videov= (VideoView) findViewById(R.id.Vq);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPrevious();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String videopath="android.resource://com.example.hp.kea/"+R.raw.vq;
                Uri uri= Uri.parse(videopath);
                videov.setVideoURI(uri);
                videov.requestFocus();
                videov.start();
            }
        });
    }
    public void openPrevious() {
        Intent intent = new Intent(this, Alphabetsq.class);
        startActivity(intent);
    }
}

