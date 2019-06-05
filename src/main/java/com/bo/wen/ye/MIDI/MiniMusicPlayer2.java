package com.bo.wen.ye.MIDI;

import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

public class MiniMusicPlayer2 implements ControllerEventListener {
    public static void main(String[] args) {
        MiniMusicPlayer2 mini = new MiniMusicPlayer2();
        mini.go();
    }

    public void go() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            int[] eventsIWant = { 127 };
            sequencer.addControllerEventListener(this, eventsIWant);
            // 向sequencer注册事件，注册的方法取用监听者与代表想要聆听的事件的int数组，我们只需要127事件

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();
            
            for (int i = 5; i < 60; i += 4) {

                track.add(makeEvent(144, 1, i, 100, i));
                track.add(makeEvent(176, 1, 127, 0, i));// 插入事件编号为127自定义ControllerEvent(176).它不会做任何事情，只是让我们知道有音符被播放，因为它的tick跟NOTE
                                                        // ON是同时进行的
                track.add(makeEvent(1828, 1, i, 100, i + 2));
            }
            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        
        }
        catch (Exception e) {
            // TODO: handle exception11
            e.printStackTrace();
        }
    }

    public void controlChange(ShortMessage arg0) {
        // TODO Auto-generated method stub
        System.out.println("la");
        // 获知事件时在命令打印字符串的事件处理程序
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
