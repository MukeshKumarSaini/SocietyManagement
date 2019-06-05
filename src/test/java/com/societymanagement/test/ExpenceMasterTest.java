package com.societymanagement.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.societymanagement.DaoImpl.ExpenceMasterImpl;
import com.societymanagement.Entity.ExpenceMaster;

@ContextConfiguration({ "persistenceconfig.xml" })
@SpringJUnitConfig(ExpenceMasterTest.class)
public class ExpenceMasterTest {

	@Autowired
	ExpenceMasterImpl expenceMasterImpl;

	@Test
	public void add() throws Exception {
		ExpenceMaster expenceMaster = new ExpenceMaster();

		expenceMaster.setExpenceId(1);
		expenceMaster.setExpenceName("repair");
		expenceMaster.setExpenceAmmount(500);
		expenceMaster.setReguler("reguler");
		expenceMaster.setComment("basic expence");
		assertEquals(true, expenceMasterImpl.addExpence(expenceMaster));
	}

	/*
	 * @Test public void get() throws Exception { ExpenceMaster expenceMaster = new
	 * ExpenceMaster(); expenceMaster = expenceMasterImpl.getExpence(1);
	 * assertEquals("repair", expenceMaster.getExpenceName()); }
	 */
	/*
	 * @Test public void getAll() throws Exception { List<ExpenceMaster>
	 * expenceMaster = new ArrayList<ExpenceMaster>(); expenceMaster =
	 * expenceMasterImpl.allExpence(); assertEquals(1, expenceMaster.size());
	 * 
	 * }
	 */

	/*
	 * @Test public void update() throws Exception { ExpenceMaster expenceMaster =
	 * new ExpenceMaster(); expenceMaster = expenceMasterImpl.getExpence(1);
	 * expenceMaster.setExpenceName("rent");;
	 * expenceMaster.setExpenceAmmount(100000); expenceMaster.setReguler(false);
	 * assertEquals(true, expenceMasterImpl.updateExpence(expenceMaster ,1)); }
	 */

	/*
	 * @Test public void delete() throws Exception { ExpenceMaster expenceMaster =
	 * new ExpenceMaster(); expenceMaster = expenceMasterImpl.getExpence(1);
	 * assertEquals(true, expenceMasterImpl.deleteExpence(1));
	 * 
	 * }
	 */
}
