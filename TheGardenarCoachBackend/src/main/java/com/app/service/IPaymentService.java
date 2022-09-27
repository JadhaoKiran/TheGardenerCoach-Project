package com.app.service;

import com.app.pojos.Payment;

public interface IPaymentService 
{

	Payment savePayment(Payment payment);
	Payment findPaymentById(int id);
}
