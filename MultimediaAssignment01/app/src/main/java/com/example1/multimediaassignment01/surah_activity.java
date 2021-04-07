package com.example1.multimediaassignment01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class surah_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah_activity);
    }

    public void playAudioNas(View view) {
        Intent intent = new Intent(this,SurahAnNas.class);
        startActivity(intent);
    }

    public void PlayAudioFalaq(View view) {
        Intent intent = new Intent(this,ActivityFalak.class);
        startActivity(intent);
    }

    public void playAudioIkhlas(View view) {
        Intent intent = new Intent(this,ActivityIkhlas.class);
        startActivity(intent);
    }

    public void PlayAudiolahab(View view) {
        Intent intent = new Intent(this,ActivityLahab.class);
        startActivity(intent);
    }

    public void PlayAudioNasr(View view) {
        Intent intent = new Intent(this,ActivityNasr.class);
        startActivity(intent);
    }
}