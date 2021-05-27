package com.example1.fragmentsad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    FragmentTransaction fragmentTransaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callClick(View view) {
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        callFragment CallFragment = new callFragment();
        fragmentTransaction.replace(R.id.fragment,CallFragment);
        fragmentTransaction.commit();
    }

    public void chatClick(View view) {
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        chatFragment ChatFragment = new chatFragment();
        fragmentTransaction.replace(R.id.fragment,ChatFragment);
        fragmentTransaction.commit();
    }
}