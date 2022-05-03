package com.example.customer.customer.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.customer.customer.model.Customer;

@Repository
@Transactional
public interface CustomerRepo extends JpaRepository<Customer,Integer> {

	



	

}
