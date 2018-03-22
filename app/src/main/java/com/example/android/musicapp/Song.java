package com.example.android.musicapp;

/**
 * Created by Antons_Dell on 06-Mar-18.
 */

public class Song {

    /** Default translation for the word */
    private String mSongName;

    /** Miwok translation for the word */
    private String mSongLength;

    /**
     +     * Create a new Word object.
     +     *
     +     * @param defaultTranslation is the word in a language that the user is already familiar with
     +     *                           (such as English)
     +     * @param miwokTranslation is the word in the Miwok language
     +     */
    public Song (String songName, String songLength){
        mSongName = songName;
        mSongLength = songLength;
    }

    /**
     +     * Get the default translation of the word.
     +     */
    public String getmSongName(){
        return mSongName;
    }

    /**
     +     * Get the Miwok translation of the word.
     +     */
    public String getmSongLength(){
        return mSongLength;
    }
}
