package com.smartagro.registration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public class RegistrationRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void save( RegistrationPojo reg) {
		
		//System.out.println("save calledd");
		entityManager.merge(reg);  //add or update
		
		
	}
	
	public RegistrationPojo fetch(String email) {
		return (RegistrationPojo)
				entityManager
				.createQuery("select c from RegistrationPojo c where c.emailID = :em")
				.setParameter("em", email)
				.getSingleResult();
	}
	
	public long isValidUser(String email, String password) {
		return (Long) 
				entityManager
				.createQuery("select count(c) from RegistrationPojo  c where c.emailID = :em and c.password = :pwd")
				.setParameter("em", email)
				.setParameter("pwd", password)
				.getSingleResult();
	}
	
}
