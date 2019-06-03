package com.societymanagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.societymanagement.DaoImpl.FundCategoryImpl;
import com.societymanagement.DaoImpl.FundCategoryImpl;
import com.societymanagement.Entity.FundCategory;

@RestController
@RequestMapping(value = "/fundcategory")
public class FundCategoryController {

	@Autowired
	FundCategoryImpl fundCategoryImpl;

	@RequestMapping(value = "/addFund", method = RequestMethod.POST)
	public boolean addFund(@RequestBody FundCategory fundCategory) {
		return fundCategoryImpl.addFund(fundCategory);
	}

	@RequestMapping(value = "/allFund", method = RequestMethod.GET)
	public List<FundCategory> allFund() {
		return fundCategoryImpl.allFund();

	}

	@RequestMapping(value = "/getFund/{id}", method = RequestMethod.GET)
	public FundCategory getCategory(@PathVariable("id") int fundId) {
		return fundCategoryImpl.getFund(fundId);
	}

	@RequestMapping(value = "/updateFund/{id}", method = RequestMethod.PUT)
	public boolean updateFund(@RequestBody FundCategory fundCategory, @PathVariable("id") int fundId) {
		return fundCategoryImpl.updateFund(fundCategory, fundId);

	}

	@RequestMapping(value = "/deleteFund/{id}", method = RequestMethod.GET)
	public boolean deleteFund(@PathVariable("id") int fundId) {
		return fundCategoryImpl.deleteFund(fundId);

	}

}
