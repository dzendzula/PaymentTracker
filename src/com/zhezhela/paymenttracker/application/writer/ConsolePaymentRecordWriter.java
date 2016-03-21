package com.zhezhela.paymenttracker.application.writer;

import java.util.List;

import com.zhezhela.paymenttracker.domain.PaymentRecord;
import com.zhezhela.paymenttracker.persist.viewer.PaymentRepositoryViewer;

/**
 * 
 * IMplementation that writes out the repository contents to a user console.
 * 
 * @author dzendzula
 *
 */
class ConsolePaymentRecordWriter implements PaymentRecordWriter {

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
			String recordString = paymentRecord.getCurrency().toUpperCase() + " " + paymentRecord.getAmount() + (paymentRecord.getUsdEquivalent()!=null?" (USD " + paymentRecord.getUsdEquivalent()+ ")":"");
			System.out.println(recordString);
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
