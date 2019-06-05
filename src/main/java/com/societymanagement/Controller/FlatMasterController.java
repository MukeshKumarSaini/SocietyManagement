package com.societymanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.societymanagement.DaoImpl.FlatMasterImpl;
import com.societymanagement.Entity.FlatMaster;

@RestController
@RequestMapping(value = "/flat")
public class FlatMasterController {
	

	@Autowired
	FlatMasterImpl flatMasterImpl;
	
	@RequestMapping(value = "/addFlat", method = RequestMethod.POST)
	public boolean addFlat(@RequestBody FlatMaster flatMaster) {
		 return flatMasterImpl.addFlat(flatMaster);
		}
	
	@RequestMapping(value = "/allFlat", method = RequestMethod.GET)
	public List<FlatMaster> allFlat()
	{
		return flatMasterImpl.allFlat();
		
	}
	
	@RequestMapping(value = "/getFlat/{id}", method = RequestMethod.GET)
	public FlatMaster getCategory(@PathVariable("id") int flatId) {
		return flatMasterImpl.getFlat(flatId);
	}
	@RequestMapping(value = "/updateFlat/{id}",method = RequestMethod.PUT)
	public boolean updateFlat(@RequestBody FlatMaster flatMaster,@PathVariable("id") int flatId)
	{
		return flatMasterImpl.updateFlat(flatMaster, flatId) ;
		
	}
	@RequestMapping(value = "/deleteFlat/{id}",method = RequestMethod.GET)
	public boolean deleteFlat(@PathVariable("id") int flatId) {
		return flatMasterImpl.deleteFlat(flatId);
		
	}


}
