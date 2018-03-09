package com.forasterisk.music;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        View contentView = findViewById(R.id.content_view);

        VideoView videoView = (VideoView) contentView.findViewById(R.id.video_view);
        videoView.setVideoURI(Uri.parse("https://fbcdn-video-m-a.akamaihd.net/hvideo-ak-xpa1/v/t42.1790-2/12055025_1645703552337817_1428112829_n.mp4?efg=eyJybHIiOjMwMCwicmxhIjo1MTIsInZlbmNvZGVfdGFnIjoicmVzXzQyNl9jcmZfMjNfbWFpbl8zLjBfc2QifQ%3D%3D&rl=300&vabr=141&oh=9cfc28ac7e064053f51482f38506211d&oe=560AD584&__gda__=1443551432_ca0c4fb58674ff5906462c2114423908"));
        videoView.start();
        //WebView webView = (WebView) contentView.findViewById(R.id.web_view);
        //webView.set
    }

}
