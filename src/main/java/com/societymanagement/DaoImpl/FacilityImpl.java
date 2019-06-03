package com.societymanagement.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.societymanagement.Dao.FacilityDao;
import com.societymanagement.Entity.Facility;
@Service
public class FacilityImpl implements FacilityDao {

	@Autowired
	private EntityManager entityManager;
	
	public List<Facility> allFacility() {
		entityManager.getTransaction().begin();
		List<Facility> facility = new ArrayList<Facility>();
		facility = entityManager.createQuery("select e from Facility e").getResultList();
		entityManager.getTransaction().commit();
		return facility;
	}

	
	public boolean addFacility(Facility facility) {
		entityManager.getTransaction().begin();
		entityManager.persist(facility);
		entityManager.getTransaction().commit();
		return true;
	}

	
	public boolean updateFacility(Facility facility, int facilityId) {
		entityManager.getTransaction().begin();
		entityManager.find(Facility.class, facilityId);
		entityManager.merge(facility);
		entityManager.getTransaction().commit();
		return true;
	}

	
	public boolean deleteFacility(int facilityId) {
		Facility facility = null;
		entityManager.getTransaction().begin();
		facility = entityManager.find(Facility.class, facilityId);
		entityManager.remove(facility);
		entityManager.getTransaction().commit();
		return true;
	}


	public Facility getFacility(int facilityId) {
		Facility facility = null;
		entityManager.getTransaction().begin();
		facility = entityManager.find(Facility.class, facilityId);
		entityManager.getTransaction().commit();
		return facility;
	}

}
