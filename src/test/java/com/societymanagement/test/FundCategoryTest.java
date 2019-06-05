package com.societymanagement.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.societymanagement.DaoImpl.FundCategoryImpl;
import com.societymanagement.Entity.FundCategory;

@ContextConfiguration({ "persistenceconfig.xml" })
@SpringJUnitConfig(FundCategoryTest.class)
public class FundCategoryTest {

	@Autowired
	FundCategoryImpl fundCategoryImpl;

	/*
	 * @Test public void add() { FundCategory fundCategory = new FundCategory();
	 * fundCategory.setFundId(1);; fundCategory.setFundName("repair");;
	 * fundCategory.setFundAmmount(10000);; fundCategory.setReguler(true);
	 * fundCategory.setComment("hhhhh"); assertEquals(true,
	 * fundCategoryImpl.addFund(fundCategory)); }
	 */

	/*
	 * @Test public void get() throws Exception { FundCategory fundCategory = new
	 * FundCategory(); fundCategory = fundCategoryImpl.getFund(1);
	 * assertEquals("repair", fundCategory.getFundName()); }
	 */

	/*
	 * @Test public void getAll() throws Exception { List<FundCategory> fundCategory
	 * = new ArrayList<FundCategory>(); fundCategory = fundCategoryImpl.allFund();
	 * assertEquals(1, fundCategory.size());
	 * 
	 * }
	 */

	/*
	 * @Test public void update() { FundCategory fundCategory = new FundCategory();
	 * fundCategory = fundCategoryImpl.getFund(1);
	 * fundCategory.setFundName("repair"); fundCategory.setFundAmmount(20000);
	 * assertEquals(true, fundCategoryImpl.updateFund(fundCategory, 1));
	 * 
	 * }
	 */

	@Test
	public void delete() {

		fundCategoryImpl.getFund(1);
		assertEquals(true, fundCategoryImpl.deleteFund(1));
	}

}
