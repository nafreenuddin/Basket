package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import com.sun.istack.NotNull;

@Entity
public class Adress {
	@Id
	private int aId;

	@NotNull
	private String adLineOne;

	@NotNull
	private String adLineTwo;

	@NotNull
	private String city;

	@NotNull
	private String state;

	@NotNull
	private String country;

	@NotNull
	@Size(min = 6, max = 6)
	private String postalCode;

	public Adress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Adress(int aId, String adLineOne, String adLineTwo, String city, String state, String country,
			@Size(min = 6, max = 6) String postalCode) {
		super();
		this.aId = aId;
		this.adLineOne = adLineOne;
		this.adLineTwo = adLineTwo;
		this.city = city;
		this.state = state;
		this.country = country;
		this.postalCode = postalCode;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getAdLineOne() {
		return adLineOne;
	}

	public void setAdLineOne(String adLineOne) {
		this.adLineOne = adLineOne;
	}

	public String getAdLineTwo() {
		return adLineTwo;
	}

	public void setAdLineTwo(String adLineTwo) {
		this.adLineTwo = adLineTwo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "Adress [aId=" + aId + ", adLineOne=" + adLineOne + ", adLineTwo=" + adLineTwo + ", city=" + city
				+ ", state=" + state + ", country=" + country + ", postalCode=" + postalCode + "]";
	}

}
