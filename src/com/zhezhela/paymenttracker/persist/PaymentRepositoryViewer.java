package com.zhezhela.paymenttracker.persist;

import java.util.List;

import com.zhezhela.paymenttracker.domain.PaymentRecord;

/**
 * 
 * Interface that mediates only reading methods from repository. 
 * Should be used with different implementations of PaymentRecord writers.
 * 
 * @author dzendzula
 *
 */
public interface PaymentRepositoryViewer {

	List<PaymentRecord> getAllPaymentRecords();
	
}
