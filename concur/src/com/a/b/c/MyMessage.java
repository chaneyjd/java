package com.a.b.c;

import com.citigroup.cdcla.jfp.citialert.executors.JEAMessage;

public class MyMessage extends JEAMessage{

	private Long customerId;
	private Long txnAmount;
	
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Long getTxnAmount() {
		return txnAmount;
	}
	public void setTxnAmount(Long txnAmount) {
		this.txnAmount = txnAmount;
	}
}