package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Antons_Dell on 07-Mar-18.
 */

public class Album2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Artist - New Song Name", "0:00"));
        songs.add(new Song("Artist - New Song Name", "0:00"));
        songs.add(new Song("Artist - New Song Name", "0:00"));
        songs.add(new Song("Artist - New Song Name", "0:00"));
        songs.add(new Song("Artist - New Song Name", "0:00"));
        songs.add(new Song("Artist - New Song Name", "0:00"));
        songs.add(new Song("Artist - New Song Name", "0:00"));
        songs.add(new Song("Artist - New Song Name", "0:00"));
        songs.add(new Song("Artist - New Song Name", "0:00"));
        songs.add(new Song("Artist - New Song Name", "0:00"));
        songs.add(new Song("Artist - New Song Name", "0:00"));
        songs.add(new Song("Artist - New Song Name", "0:00"));
        songs.add(new Song("Artist - New Song Name", "0:00"));
        songs.add(new Song("Artist - New Song Name", "0:00"));
        songs.add(new Song("Artist - New Song Name", "0:00"));
        songs.add(new Song("Artist - New Song Name", "0:00"));
        songs.add(new Song("Artist - New Song Name", "0:00"));
        songs.add(new Song("Artist - New Song Name", "0:00"));
        songs.add(new Song("Artist - New Song Name", "0:00"));
        songs.add(new Song("Artist - New Song Name", "0:00"));
        songs.add(new Song("Artist - New Song Name", "0:00"));
        songs.add(new Song("Artist - New Song Name", "0:00"));


        SongAdapter<Song> adapter = new SongAdapter<Song>(this, songs);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}