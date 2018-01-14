package com.example.anhkhoa.multitemlistview;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String>listString;
    AdapterString adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listString);
        listString=new ArrayList<>();
        Room rom=new Room();

        for(int i=0;i<20;i++){
            rom.setNameRoom("room"+i);
            listString.add(rom.getNameRoom());

        }

        adapter=new AdapterString(MainActivity.this,R.layout.item,listString);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                listString.remove(i);
                listView.setAdapter(adapter);
            }
        });
    }
}
