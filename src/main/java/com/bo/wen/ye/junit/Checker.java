package com.bo.wen.ye.junit;

import java.util.Calendar;

public class Checker {
    public Checker(Environmental anenv) {
        env = anenv;
    }

    public void reminder() {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(env.getTime());
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        if(hour >= 17) {
            env.playWavFile();
        }
    }
    private Environmental env;
}
