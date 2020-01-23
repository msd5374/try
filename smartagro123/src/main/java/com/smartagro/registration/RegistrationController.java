package com.smartagro.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smartagro.login.Loginpojo;

@RestController
@CrossOrigin
public class RegistrationController {

	@Autowired
	private RegistrationRepo regrepo;
	
	
	
	
	@PostMapping("/registration")
	public Status createRegistration(@RequestBody RegistrationPojo r) {
//	 System.out.println("in controller");
            regrepo.save(r);
		
		Status status = new Status();
		status.setStatusCode(123);
		status.setStatusMessage("Registration Successful!");
		return status;		
	}
	
	
	@PostMapping("/login")
	public Status LoginPage(@RequestBody RegistrationPojo login) {
		
	
		long count = regrepo.isValidUser(login.getEmailID(),login.getPassword());
		System.out.println(count);
		if(count == 0) {
			
			Status status = new Status();
			status.setStatusCode(222);
			status.setStatusMessage("Invalid Username/Password");
			return status;		
		}
		else {
			RegistrationPojo customer = regrepo.fetch(login.getEmailID());
			
			Status status = new Status();
			status.setStatusCode(333);
			status.setStatusMessage("Login Successful");
			status.setLoggedInCustomer(customer);
			return status;
		}
			
	}
	
	public static class Status {
		private int statusCode;
		private String statusMessage;
		private  RegistrationPojo loggedInCustomer;

		
		public RegistrationPojo getLoggedInCustomer() {
			return loggedInCustomer;
		}
		public void setLoggedInCustomer(RegistrationPojo loggedInCustomer) {
			this.loggedInCustomer = loggedInCustomer;
		}
		public int getStatusCode() {
			return statusCode;
		}
		public void setStatusCode(int statusCode) {
			this.statusCode = statusCode;
		}
		public String getStatusMessage() {
			return statusMessage;
		}
		public void setStatusMessage(String statusMessage) {
			this.statusMessage = statusMessage;
		}
		
		
	}
}
