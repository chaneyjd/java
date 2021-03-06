package com.example;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
 
public class MultiTaskExecutor {
	
    BlockingQueue<Runnable> worksQueue;
    RejectedExecutionHandler rejectionHandler;
    ThreadPoolExecutor executor;
	
	public MultiTaskExecutor() {
        worksQueue = new ArrayBlockingQueue<Runnable>(10);
        rejectionHandler = new RejectedExecutionHandelerImpl();
        executor = new ThreadPoolExecutor(3, 3, 10, TimeUnit.SECONDS, worksQueue, rejectionHandler);
        executor.prestartAllCoreThreads();
	}
	
	BlockingQueue<Runnable> getQueue() {
		return worksQueue;
	}
}