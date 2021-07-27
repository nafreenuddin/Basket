package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.sun.istack.NotNull;

@Entity
public class ElectronicProduct {
	@Id
	private int code;
	
	@NotEmpty(message="Please enter Name ")
	private String name;
	
	@NotNull
	private double price;
	
	@NotNull
	@Pattern(regexp="^\\d{2}-\\d{2}-\\d{4}$",message="Please provide valid photo")
	private String image;
	
	@Pattern(regexp="^\\d{2}-\\d{2}-\\d{4}$",message="Provide Date in the format DD-MM-YYYY")
	private String createDate;

	public ElectronicProduct(int code, @NotEmpty(message = "Please enter Name ") String name, double price,
			@Pattern(regexp = "^\\d{2}-\\d{2}-\\d{4}$", message = "Please provide valid photo") String image,
			@Pattern(regexp = "^\\d{2}-\\d{2}-\\d{4}$", message = "Provide Date in the format DD-MM-YYYY") String createDate) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.image = image;
		this.createDate = createDate;
	}

	public ElectronicProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "ElectronicProduct [code=" + code + ", name=" + name + ", price=" + price + ", image=" + image
				+ ", createDate=" + createDate + "]";
	}
	


	
	
	
	
}
