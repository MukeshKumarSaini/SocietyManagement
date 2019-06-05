package com.societymanagement.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EXPENCEMASTER")
public class ExpenceMaster {
	@Id
	private int expenceId;
	private String expenceName;
	private int expenceAmmount;
	private String expenceType;
	private String comment;

	public int getExpenceId() {
		return expenceId;
	}

	public void setExpenceId(int expenceId) {
		this.expenceId = expenceId;
	}

	public String getExpenceName() {
		return expenceName;
	}

	public void setExpenceName(String expenceName) {
		this.expenceName = expenceName;
	}

	public int getExpenceAmmount() {
		return expenceAmmount;
	}

	public void setExpenceAmmount(int expenceAmmount) {
		this.expenceAmmount = expenceAmmount;
	}

	public String isReguler() {
		return expenceType;
	}

	public void setReguler(String expenceType) {
		this.expenceType = expenceType;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
