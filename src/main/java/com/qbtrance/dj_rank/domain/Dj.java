package com.qbtrance.dj_rank.domain;

import java.io.Serializable;

public class Dj implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int djId;
	private String fName;
	private String lName;
	private String djName; //AKA.
	private String website;
	private String email;
	private String country;
	
	public Dj(int djId, String djName, String fName, String lName, String country, String website, String email) {
		super();
		this.djId = djId;
		this.djName = djName;
		this.fName = fName;
		this.lName = lName;
		this.country = country;
		this.website = website;
		this.email = email;
	}
	
	public int getDjId() {
		return djId;
	}
	public void setDjId(int djId) {
		this.djId = djId;
	}
	public String getDjName() {
		return djName;
	}
	public void setDjName(String djName) {
		this.djName = djName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Dj [djId=" + djId + ", DjName=" + djName + ", fName=" + fName + ", lName=" + lName + ", country=" + country + ", website=" + website + "]";
	}
	
}
