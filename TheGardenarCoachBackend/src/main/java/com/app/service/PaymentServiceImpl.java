package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Dao.PaymentDao;
import com.app.pojos.Payment;

@Service
@Transactional
public class PaymentServiceImpl implements IPaymentService
{
	@Autowired
	private PaymentDao pdao;

	@Override
	public Payment savePayment(Payment payment) {
		
		return pdao.save(payment);
	}

	@Override
	public Payment findPaymentById(int id) {
		
		return pdao.getById(id);
	}

}
