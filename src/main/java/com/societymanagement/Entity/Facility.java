package com.societymanagement.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Facility")
public class Facility {
	@Id
	private int facilityId;
	private String facilityName;
	private String facilitatorName;
	private int contactNo;
	private int alternateNo;
	private String address;
	public int getFacilityId() {
		return facilityId;
	}
	public void setFacilityId(int facilityId) {
		this.facilityId = facilityId;
	}
	public String getFacilityName() {
		return facilityName;
	}
	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}
	public String getFacilitatorName() {
		return facilitatorName;
	}
	public void setFacilitatorName(String facilitatorName) {
		this.facilitatorName = facilitatorName;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public int getAlternateNo() {
		return alternateNo;
	}
	public void setAlternateNo(int alternateNo) {
		this.alternateNo = alternateNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
