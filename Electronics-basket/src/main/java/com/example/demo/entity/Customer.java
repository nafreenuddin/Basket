package com.example.demo.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
//import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
//import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;

	private String customerName;

	@Email
	private String customerEmail;

	@Size(min = 10, max = 10)
	private String customerPhone;

	@OneToOne
	private Adress customerAddress;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ElectronicProduct> productList;
  
	@OneToOne
	@JoinColumn(name = "cust")
	private Basket basket;
 
	public Customer() {
		super();
		
	}

	public Customer(int customerId, String customerName, @Email String customerEmail,
			@Size(min = 10, max = 10) String customerPhone, Adress customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPhone = customerPhone;
		this.customerAddress = customerAddress;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", customerPhone=" + customerPhone + ", customerAddress=" + customerAddress + "]";
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public Adress getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(Adress customerAddress) {
		this.customerAddress = customerAddress;
	}

}
