//package com.example.demo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Component;
//
//
//@Component
//public class RegistrationDao {
////logic for database
//	
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//
//	public boolean createUser(Registration rg) {
//		String sql = "INSERT into registrationTable(firstName,middleName,lastName,emailID,password,dob,mobNo) VALUES(?,?,?,?,?,?,?)";
//		jdbcTemplate.update(sql, rg.getFirstName(), rg.getMiddleName(), rg.getLastName(), rg.getEmailID(),rg.getPassword(),rg.getDob(),rg.getMobNo());
//		return true;
//	}
//	
//}
