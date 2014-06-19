package concur;

import java.util.HashMap;

public class Message {
	private HashMap<String, Object> hm;
	
	public Message(HashMap<String, Object> input) {
		hm = input;
	}

	public HashMap<String, Object> getHm() {
		return hm;
	}

	public void setHm(HashMap<String, Object> hm) {
		this.hm = hm;
	}
}
