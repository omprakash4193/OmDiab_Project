package com.jncp.model;

import java.util.Date;

public class Employee {

	private int empId;
	private String fisrtName;
	private String middleName;
	private String lastName;
	private Date doj;
	private Address address;
	private Account account;
	private Department department;

	/**
	 * 
	 * @return empId
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * 
	 * @param empId
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * 
	 * @return fisrtName
	 */
	public String getFisrtName() {
		return fisrtName;
	}

	/**
	 * 
	 * @param fisrtName
	 */
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}

	/**
	 * 
	 * @return middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * 
	 * @param middleName
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * 
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * 
	 * @return doj
	 */
	public Date getDoj() {
		return doj;
	}

	/**
	 * 
	 * @param doj
	 */
	public void setDoj(Date doj) {
		this.doj = doj;
	}

	/**
	 * 
	 * @return address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * 
	 * @param address
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * 
	 * @return account
	 */
	public Account getAccount() {
		return account;
	}

	/**
	 * 
	 * @param account
	 */
	public void setAccount(Account account) {
		this.account = account;
	}

	/**
	 * 
	 * @return department
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * 
	 * @param department
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fisrtName=" + fisrtName
				+ ", middleName=" + middleName + ", lastName=" + lastName
				+ ", doj=" + doj + ", address=" + address + ", account="
				+ account + ", department=" + department + "]";
	}

}
