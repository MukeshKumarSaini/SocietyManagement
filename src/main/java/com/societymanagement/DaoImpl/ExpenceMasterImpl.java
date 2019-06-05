package com.societymanagement.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.societymanagement.Dao.ExpenceMasterDao;
import com.societymanagement.Entity.ExpenceMaster;
@Service
public class ExpenceMasterImpl implements ExpenceMasterDao {

	@Autowired
	private EntityManager entityManager;

	public List<ExpenceMaster> allExpence() {
		entityManager.getTransaction().begin();
		List<ExpenceMaster> expenceMaster = new ArrayList<ExpenceMaster>();
		expenceMaster = entityManager.createQuery("select e from ExpenceMaster e").getResultList();
		entityManager.getTransaction().commit();
		return expenceMaster;
	}

	public boolean addExpence(ExpenceMaster expenceMaster) {
		entityManager.getTransaction().begin();
		entityManager.persist(expenceMaster);
		entityManager.getTransaction().commit();
		return true;
	}

	public boolean updateExpence(ExpenceMaster expenceMaster, int expenceId) {
		entityManager.getTransaction().begin();
		entityManager.find(ExpenceMaster.class, expenceId);
		entityManager.merge(expenceMaster);
		entityManager.getTransaction().commit();
		return true;
	}

	public boolean deleteExpence(int expenceId) {
		ExpenceMaster expenceMaster = null;
		entityManager.getTransaction().begin();
		expenceMaster = entityManager.find(ExpenceMaster.class, expenceId);
		entityManager.remove(expenceMaster);
		entityManager.getTransaction().commit();
		return true;
	}

	public ExpenceMaster getExpence(int expenceId) {
		ExpenceMaster expenceMaster = null;
		entityManager.getTransaction().begin();
		expenceMaster = entityManager.find(ExpenceMaster.class, expenceId);
		entityManager.getTransaction().commit();
		return expenceMaster;
	}

}
