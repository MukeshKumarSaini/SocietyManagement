package com.societymanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.societymanagement.DaoImpl.ExpenceMasterImpl;
import com.societymanagement.Entity.ExpenceMaster;
@RestController
@RequestMapping(value = "/expence")
public class ExpenceMasterController {

	
	
	@Autowired
	ExpenceMasterImpl expenceMasterImpl;
	
	@RequestMapping(value = "/addExpence", method = RequestMethod.POST)
	public boolean addExpence(@RequestBody ExpenceMaster expenceMaster) {
		 return expenceMasterImpl.addExpence(expenceMaster);
		}
	
	@RequestMapping(value = "/allExpence", method = RequestMethod.GET)
	public List<ExpenceMaster> allExpence()
	{
		return expenceMasterImpl.allExpence();
		
	}
	
	@RequestMapping(value = "/getExpence/{id}", method = RequestMethod.GET)
	public ExpenceMaster getCategory(@PathVariable("id") int expenceId) {
		return expenceMasterImpl.getExpence(expenceId);
	}
	@RequestMapping(value = "/updateExpence/{id}",method = RequestMethod.PUT)
	public boolean updateExpence(@RequestBody ExpenceMaster expenceMaster,@PathVariable("id") int expenceId)
	{
		return expenceMasterImpl.updateExpence(expenceMaster, expenceId) ;
		
	}
	@RequestMapping(value = "/deleteExpence/{id}",method = RequestMethod.GET)
	public boolean deleteExpence(@PathVariable("id") int expenceId) {
		return expenceMasterImpl.deleteExpence(expenceId);
		
	}

}
