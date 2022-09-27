package com.app.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.Seller;

@Repository
public interface SellerDao extends JpaRepository<Seller, Integer>
{

	Seller findByEmail(String email);
}
