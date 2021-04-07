package com.example1.multimediaassignment01;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class ActivityNasr extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nasr);
        mp = MediaPlayer.create(this,R.raw.nasr);
    }
    public void PauseAudio(View view) {
        mp.pause();
    }

    public void PlayAudio(View view) {
        mp.start();
    }

    public void stop(View view) {
        mp.stop();
    }
}