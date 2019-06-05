package com.bo.wen.ye.junit;

public class MockSystemEnvironment implements Environmental {

    public long getTime() {
        // TODO Auto-generated method stub
        return current_time;
    }

    public void setTime(long time) {
        current_time = time;
    }

    
    private long current_time;
    
    public void playWavFile(String filename) {
        playedWav = true;
    }

    public boolean wavWasPlayed() {
        return playedWav;
    }

    public void resetWav() {
        playedWav = false;
    }

    private boolean playedWav = false;

    public void playWavFile() {
        // TODO Auto-generated method stub

    }
}
