package com.example1.drawernavigation;


import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle toggle;

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer(GravityCompat.START);
            Toast.makeText(getApplicationContext(),"Start",Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(),"END",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        navigationView=findViewById(R.id.nav_view);
        drawerLayout=findViewById(R.id.drawer);

        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,"Opening",getString(R.string.close));
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }


    NavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener())
    {
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
        {
            switch (menuItem.getItemId()) {
                case R.id.nav_book:
                    Toast.makeText(getApplicationContext(), "Book Is clicked", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this, BookActivity.class);
                    startActivity(intent);
                    break;
                case R.id.nav_return:
                    Toast.makeText(getApplicationContext(), "Return Is clicked", Toast.LENGTH_LONG).show();
                    break;
                case R.id.nav_laptop:
                    Toast.makeText(getApplicationContext(), "Laptop Is clicked", Toast.LENGTH_LONG).show();
                    break;
                case R.id.nav_chromereader:
                    Toast.makeText(getApplicationContext(), "Chrome reader Is clicked", Toast.LENGTH_LONG).show();
                    break;
                case R.id.nav_voice:
                    Toast.makeText(getApplicationContext(), "Voice Is clicked", Toast.LENGTH_LONG).show();
                    break;
                case R.id.nav_addcomment:
                    Toast.makeText(getApplicationContext(), "Add Comment Is clicked", Toast.LENGTH_LONG).show();
                    break;


            }

        }
    }
}