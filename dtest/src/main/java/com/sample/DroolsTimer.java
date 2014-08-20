package com.sample;

public class DroolsTimer {
    private int length;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void pause() {
		try {
			Thread.sleep(length);
		} catch (InterruptedException e) {
		}
	}

}
