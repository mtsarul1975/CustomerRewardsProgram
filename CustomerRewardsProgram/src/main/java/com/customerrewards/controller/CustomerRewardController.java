package com.customerrewards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.customerrewards.POJO.CustomerDetails;
import com.customerrewards.model.Rewards;
import com.customerrewards.repostiory.CustomerRepository;
import com.customerrewards.service.CustomerRewardService;



@RestController
public class CustomerRewardController {
	
	@Autowired
	CustomerRewardService customerRewardService;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@GetMapping(value = "/{customerId}/reward")
	
	public Rewards getCustomerRewardsById(@PathVariable("customerId") int customerId){
	
		CustomerDetails custDetails = customerRepository.findByCustomerId(customerId);
		
		if(custDetails ==null) {
			throw new RuntimeException("CustomerId is not valid");
		}
		
		Rewards custRewards = customerRewardService.getCustomerRewardsById(customerId);
		return custRewards;
		
	}	
	

}
