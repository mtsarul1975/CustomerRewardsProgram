package com.customerrewards.repostiory;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.customerrewards.POJO.RewardsProgram;

@Repository
@Transactional
public interface RewardsProgramRepository extends JpaRepository <RewardsProgram, Long>{
	
	public List<RewardsProgram> findByCustomerId(int customerId);
	
	public List<RewardsProgram> findRewardsProgramByDateTransaction(int customerId, Timestamp from, Timestamp to);
	
	

	
}
