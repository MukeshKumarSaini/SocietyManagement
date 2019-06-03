package com.societymanagement.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.societymanagement.DaoImpl.SocietyMasterImpl;
import com.societymanagement.Entity.SocietyMaster;

@ContextConfiguration({ "persistenceconfig.xml" })
@SpringJUnitConfig(SocietyMasterTest.class)
public class SocietyMasterTest {

	@Autowired
	private SocietyMasterImpl societymaster;

	

	/*
	 * @Test public void add() throws Exception { Society society = new Society();
	 * 
	 * society.setSocietyId(2); society.setSocietyName("radha vihar");
	 * society.setSocietyAdd("jaipur"); society.setSocietyFund(200);
	 * assertEquals(true, societymaster.addSociety(society)); }
	 */

	/*
	 * @Test public void get() throws Exception { Society society = new Society();
	 * society = societymaster.getSociety(2); assertEquals("radha vihar",
	 * society.getSocietyName()); }
	 */
	/*@Test
	public void getAll() throws Exception {
		List<SocietyMaster> society = new ArrayList<SocietyMaster>();
		society = societymaster.allSociety();
		assertEquals(1, society.size());

	}*/
	/*
	 * @Test public void update() throws Exception { Society society = new
	 * Society(); society = societymaster.getSociety(1);
	 * society.setSocietyName("gandhinagar"); society.setSocietyAdd("alwar");
	 * society.setSocietyFund(100); assertEquals(true,
	 * societymaster.updateSociety(society,1));societymaster.updateSociety(society,1
	 * ); }
	 */

	/*
	 * @Test public void delete() throws Exception { Society society = new
	 * Society(); society = societymaster.getSociety(1); assertEquals(true,
	 * societymaster.deleteSociety(1));
	 */

}
