package com.bo.wen.ye.headfirstjava;
import java.util.Calendar;
public class FullMoons {
    // static import java.lang.System.out;
    static int DAY_IM = 1000 * 60 * 60 * 24;



public static void main(String[] args) {

    Calendar c = Calendar.getInstance();
     c.set(2004,0,7,15,40);
    long day1 = c.getTimeInMillis();

        for(int x = 0;x<60 ;x++) {
            day1 += (DAY_IM * 29.52);
            c.setTimeInMillis(day1);
            System.out.println(String.format("full moon on *tc", c));
        }

}

}
