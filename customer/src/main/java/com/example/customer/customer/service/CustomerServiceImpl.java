package com.example.customer.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.example.customer.customer.model.Customer;
import com.example.customer.customer.repo.CustomerRepo;

import net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition.Optional;

public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerRepo repo;
	@Autowired
	RestTemplate template;
	
	@Override
	public List<Customer> allcustomer() {
		// TODO Auto-generated method stub
		
		return repo.findAll();
	}

	@Override
	public String addcustomer(Customer c) {
		// TODO Auto-generated method stub
		repo.save(c);
		return "customer added";
	}

	@Override
	public List<Customer> updatecustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletecustomer(int customer_id) {
		// TODO Auto-generated method stub
		repo.deleteById(customer_id);
		return "customer deleted";
	}

	
	//@Override
//	public List<Customer> searchmovie() {
//		// TODO Auto-generated method stub
//		return repo.findAll();
//		
//	}
//	

}
