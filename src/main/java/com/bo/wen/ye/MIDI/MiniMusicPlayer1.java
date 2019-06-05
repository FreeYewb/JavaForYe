package com.bo.wen.ye.MIDI;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class MiniMusicPlayer1 {
public static void main(String[] args) {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();// 创建队列
            sequencer.open();// 打开队列

            Sequence seq = new Sequence(Sequence.PPQ, 4);// 创建队列
            Track track = seq.createTrack();// track
            for (int i = 5; i < 61; i += 4) {// 创建一堆连续的音符事件
                track.add(makeEvent(144, 1, i, 100, i));// 调用makeEvent来产生信息和事件
                track.add(makeEvent(128, 1, i, 100, i + 2));// 然后把它们加到track上
            }
            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();// 开始播放

        }
        catch (Exception e) {
            // TODO: handle exception
        }
}

    public static MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage message = new ShortMessage();
            message.setMessage(comd, chan, one, two);
            event = new MidiEvent(message, tick);
        }
        catch (Exception e) {
            // TODO: handle exception
        }
        return event;
    }
}
