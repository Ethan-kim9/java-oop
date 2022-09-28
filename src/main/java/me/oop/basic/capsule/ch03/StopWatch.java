package me.oop.basic.capsule.ch03;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class StopWatch {


    Timer timer = new Timer();

    public long getElaspedTime(){
        timer.start();
        timer.stop();
        return timer.elaspedTime(MILLISECONDS);
    }
}
