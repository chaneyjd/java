package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		MultiTaskExecutor multi = new MultiTaskExecutor();
		
        List<Runnable> taskGroup = new ArrayList<Runnable>();
        taskGroup.add(new TaskOne());
        taskGroup.add(new TaskTwo());
        taskGroup.add(new TaskThree());

        multi.getQueue().add(new MultiRunnable(taskGroup));
	}

}
