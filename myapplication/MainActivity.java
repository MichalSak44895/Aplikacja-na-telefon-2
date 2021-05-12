package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Album> albums;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mainlist = findViewById(R.id.main_list);


        albums = new ArrayList<>();

        albums.add(new Album(this, "Slon", "Bezdech", R.drawable.slon, R.raw.slon2));
        albums.add(new Album(this, "Slon", "Gabinet luster", R.drawable.slon2, R.raw.slon));
        albums.add(new Album(this, "Slon", "Wojna totalna", R.drawable.slon3, R.raw.slon3));
        albums.add(new Album(this, "Taco", "Polskie Tango", R.drawable.taco, R.raw.taco));

        AlbumAdapter adapter = new AlbumAdapter(this, albums);
        mainlist.setAdapter(adapter);
    }
}