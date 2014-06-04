package com.example;

import java.util.List;

public class MultiRunnable implements Runnable {
 
    private final List<Runnable> runnables;
 
    public MultiRunnable(List<Runnable> runnables) {
        this.runnables = runnables;
    }
 
    @Override
    public void run() {
        for (Runnable runnable : runnables) {
             new Thread(runnable).start();
        }
    }
}