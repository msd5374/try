//package com.example.demo;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//@Repository
//public class SellerDao 
//{
//	
//	@PersistenceContext
//
//	public EntityManager entitymanager;
//	@Transactional
//	public void add(SellerPojo song) {
//		System.out.println(song);
//		//During this step, META-INF/persistence.xml file will be read
//		entitymanager.merge(song);
//		//entitymanager.flush();
//	
//	}
//}
//
