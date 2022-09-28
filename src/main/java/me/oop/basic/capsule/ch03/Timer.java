package me.oop.basic.capsule.ch03;

import java.util.concurrent.TimeUnit;

public class Timer {
    public long startTime;
    public long stopTime;


    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void stop(){
        this.stopTime = System.currentTimeMillis();
    }

    public long elaspedTime(TimeUnit unit){
        switch (unit){
            case MILLISECONDS -> {
                return stopTime - startTime;
            }
            default -> {
                return 0;
            }
        }
    }


}
