package com.senlatask.util;

public class TimeTracker {
    private long startTime;

    public void startTraking() {
        startTime = System.nanoTime();
    }

    public String getTime() {
        return String.valueOf(System.nanoTime() - startTime);
    }
}
