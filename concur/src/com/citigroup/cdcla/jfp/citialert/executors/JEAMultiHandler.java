package com.citigroup.cdcla.jfp.citialert.executors;

import java.util.List;

public class JEAMultiHandler implements Runnable{

	private final List<JEAHandler> runnables;
	 
    public JEAMultiHandler(List<JEAHandler> runnables) {
        this.runnables = runnables;
    }
 
    public void run() {
        for (JEAHandler runnable : runnables) {
             new Thread(runnable).start();
        }
    }

}
