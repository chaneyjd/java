package com.a.b.c;

import com.citigroup.cdcla.jfp.citialert.executors.JEAHandler;
import com.citigroup.cdcla.jfp.citialert.executors.JEAMessage;

public class MyHandler extends JEAHandler{
	
	@Override
	public void handleMessage(JEAMessage message) {
		// drools enging check - fire
			if (message != null) {
				System.out.println(((MyMessage)message).getCustomerId());
			}
	}
}