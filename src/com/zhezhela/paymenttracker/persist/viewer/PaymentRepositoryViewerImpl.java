package com.zhezhela.paymenttracker.persist.viewer;

import java.util.List;

import com.zhezhela.paymenttracker.domain.PaymentRecord;
import com.zhezhela.paymenttracker.persist.PaymentRepository;

public class PaymentRepositoryViewerImpl implements PaymentRepositoryViewer{

	private PaymentRepository repository;
	
	public PaymentRepositoryViewerImpl(PaymentRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public List<PaymentRecord> getAllPaymentRecords() {
		return repository.getAllRecords();
	}

	public void setRepository(PaymentRepository repository) {
		this.repository = repository;
	}

}
