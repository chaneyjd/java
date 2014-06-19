package com.citigroup.cdcla.jfp.citialert.executors;

import java.util.concurrent.BlockingQueue;

public abstract class JEAHandler implements Runnable {

	private BlockingQueue<JEAMessage> _queue = null;
	
	public void run() {
		while (!Thread.interrupted()) {
			// handle interrupts (shutdown / stop / etc)
			handleMessage(_queue.poll());
		}
	}
	
    public  void setQueue(BlockingQueue<JEAMessage> queue) {
    	_queue = queue;
    	} 

	public abstract void handleMessage(JEAMessage message);
	
//	public static  JEAHandler getInstance(){
//		if (handler == null){
//			synchronized (JEAHandler.class) {
//				if (handler == null){
//					handler = new JEAHandler();
//				}
//			}
//		}
//		return handler;
//	}
	
}
