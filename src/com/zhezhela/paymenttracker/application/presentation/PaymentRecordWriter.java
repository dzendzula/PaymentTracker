package com.zhezhela.paymenttracker.application.presentation;

public interface PaymentRecordWriter extends Runnable{
	
	void writeAllRecordsOut();

}
