package com.example;

public class TaskOne implements Runnable {
    @Override
    public void run() {
        System.out.println("Executing Task One " + Thread.currentThread().getId());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}