package com.societymanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.societymanagement.DaoImpl.FacilityImpl;
import com.societymanagement.Entity.Facility;

@RestController
@RequestMapping(value = "/facility")
public class FacilityController {

	
	@Autowired
	FacilityImpl facilityImpl;

	@RequestMapping(value = "/addFacility", method = RequestMethod.POST)
	public boolean addFacility(@RequestBody Facility facility) {
		return facilityImpl.addFacility(facility);
	}

	@RequestMapping(value = "/allFacility", method = RequestMethod.GET)
	public List<Facility> allFacility() {
		return facilityImpl.allFacility();

	}

	@RequestMapping(value = "/getFacility/{id}", method = RequestMethod.GET)
	public Facility getCategory(@PathVariable("id") int facilityId) {
		return facilityImpl.getFacility(facilityId);
	}

	@RequestMapping(value = "/updateFacility/{id}", method = RequestMethod.PUT)
	public boolean updateFacility(@RequestBody Facility facility,@PathVariable("id") int facilityId) {
		return facilityImpl.updateFacility(facility, facilityId);

	}

	@RequestMapping(value = "/deleteFacility/{id}", method = RequestMethod.GET)
	public boolean deleteFacility(@PathVariable("id") int facilityId) {
		return facilityImpl.deleteFacility(facilityId);

	}

}
