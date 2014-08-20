package concur;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

    protected BlockingQueue<Message> queue = null;

    public Consumer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
        	while (true) {
        		HashMap<String, Object> hm = queue.take().getHm();
        		Map.Entry<String, Object> entry = hm.entrySet().iterator().next();
        		System.out.println(entry.getKey() + " = " + entry.getValue());
        	}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}