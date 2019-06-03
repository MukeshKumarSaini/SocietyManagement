package com.societymanagement.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.societymanagement.Entity.SocietyMaster;
@Repository
public interface SocietyMasterDao  {
	
	public List<SocietyMaster> allSociety();
	public boolean addSociety(SocietyMaster society) throws Exception;
	public boolean updateSociety(SocietyMaster society,int societyId);
	public boolean deleteSociety(int societyId);
	public SocietyMaster getSociety(int societyId);

}
