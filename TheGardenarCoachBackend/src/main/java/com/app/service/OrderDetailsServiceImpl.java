package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Dao.OrderDetailsDao;
import com.app.pojos.Order;
import com.app.pojos.OrderDetails;

@Service
public class OrderDetailsServiceImpl implements IOrderDetailService{

	@Autowired
	private OrderDetailsDao oddao;
	
	@Override
	public void saveOrderDetails(OrderDetails od) {
		oddao.save(od);
		
	}

	@Override
	public OrderDetails findById(int id) {
		
		return oddao.getById(id);
	}

	@Override
	public List<OrderDetails> findByOrder(Order order) {
		
		return oddao.findByOrder(order);
	}

}
