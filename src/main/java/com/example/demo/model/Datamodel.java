package com.example.demo.model;


import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Datamodel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long customerid;

	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;

	public long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(long customerid) {
		this.customerid = customerid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Datamodel [customerid=" + customerid + ", name=" + name + ", address=" + address + "]";
	}

	public Datamodel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Datamodel(long customerid, String name, String address) {
		super();
		this.customerid = customerid;
		this.name = name;
		this.address = address;
	}

}
