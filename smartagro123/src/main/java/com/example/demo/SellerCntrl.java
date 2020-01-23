//package com.example.demo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//public class SellerCntrl {
//
//	@Autowired
//	SellerDao seller;
//	@GetMapping("/add")
//	public ModelAndView addProduct()
//	{
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("addproduct");
//		return mv;
//	
//	}
//	
//	
//	@PostMapping("/add")
//	public void addProduct(SellerPojo o)
//	{
//		
//		seller.add(o);
//		
//	}
//	
//	
//}
