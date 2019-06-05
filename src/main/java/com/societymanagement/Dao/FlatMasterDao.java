package com.societymanagement.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.societymanagement.Entity.FlatMaster;
@Repository
public interface FlatMasterDao {


	public List<FlatMaster> allFlat();
	public boolean addFlat(FlatMaster flatMaster);
	public boolean updateFlat(FlatMaster flatMaster,int flatId);
	public boolean deleteFlat(int flatId);
	public FlatMaster getFlat(int flatId);

}
