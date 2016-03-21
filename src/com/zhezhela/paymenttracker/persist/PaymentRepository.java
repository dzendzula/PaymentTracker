package com.zhezhela.paymenttracker.persist;

import java.util.List;

import com.zhezhela.paymenttracker.domain.PaymentRecord;


/**
 * 
 * Interface presents sample methods for operation with Payment Records repositories
 * 
 * @author dzendzula
 *
 */
public interface PaymentRepository {
	
	void persist(PaymentRecord record);
	
	List<PaymentRecord> getAllRecords();
}
