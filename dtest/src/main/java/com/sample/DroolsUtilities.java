package com.sample;

public class DroolsUtilities {

	public void sendPush(String address) {
		System.out.println("PUSH message to: " + address);
	}
	public void sendEmail(String address) {
		System.out.println("eMAIL message to: " + address);
	}
	public void sendSMS(String address) {
		System.out.println("SMS message to: " + address);
	}
}
