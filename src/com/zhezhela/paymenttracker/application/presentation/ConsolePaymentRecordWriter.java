package com.zhezhela.paymenttracker.application.presentation;

import java.util.List;

import com.zhezhela.paymenttracker.domain.PaymentRecord;
import com.zhezhela.paymenttracker.persist.PaymentRepositoryViewer;

/**
 * 
 * IMplementation that writes out the repository contents to a user console.
 * 
 * @author dzendzula
 *
 */
public class ConsolePaymentRecordWriter implements PaymentRecordWriter {

	private PaymentRepositoryViewer repositoryObserver;

	public ConsolePaymentRecordWriter(PaymentRepositoryViewer observer) {
		this.repositoryObserver = observer;
	}

	@Override
	public void writeAllRecordsOut() {

		if (repositoryObserver == null) {
			return;
		}

		List<PaymentRecord> records = repositoryObserver.getAllPaymentRecords();
		for (PaymentRecord paymentRecord : records) {
			System.out.println(paymentRecord.toString());
		}

	}

	@Override
	public void run() {
		try {
			while (!Thread.interrupted()) {
					writeAllRecordsOut();
					Thread.sleep(60000);
			}
		} catch (InterruptedException e) {
			System.out.println("Exiting application");
		}
	}

}
