package com.a.b.c;

//import java.util.ArrayList;
import com.citigroup.cdcla.jfp.citialert.executors.JEAExecutor;

public class Client {
	public static void main(String[] args) {
		JEAExecutor jeaExecutor = JEAExecutor.getInstance();
		jeaExecutor.initialize(new MyHandler());

//		List<MyMessage> list = new ArrayList<MyMessage>();
//		
//		list.add(new MyMessage());
//		list.add(new MyMessage());
//		list.add(new MyMessage());
//		list.add(new MyMessage());
//		list.add(new MyMessage());
//		list.add(new MyMessage());
//		list.add(new MyMessage());
//		
//		jeaExecutor.getQueue().offer(new JEAMultiHandler(list));
		
		MyMessage m = new MyMessage();
		m.setCustomerId((long) 10101);
		
		jeaExecutor.getQueue().offer(m);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) { }
		
		m.setCustomerId((long)20202);
		jeaExecutor.getQueue().offer(m);
		
		jeaExecutor.shutdown();
		
		//jeaExecutor.shutdown();
		// gracefull / interrupt
	}
}