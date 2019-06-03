package com.societymanagement.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.societymanagement.Entity.FundCategory;

@Repository
public interface FundCategoryDao {
	
	
	public List<FundCategory> allFund();
	public boolean addFund(FundCategory fundCategory);
	public boolean updateFund(FundCategory fundCategory,int fundId);
	public boolean deleteFund(int fundId);
	public FundCategory getFund(int fundId);

}



	
