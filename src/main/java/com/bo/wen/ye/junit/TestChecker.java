package com.bo.wen.ye.junit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;

public class TestChecker {

    public void testQuittingTime() {
        MockSystemEnvironment env = new MockSystemEnvironment();
        // 设置目标测试时间
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2004);
        cal.set(Calendar.MONTH, 10);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 16);
        cal.set(Calendar.MINUTE, 55);
        long t1 = cal.getTimeInMillis();
        env.setTime(t1);
        Checker checker = new Checker(env);

        checker.reminder();// 运行checker

        assertFalse(env.wavWasPlayed());// 检查wac文件是否还没播放

        t1 += (5 * 60 * 1000);// 把时间提前5分钟
        env.setTime(t1);

        checker.reminder();// 现在运行检查程序

        assertTrue(env.wavWasPlayed());// should have played now

        env.resetWav();// 重设mock，让我们再试一次

        t1 += 2 * 60 * 60 * 1000;
        env.setTime(t1);

        checker.reminder();
        assertTrue(env.wavWasPlayed());
    }
}
