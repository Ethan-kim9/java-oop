package me.oop.basic;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println("Hi OOP");
        long end = System.nanoTime();

        long elapsedNano = end - start;
        long convertedTime = TimeUnit.SECONDS.convert(elapsedNano, TimeUnit.NANOSECONDS);
        System.out.println(elapsedNano+"< 실행시간 "+convertedTime +"< 초");
    }
}
