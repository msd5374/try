//package com.example.demo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//public class LoginRepo2 {
//
//// @Autowired
//// private RegistrationDao userDao;
////
////
////@GetMapping("/registration")
////public ModelAndView register()
////{
////
////ModelAndView mv=new ModelAndView();
////mv.setViewName("registration");
////return mv;
//// 
////}
////
////@PostMapping("/registration")
////public ModelAndView register(Registration user)
////{
////this.userDao.createUser(user);
////ModelAndView mv=new ModelAndView();
////mv.setViewName("login");
////return mv;
//// 
////}
////
////@GetMapping("/login")
////public ModelAndView loginPage()
////{
////ModelAndView mv=new ModelAndView();
////mv.setViewName("login");
////return mv;
////}
////
////@PostMapping("/login")
////public ModelAndView validateUser(Registration user)
////{
////ModelAndView mv=new ModelAndView();
////
////try
////{
////	boolean auth=this.userDao.validUser(user);
////	if(auth==true)
////	{
////	mv.setViewName("home");
////	return mv;
////	}
////	else
////	{
////	mv.setViewName("registration");
////	return mv;
////	}
////}
////catch(Exception e)
////{
////	mv.setViewName("registration");
////	return mv;
////}
////
////
////
////}
////
//	
//	@Autowired
//	public SellerDao seller;
//	@GetMapping("/addproduct")
//	public ModelAndView addProduct()
//	{
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("addproduct");
//		return mv;
//	
//	}
//	
//	
//	@PostMapping("/addproduct")
//	public String addProduct(SellerPojo o)
//	{
//		
//		seller.add(o);
//		return "addproduct";
//		
//	}
//}
