package com.tns.ordermanagement;

import org.springframework.beans.factory.annotation.Autowired;

import antlr.collections.List;

public class OrderService 
{
	@Autowired
	private OrderRepository repository;
	
	
	public List<OrderDetails> listAll() 
	{
		return repository.findAll();
	}


	public OrderDetails get(Integer id) 
	{
		return repository.findById(id).get();
	}
	
	public void save(OrderDetails orderdetails) 
	{
		repository.save(orderdetails);
	}


	public void delete(Integer id) 
	{
		repository.deleteById(id);
	}
	}
