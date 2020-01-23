package com.smartagro.registration;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="registrationtable")
public class RegistrationPojo {
	
	@Id
	private String emailID;
	
	private String firstName;
	private String middleName;
	private String lastName;
    private String password;
	private String dob;
    private String mobNo;
    private String address;
    private String ifscCode;
    private String accountNo;
    
    
    
	@Override
	public String toString() {
		return "RegistrationPojo [emailID=" + emailID + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", password=" + password + ", dob=" + dob + ", mobNo=" + mobNo
				+ ", address=" + address + ", ifscCode=" + ifscCode + ", accountNo=" + accountNo + "]";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
    
    
}
