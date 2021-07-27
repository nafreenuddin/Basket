
package com.example.demo.entity;

import java.io.Serializable;
import java.util.Map;

//import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
//import javax.persistence.OneToOne;

@Entity

public class Basket implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String basket_Id;

	private String itemName;

	@OneToOne(mappedBy = "basket")
	private Customer customer;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Map<Integer, ElectronicProduct> productList;

	public Basket() {
		super();
		
	}

	@Override
	public String toString() {
		return "Basket [basket_Id=" + basket_Id + ", itemName=" + itemName + ", productList=" + productList + "]";
	}

	public String getBasket_Id() {
		return basket_Id;
	}

	public void setBasket_Id(String basket_Id) {
		this.basket_Id = basket_Id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Map<Integer, ElectronicProduct> getProductList() {
		return productList;
	}

	public void setProductList(Map<Integer, ElectronicProduct> productList) {
		this.productList = productList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
