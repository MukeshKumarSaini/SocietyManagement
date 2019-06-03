package com.societymanagement.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FUNDCATEGORY")
public class FundCategory {
	
	@Id
	private int fundId; 
	private String fundName;
	private int fundAmmount;
	private boolean isReguler;
	private String comment;
	public int getFundId() {
		return fundId;
	}
	public void setFundId(int fundId) {
		this.fundId = fundId;
	}
	public String getFundName() {
		return fundName;
	}
	public void setFundName(String fundName) {
		this.fundName = fundName;
	}
	
	
	public int getFundAmmount() {
		return fundAmmount;
	}
	public void setFundAmmount(int fundAmmount) {
		this.fundAmmount = fundAmmount;
	}
	public boolean isReguler() {
		return isReguler;
	}
	public void setReguler(boolean isReguler) {
		this.isReguler = isReguler;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	

}
