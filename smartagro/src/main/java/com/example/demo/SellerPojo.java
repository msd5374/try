//package com.example.demo;
//
////import java.io.Serializable;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Table;
//
//import org.springframework.data.annotation.Id;
//@Entity
//@Table(name="SELLER")
//public class SellerPojo {
//
//	
//	
//	//private String emailID;
//	
//	@Id
//	@GeneratedValue
//	private int srno;
//	private int quantity;
//	private int price;
//	
//	private String fooditeam;
//	
//	
//	public int getQuantity() {
//		return quantity;
//	}
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//	public int getPrice() {
//		return price;
//	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
//	public String getFooditeam() {
//		return fooditeam;
//	}
//	public void setFooditeam(String fooditeam) {
//		this.fooditeam = fooditeam;
//	}
//	public SellerPojo() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public SellerPojo(int quantity, int price, String fooditeam) {
//		super();
//		this.quantity = quantity;
//		this.price = price;
//		this.fooditeam = fooditeam;
//	}
//	@Override
//	public String toString() {
//		return "SellerPojo [quantity=" + quantity + ", price=" + price + ", fooditeam=" + fooditeam + "]";
//	}
//	
//	
//}
