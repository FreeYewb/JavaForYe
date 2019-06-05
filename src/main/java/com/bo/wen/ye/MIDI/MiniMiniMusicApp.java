package com.bo.wen.ye.MIDI;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class MiniMiniMusicApp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
        mini.play();
    }

    public void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();// 取得Sequencer并将它打开
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();// 要求取得Track

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 12, 103, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 3);
            track.add(noteOff);

            player.setSequence(seq);// 将Sequence送到Sequencer上
            player.start(); // 开始播放

        }
        catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
