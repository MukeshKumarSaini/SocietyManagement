package com.societymanagement.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.societymanagement.Dao.FlatMasterDao;
import com.societymanagement.Entity.FlatMaster;
@Service
public class FlatMasterImpl implements FlatMasterDao {
	@Autowired
	private EntityManager entityManager;

	public List<FlatMaster> allFlat() {
		entityManager.getTransaction().begin();
		List<FlatMaster> flatMaster = new ArrayList<FlatMaster>();
		flatMaster = entityManager.createQuery("select e from FlatMaster e").getResultList();
		entityManager.getTransaction().commit();
		return flatMaster;
	}

	public boolean addFlat(FlatMaster flatMaster) {
		entityManager.getTransaction().begin();
		entityManager.persist(flatMaster);
		entityManager.getTransaction().commit();
		return true;
	}

	public boolean updateFlat(FlatMaster flatMaster, int flatId) {
		entityManager.getTransaction().begin();
		entityManager.find(FlatMaster.class, flatId);
		entityManager.merge(flatMaster);
		entityManager.getTransaction().commit();
		return true;
	}

	public boolean deleteFlat(int flatId) {
		FlatMaster flatMaster = null;
		entityManager.getTransaction().begin();
		flatMaster = entityManager.find(FlatMaster.class, flatId);
		entityManager.remove(flatMaster);
		entityManager.getTransaction().commit();
		return true;
	}

	public FlatMaster getFlat(int flatId) {
		FlatMaster flatMaster = null;
		entityManager.getTransaction().begin();
		flatMaster = entityManager.find(FlatMaster.class, flatId);
		entityManager.getTransaction().commit();
		return flatMaster;
	}

}
