package com.tnsif.collegeservicd;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class College {
	@Id
	@Column(name="Cid")
	private int id;
	@Column(name="Cname")
	private String name;
	@Column(name="Caddress")
	private String address;
	@Column(name="Cdept")
	private String dept;
	@Column(name="mobileno")
	private int mobileno;
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(int id, String name, String address, String dept, int mobileno) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.dept = dept;
		this.mobileno = mobileno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", address=" + address + ", dept=" + dept + ", mobileno="
				+ mobileno + "]";
	}

}
