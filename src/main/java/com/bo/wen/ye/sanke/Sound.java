package com.bo.wen.ye.sanke;

import java.io.File;
import java.io.IOException;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

public class Sound {
    String path = new String("D:KDR/");
    String file  = new String("snake.mid");
    
    Sequence seq;
    Sequencer midi;
    boolean sign;
    
    void loadSound() {
        try {
            seq = MidiSystem.getSequence(new File(path+file));
            midi = MidiSystem.getSequencer();
            midi.open();
            midi.setSequence(seq);
            midi.start();
            midi.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
        }catch (InvalidMidiDataException | IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }catch (MidiUnavailableException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
            sign = true;

        }
        
        public Sound() {   
        }
        void mystop() {
            midi.stop();
            midi.close();
            sign = false;
        }
        boolean isplay() {
            return sign;
        }
        void setMusic(String e) {
            file = e;
        }
        
    
    

}
