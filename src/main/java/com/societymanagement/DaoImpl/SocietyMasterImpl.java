package com.societymanagement.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.societymanagement.Dao.SocietyMasterDao;
import com.societymanagement.Entity.SocietyMaster;
@Service
public class SocietyMasterImpl implements SocietyMasterDao{

	@Autowired
	private EntityManager entityManager;

	
	public List<SocietyMaster> allSociety() {
		entityManager.getTransaction().begin();
		List<SocietyMaster> society = new ArrayList<SocietyMaster>();
		society = entityManager.createQuery("select e from SocietyMaster e").getResultList();
		entityManager.getTransaction().commit();
		return society;
	}

	public boolean addSociety(SocietyMaster society) {
		entityManager.getTransaction().begin();
		entityManager.persist(society);
		entityManager.getTransaction().commit();
		return true;
			
	
	}

	public boolean updateSociety(SocietyMaster society, int societyId) {
		entityManager.getTransaction().begin();
		entityManager.find(SocietyMaster.class, societyId);
		entityManager.merge(society);
		entityManager.getTransaction().commit();
		return true;
		
	}

	public boolean deleteSociety(int societyId) {
		SocietyMaster society = null;
		entityManager.getTransaction().begin();
		 society = entityManager.find(SocietyMaster.class, societyId);
		entityManager.remove(society);
		entityManager.getTransaction().commit();
		return true;
	}

	public SocietyMaster getSociety(int societyId) {
		SocietyMaster society = null;
		entityManager.getTransaction().begin();
		society = entityManager.find(SocietyMaster.class, societyId);
		entityManager.getTransaction().commit();
		return society;
	}



}
