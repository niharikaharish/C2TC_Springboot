package com.tns.ordermanagement;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderDetails 
{
   private int id;
   private LocalDateTime dateofpurchase;
   private float total;
   private Customer customer_id;
   private String paymentMode;
   private Shop shop_id;
   
   public OrderDetails(int id, LocalDateTime dateofpurchase, float total, Customer customer_id, String paymentMode,
		Shop shop_id) 
   {
	this.id = id;
	this.dateofpurchase = dateofpurchase;
	this.total = total;
	this.customer_id = customer_id;
	this.paymentMode = paymentMode;
	this.shop_id = shop_id;
   }
   public OrderDetails() 
   {
	super();
   }

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() 
	{
	return id;
	}
	public void setId(int id) 
	{
	this.id = id;
	}
	public LocalDateTime getDateofpurchase() 
	{
	return dateofpurchase;
	}
	public void setDateofpurchase(LocalDateTime dateofpurchase) 
	{
	this.dateofpurchase = dateofpurchase;
	}
	public float getTotal() 
	{
	return total;
	}
	public void setTotal(float total) 
	{
	this.total = total;
	}
	public Customer getCustomer_id() 
	{
	return customer_id;
	}
	public void setCustomer_id(Customer customer_id) 
	{
	this.customer_id = customer_id;
	}
	public String getPaymentMode() 
	{
	return paymentMode;
	}
	public void setPaymentMode(String paymentMode) 
	{
	this.paymentMode = paymentMode;
	}
	public Shop getShop_id() 
	{
	return shop_id;
	}
	public void setShop_id(Shop shop_id) 
	{
	this.shop_id = shop_id;
	}
@Override
	public String toString() 
	{
	return "OrderDetails [id=" + id + ", dateofpurchase=" + dateofpurchase + ", total=" + total + ", paymentMode="
			+ paymentMode + "]";
	}
	}
