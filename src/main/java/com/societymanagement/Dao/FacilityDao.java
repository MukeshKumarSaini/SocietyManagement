package com.societymanagement.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.societymanagement.Entity.Facility;
@Repository
public interface FacilityDao {
	
	public List<Facility> allFacility();
	public boolean addFacility(Facility facility);
	public boolean updateFacility(Facility facility,int facilityId);
	public boolean deleteFacility(int facilityId);
	public Facility getFacility(int facilityId);

}
