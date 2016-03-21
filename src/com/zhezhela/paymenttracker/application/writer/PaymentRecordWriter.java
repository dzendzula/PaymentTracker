package com.zhezhela.paymenttracker.application.writer;

public interface PaymentRecordWriter extends Runnable{
	
	void writeAllRecordsOut();

}
