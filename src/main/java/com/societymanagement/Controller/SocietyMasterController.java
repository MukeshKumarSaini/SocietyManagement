package com.societymanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.societymanagement.DaoImpl.SocietyMasterImpl;
import com.societymanagement.Entity.SocietyMaster;

@RestController
@RequestMapping(value = "/society")
public class SocietyMasterController {
	
	@Autowired
	SocietyMasterImpl societyMasterImpl;
	
	@RequestMapping(value = "/addSociety", method = RequestMethod.POST)
	public boolean addSociety(@RequestBody SocietyMaster society) {
		 return societyMasterImpl.addSociety(society);
		}
	
	@RequestMapping(value = "/allSociety", method = RequestMethod.GET)
	public List<SocietyMaster> allSociety()
	{
		return societyMasterImpl.allSociety();
		
	}
	
	@RequestMapping(value = "/getSociety/{id}", method = RequestMethod.GET)
	public SocietyMaster getCategory(@PathVariable("id") int societyId) {
		return societyMasterImpl.getSociety(societyId);
	}
	@RequestMapping(value = "/updateSociety/{id}",method = RequestMethod.PUT)
	public boolean updateSociety(@RequestBody SocietyMaster societyMaster,@PathVariable("id") int societyId)
	{
		return societyMasterImpl.updateSociety(societyMaster, societyId) ;
		
	}
	@RequestMapping(value = "/deleteSociety/{id}",method = RequestMethod.GET)
	public boolean deleteSociety(@PathVariable("id") int societyId) {
		return societyMasterImpl.deleteSociety(societyId);
		
	}

}
