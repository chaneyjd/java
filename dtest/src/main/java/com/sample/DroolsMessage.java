package com.sample;

public class DroolsMessage {

    public static final int PUSH = 0;
    public static final int SMS = 1;
    public static final int EMAIL = 2;
    
    public static final int REPLIED = 10;
    public static final int NOTREPLIED = 11;
    
    public int getFlowStatus() {
		return flowStatus;
	}
	public void setFlowStatus(int flowStatus) {
		this.flowStatus = flowStatus;
	}
	public int getReplyStatus() {
		return replyStatus;
	}
	public void setReplyStatus(int replyStatus) {
		this.replyStatus = replyStatus;
	}
	private int flowStatus;
    private int replyStatus;
}
