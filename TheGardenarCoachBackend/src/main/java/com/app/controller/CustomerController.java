package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.DTO.LoginDTO;
import com.app.DTO.Response;
import com.app.pojos.Customer;
import com.app.service.ICustomerService;

@RestController
@RequestMapping("/api/customers")
@CrossOrigin(origins="http://localhost:3000")
public class CustomerController {
	
	@Autowired
	private ICustomerService custService;
	
	//to save customer
	@PostMapping
	public ResponseEntity<?> saveCustomer(@RequestBody Customer cust)
	{
		try 
		{
			custService.registerCustomer(cust);
			return Response.success(cust);
		}
		catch(Exception e)
		{
			return Response.error(e);
		}
	}
	
	//to get customer
	@GetMapping
	public ResponseEntity<?> findAllCustomers()
	{
		List<Customer> customer = custService.allCustomers();
		return Response.success(customer);
	}
	
	//get customer by id
	@GetMapping("/{id}")
	public ResponseEntity<?> GetCustomerById(@PathVariable ("id") int id)
	{
		Customer customer = custService.findById(id);
		return Response.success(customer);
	}
	
	//update customer by id
	@PutMapping("/{id}")
	public ResponseEntity<?> updateCustomerProfile(@RequestBody Customer cust, @PathVariable ("id") int id)
	{
		 custService.updateProfile(cust);
		 return Response.success(cust);
		
	}
	
	//validate the customer using email nd password
	@PostMapping("/validate")
	public ResponseEntity<?> validateUser(@RequestBody LoginDTO ldto)
	{
		System.out.println(ldto);
		Customer user = custService.validate(ldto.getEmail(), ldto.getPwd());
		if(user!=null)
			return Response.success(user);
		else
			return Response.status(HttpStatus.NOT_FOUND);
	}
	
	

}
