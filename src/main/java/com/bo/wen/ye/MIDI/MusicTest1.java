package com.bo.wen.ye.MIDI;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTest1 {
    public void play() {
        try {
            Sequencer sequence = MidiSystem.getSequencer();
            System.out.println("ssssss");
        }
        catch (MidiUnavailableException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MusicTest1 t1 = new MusicTest1();
        t1.play();
    }

}
