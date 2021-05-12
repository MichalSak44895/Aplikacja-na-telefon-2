package com.example.myapplication;

import android.content.Context;
import android.media.MediaPlayer;

public class Album {
    private String name, title;
    private int picture;
    private MediaPlayer music;

    public Album(Context context, String name, String title, int picture, int musicId) {
        this.name = name;
        this.title = title;
        this.picture = picture;
        this.music = MediaPlayer.create(context, musicId);
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public int getPicture() {
        return picture;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public void start() {
        music.start();
    }

    public void pause() {
        music.pause();
    }
}
