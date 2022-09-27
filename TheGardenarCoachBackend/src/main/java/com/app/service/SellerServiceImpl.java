package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Dao.SellerDao;
import com.app.pojos.Seller;

@Service
@Transactional
public class SellerServiceImpl implements ISellerService {
	
	@Autowired
	private SellerDao sdao;

	@Override
	public void registerSeller(Seller seller) 
	{
		sdao.save(seller);
		
	}

	@Override
	public List<Seller> allSellers() {
		
		return sdao.findAll();
	}

	@Override
	public Seller findById(int id) {
		
		return sdao.getById(id);
	}

	@Override
	public Seller validate(String email, String pwd) {
		
		Seller seller = sdao.findByEmail(email);
		if(seller.getPwd().equals(pwd) && seller.getPwd() !=null)
		{
			return seller;
		}
		return  null;
	}

	@Override
	public void deleteSeller(int id) {
		Seller seller = sdao.getById(id);
		sdao.delete(seller);
		
	}

}
