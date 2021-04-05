package com.example1.adapter_listviewproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
     ListView listView;
     Button button;
     EditText editText;
    ArrayAdapter<String> arrAdp;
    ArrayList<String> fruitlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =  findViewById(R.id.button2);
        editText = findViewById(R.id.editName);
        fruitlist= new ArrayList<String>();
        fruitlist.add("Apple");
        fruitlist.add("Mango");
        fruitlist.add("Grapes");
        fruitlist.add("Orange");
        fruitlist.add("Banana");
        arrAdp = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,fruitlist);
        listView = (ListView) findViewById(R.id.ListView);
        listView.setAdapter(arrAdp);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,PictureActivity.class);
                intent.putExtra("FruitName",fruitlist.get(position));
                startActivity(intent);
            }
        });
    }

    public void AddFruitName(View view) {
        fruitlist.add(editText.getText().toString());
        listView.setAdapter(arrAdp);
        arrAdp.notifyDataSetChanged();
        Collections.sort(fruitlist);
    }
}