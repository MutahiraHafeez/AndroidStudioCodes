package com.example1.multimediaassignment01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);
    }

    public void surahPage(View view) {
        Button button = findViewById(R.id.startBn);
        Intent intent= new Intent(MainActivity.this,surah_activity.class);
        startActivity(intent);
    }
}