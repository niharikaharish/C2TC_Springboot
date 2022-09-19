package com.tns.ordermanagement;

import java.security.Provider.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

@RestController
public class OrderController 
{
	@Autowired
	private OrderService service;
	
	//Retrieve All the rows from Database
	@GetMapping("/order")
	public List<OrderDetails> list()
	{
		return service.listAll();
	}
	
	//Retrieve Specific Records from database
	@GetMapping("/order/{id}")
	public ResponseEntity<OrderDetails> get (@PathVariable Integer id)
	{
		OrderDetails orderdetails=service.get(id);
		return new ResponseEntity<OrderDetails>(orderdetails, HttpStatus.OK);
	}

	//CREATE a row in database
@PostMapping("/Orders")
public void add(@RequestBody OrderDetails orderdetails)
{
	service.save(orderdetails);
}

	//Update Operation-record in database
	@PutMapping("/orders/{id}")
	public ResponseEntity<?> update(@RequestBody OrderDetails orderdetails,@PathVariable Integer id)
	{
		try 
		{
			OrderDetails existOrderDetails=service.get(id);
			service.save(orderdetails);
			return new ResponseEntity<OrderDetails>(orderdetails, HttpStatus.OK);
		} 
		catch (Exception e) 
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	// Delete OPeration
	@DeleteMapping("/orders/{id}")
	public void delete(@PathVariable Integer id)
	{
		service.delete(id);
	}
}