package com.societymanagement.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.societymanagement.DaoImpl.FlatMasterImpl;
import com.societymanagement.Entity.FlatMaster;

@ContextConfiguration({ "persistenceconfig.xml" })
@SpringJUnitConfig(FlatMasterTest.class)
public class FlatMasterTest {

	@Autowired
	FlatMasterImpl flatMasterImpl;

	/*
	 * @Test public void add() throws Exception { FlatMaster flatMaster = new
	 * FlatMaster();
	 * 
	 * flatMaster.setFlatId(1); flatMaster.setBlockNo(1);;
	 * flatMaster.setOwnerName("deepak");
	 * flatMaster.setOwnerEmail("deepak@gmail.com"); flatMaster.setOwnerNo(456123);
	 * assertEquals(true, flatMasterImpl.addFlat(flatMaster)); }
	 */

	/*
	 * @Test public void get() throws Exception { FlatMaster flatMaster = new
	 * FlatMaster(); flatMaster = flatMasterImpl.getFlat(1); assertEquals(1,
	 * flatMaster.getBlockNo()); }
	 */

	/*
	 * @Test public void getAll() throws Exception { List<FlatMaster> flatMaster =
	 * new ArrayList<FlatMaster>(); flatMaster = flatMasterImpl.allFlat();
	 * assertEquals(1, flatMaster.size());
	 * 
	 * }
	 */

	/*
	 * @Test public void update() throws Exception { FlatMaster flatMaster = new
	 * FlatMaster(); flatMaster = flatMasterImpl.getFlat(1);
	 * flatMaster.setBlockNo(2);; ; flatMaster.setOwnerName("mukesh");
	 * flatMaster.setOwnerEmail("mukesh@gmail.com"); assertEquals(true,
	 * flatMasterImpl.updateFlat(flatMaster, 1)); }
	 */

	@Test
	public void delete() throws Exception {

		flatMasterImpl.getFlat(1);
		assertEquals(true, flatMasterImpl.deleteFlat(1));

	}

}
