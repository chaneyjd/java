package com.example;

public class TaskOne implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep((long) (Math.random()*10000));
            System.out.println("Executing Task One " + Thread.currentThread().getId());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}