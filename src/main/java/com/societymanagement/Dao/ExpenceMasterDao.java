package com.societymanagement.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.societymanagement.Entity.ExpenceMaster;
@Repository
public interface ExpenceMasterDao {
	

	public List<ExpenceMaster> allExpence();
	public boolean addExpence(ExpenceMaster expenceMaster);
	public boolean updateExpence(ExpenceMaster expenceMaster,int expenceId);
	public boolean deleteExpence(int expenceId);
	public ExpenceMaster getExpence(int expenceId);


}
