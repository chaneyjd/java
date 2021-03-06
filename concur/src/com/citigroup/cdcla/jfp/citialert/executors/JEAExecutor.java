package com.citigroup.cdcla.jfp.citialert.executors;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class JEAExecutor {

    private BlockingQueue<JEAMessage> messageQueue; 
    private BlockingQueue<Runnable> threadQueue;
    private RejectedExecutionHandler rejectionHandler; 
    private ThreadPoolExecutor threadPoolExecutor;
    //ExecutorService executorService = null;
    private static JEAExecutor executor;
    
    private final int MAX_THREADS = 3;
        
        private JEAExecutor() { 
        
        }
        
        public static  JEAExecutor getInstance(){
    		if (executor == null){
    			synchronized (JEAExecutor.class) {
    				if (executor == null){
    					executor = new JEAExecutor();
    				}
    			}
    		}
    		return executor;
    	}
        
        public void shutdown() {
        	threadPoolExecutor.shutdownNow();
        }
        
        public void initialize(JEAHandler handler){
           messageQueue = new ArrayBlockingQueue<JEAMessage>(10); 
           rejectionHandler = new RejectedExecutionHandelerImpl();
           
           threadQueue = new ArrayBlockingQueue<Runnable>(MAX_THREADS);
           
//           for (JEAHandler handler : handlers) {
        	   handler.setQueue(messageQueue);
        	   threadQueue.add(handler);
//           }
           
           threadPoolExecutor = new ThreadPoolExecutor(MAX_THREADS, MAX_THREADS, 1, TimeUnit.MINUTES, threadQueue, rejectionHandler); 
           threadPoolExecutor.prestartAllCoreThreads(); 
         //   executorService = Executors.newFixedThreadPool(10);
        }
        
//        public void execute(List<JEAHandler> listHandler){
//        	for(JEAHandler handler : listHandler){
//            	executorService.execute(handler);
//            }
        
    public  BlockingQueue<JEAMessage> getQueue() { 
    	return messageQueue; 
    	} 
}
