package com.societymanagement.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.societymanagement.Dao.FundCategoryDao;
import com.societymanagement.Entity.FundCategory;
import com.societymanagement.Entity.Member;
@Service
public class FundCategoryImpl implements FundCategoryDao{
	@Autowired
	private EntityManager entityManager;

	public List<FundCategory> allFund() {
		entityManager.getTransaction().begin();
		List<FundCategory> fundCategory = new ArrayList<FundCategory>();
		fundCategory = entityManager.createQuery("select e from FundCategory e").getResultList();
		entityManager.getTransaction().commit();
		return fundCategory;
	}

	
	public boolean addFund(FundCategory fundCategory) {
		entityManager.getTransaction().begin();
		entityManager.persist(fundCategory);
		entityManager.getTransaction().commit();
		return true;
	}


	public boolean updateFund(FundCategory fundCategory, int fundId) {
		entityManager.getTransaction().begin();
		entityManager.find(FundCategory.class, fundId);
		entityManager.merge(fundCategory);
		entityManager.getTransaction().commit();
		return true;
	}

	
	public boolean deleteFund(int fundId) {
		FundCategory fundCategory = null;
		entityManager.getTransaction().begin();
		fundCategory = entityManager.find(FundCategory.class, fundId);
		entityManager.remove(fundCategory);
		entityManager.getTransaction().commit();
		return true;
	}


	public FundCategory getFund(int fundId) {
		FundCategory fundCategory = null;
		entityManager.getTransaction().begin();
		fundCategory = entityManager.find(FundCategory.class, fundId);
		entityManager.getTransaction().commit();
        return fundCategory;
	}

}
