package com.societymanagement.Entity;

	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "SOCIETYMASTER")
	public class SocietyMaster {
		@Id
		private int societyId;
		private String societyName;
		private String societyAdd;
		private int societyFund;

		public int getSocietyId() {
			return societyId;
		}

		public void setSocietyId(int societyId) {
			this.societyId = societyId;
		}

		public String getSocietyName() {
			return societyName;
		}

		public void setSocietyName(String societyName) {
			this.societyName = societyName;
		}

		public String getSocietyAdd() {
			return societyAdd;
		}

		public void setSocietyAdd(String societyAdd) {
			this.societyAdd = societyAdd;
		}

		public int getSocietyFund() {
			return societyFund;
		}

		public void setSocietyFund(int societyFund) {
			this.societyFund = societyFund;
		}

		@Override
		public String toString() {
			return "SocietyMaster [societyId=" + societyId + ", societyName=" + societyName + ", societyAdd="
					+ societyAdd + ", societyFund=" + societyFund + "]";
		}
		
		

	}
