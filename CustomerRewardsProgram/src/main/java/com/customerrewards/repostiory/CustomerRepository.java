package com.customerrewards.repostiory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customerrewards.POJO.CustomerDetails;

public interface CustomerRepository extends JpaRepository<CustomerDetails, Integer> {
	
	public CustomerDetails findByCustomerId(int customer);

}
