package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Dao.AddressDao;
import com.app.pojos.Address;

@Service
public class AddressServiceImpl implements IAddressService
{
	@Autowired
	private AddressDao adao;

	@Override
	public Address saveAddress(Address address) {
		
		return adao.save(address);
	}

	@Override
	public Address findAddress(int id) {
		
		return adao.getById(id);
		
		
	}

}
