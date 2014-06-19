package concur;

import java.util.HashMap;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

    protected BlockingQueue<Message> queue = null;
    private HashMap<String, Object> hm;

    public Producer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
        	for (Integer i = 1; i < 1000; i++) {
            	hm = new HashMap<String, Object>();
            	hm.put(i.toString(), i);
                queue.put(new Message(hm));        		
                //Thread.sleep(100);
        	}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}