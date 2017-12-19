package com.qbtrance.dj_rank.domain;

import java.io.Serializable;

public class Dj implements Serializable {
	
	private int djId;
	private String DjName; //AKA.
	private String fName;
	private String lName;
	private String genre; 
	private String country;
	private String website;
	private String email;
	
	public Dj(int djId, String djName, String fName, String lName, String genre, String country, String website, String email) 
	{
		super();
		this.djId = djId;
		DjName = djName;
		this.fName = fName;
		this.lName = lName;
		this.genre = genre;
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
		return DjName;
	}
	public void setDjName(String djName) {
		DjName = djName;
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
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
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
		return "Dj [djId=" + djId + ", DjName=" + DjName + ", fName=" + fName + ", lName=" + lName + ", genre=" + genre
				+ ", country=" + country + ", website=" + website + "]";
	}
	
}
