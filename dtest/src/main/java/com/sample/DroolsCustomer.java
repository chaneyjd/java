package com.sample;

public class DroolsCustomer {
	private String pushAddress;
	private String emailAddress;
	private String SMSAddress;
	private boolean isSMSApproved;
	
	public String getPushAddress() {
		return pushAddress;
	}
	public void setPushAddress(String pushAddress) {
		this.pushAddress = pushAddress;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getSMSAddress() {
		return SMSAddress;
	}
	public void setSMSAddress(String sMSAddress) {
		SMSAddress = sMSAddress;
	}
	public boolean isSMSApproved() {
		return isSMSApproved;
	}
	public void setSMSApproved(boolean isSMSApproved) {
		this.isSMSApproved = isSMSApproved;
	}

}
