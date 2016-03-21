package com.zhezhela.paymenttracker.application.writer;

import com.zhezhela.paymenttracker.persist.viewer.PaymentRepositoryViewer;



/**
 * Factory that hides a concrete realization of a writer and presents only a factory interface methods ad 
 * constants to build a proper and supported in current version instance of a writer class
 * 
 * @author dzendzula
 *
 */
public class WriterFactory {

	public static final String CONSOLE_TYPE="CONSOLE";
	
	public static PaymentRecordWriter getWriter(String type, PaymentRepositoryViewer viewer){
		switch (type) {
		case CONSOLE_TYPE:
			return new ConsolePaymentRecordWriter(viewer);
		// case of other implementations of payment records "writers"
		default:
			return new ConsolePaymentRecordWriter(viewer);
		}
	}
	
}
