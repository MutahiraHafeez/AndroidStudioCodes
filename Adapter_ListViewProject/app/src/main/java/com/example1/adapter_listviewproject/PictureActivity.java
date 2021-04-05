package com.example1.adapter_listviewproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PictureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);
        TextView textView = findViewById(R.id.textView);
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("FruitName"));

    }
}