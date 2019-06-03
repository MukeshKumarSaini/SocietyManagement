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
	private boolean isReguler;
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
