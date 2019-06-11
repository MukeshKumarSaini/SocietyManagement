package com.societymanagement.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.societymanagement.DaoImpl.FacilityImpl;
import com.societymanagement.Entity.Facility;
import com.societymanagement.Entity.Facility;

@ContextConfiguration({ "persistenceconfig.xml" })
@SpringJUnitConfig(FacilityTest.class)
public class FacilityTest {

	@Autowired
	FacilityImpl facilityimpl;

	/*
	 * @Test public void add() { Facility facility = new Facility();
	 * facility.setFacilityId(1); facility.setFacilityName("electronic");
	 * facility.setFacilitatorName("ramesh"); facility.setContactNo(12345);
	 * facility.setAlternateNo(56789); facility.setAddress("dholpur");
	 * assertEquals(true, facilityimpl.addFacility(facility)); }
	 */

	/*
	 * @Test public void get() throws Exception { Facility facility = new
	 * Facility(); facility = facilityimpl.getFacility(1);
	 * assertEquals("electronic", facility.getFacilityName()); }
	 */

	/*
	 * @Test public void getAll() throws Exception { List<Facility> facility = new
	 * ArrayList<Facility>(); facility = facilityimpl.allFacility(); assertEquals(1,
	 * facility.size());
	 * 
	 * }
	 */

	/*
	 * @Test public void update() { Facility facility = new Facility(); facility =
	 * facilityimpl.getFacility(1); facility.setFacilitatorName("repair");
	 * facility.setAddress("jaipur"); assertEquals(true,
	 * facilityimpl.updateFacility(facility, 1));
	 * 
	 * }
	

	@Test
	public void delete() {

		facilityimpl.getFacility(1);
		assertEquals(true, facilityimpl.deleteFacility(1));
	}
 */
}
