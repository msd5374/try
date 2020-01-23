//package com.example.demo;
//
//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//
//
////@Controller
//public class SpringRegistrationController {
////mapping
//	
//	
//	
//	@Autowired
//	private RegistrationDao reg1;
//	
//	@GetMapping("/RegistrationPage")
//	 public ModelAndView register()
//	 {
//		
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("RegistrationPage");
//		return mv;
//	   
//	 }
//
//	@PostMapping("/RegistrationPage")
//	 public ModelAndView register(Registration register)
//	 {
//		this.reg1.createUser(register);
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("RegistrationPage");
//		return mv;
//	   
//	 }
//	
//}
