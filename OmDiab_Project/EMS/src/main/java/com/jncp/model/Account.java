package com.jncp.model;

public class Account {

	private long accountNo;
	private String bankName;
	private String ifscCode;
	private String branch;

	/**
	 * 
	 * @return accountNo
	 */
	public long getAccountNo() {
		return accountNo;
	}

	/**
	 * 
	 * @param accountNo
	 */
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	/**
	 *  
	 * @return bankName
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * 
	 * @param bankName
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * 
	 * @return ifscCode
	 */
	public String getIfscCode() {
		return ifscCode;
	}

	/**
	 * 
	 * @param ifscCode
	 */
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	/**
	 * 
	 * @return branch
	 */
	public String getBranch() {
		return branch;
	}

	/**
	 * 
	 * @param branch
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", bankName=" + bankName
				+ ", ifscCode=" + ifscCode + ", branch=" + branch + "]";
	}

}
