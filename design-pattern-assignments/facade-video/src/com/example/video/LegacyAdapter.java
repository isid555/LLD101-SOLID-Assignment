package com.example.video;

public class LegacyAdapter {
    private final LegacySharpen legacySharpen;

    public LegacyAdapter(LegacySharpen legacySharpen){
        this.legacySharpen = legacySharpen;
    }

    public Frame[] sharpen(Frame[] frames , int strength){
        StringBuilder handleBuilder = new StringBuilder("HANDLE:[");
        for (int i = 0; i < frames.length; i++) {
            handleBuilder.append(frames[i]);
            if (i < frames.length - 1) {
                handleBuilder.append(",");
            }
        }
        handleBuilder.append("]");

        String handle = handleBuilder.toString();

        String newHandle = legacySharpen.applySharpen(handle , strength);

        //assume newhandled returned from api is converted to frames

        return frames;


    }
}