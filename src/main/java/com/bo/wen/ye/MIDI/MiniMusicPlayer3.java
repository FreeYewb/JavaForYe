package com.bo.wen.ye.MIDI;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;
import javax.swing.JFrame;

public class MiniMusicPlayer3 {
    static JFrame f = new JFrame("My First Music Video");
    static MyDrawPanel ml;

    public static void main(String[] args) {
        MiniMusicPlayer3 mini = new MiniMusicPlayer3();
        mini.go();
    }

    public void setUpGui() {
        ml = new MyDrawPanel();
        f.setContentPane(ml);
        f.setBounds(30, 30, 300, 300);
        f.setVisible(true);
    }
    public void go() {
        setUpGui();

        try {
            Sequencer sequencer = MidiSystem.getSequencer();
        }
        catch (Exception e) {
            // TODO: handle exception
        }
    }
}
