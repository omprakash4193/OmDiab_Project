package com.jncp.model;

public class Address {

	private String address;
	private String state;
	private String city;
	private String country;
	private String pinCode;
	private String mobileNo;
	private String email;

	/**
	 * 
	 * @return
	 */
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + ", state=" + state + ", city="
				+ city + ", country=" + country + ", pinCode=" + pinCode
				+ ", mobileNo=" + mobileNo + ", email=" + email + "]";
	}
}
