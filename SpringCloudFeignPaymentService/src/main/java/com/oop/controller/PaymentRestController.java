package com.oop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oop.CartRestConsumer;
import com.oop.module.Cart;

@RestController
@RequestMapping("/pay")
public class PaymentRestController {
	@Autowired
	CartRestConsumer cartRestConsumer;
	
	@GetMapping("/msg")
	public String getPayMsg() {
		System.out.println("Interface Impl is:"+cartRestConsumer.getClass().getName());
		
		return "FROM PAYMENT--"+cartRestConsumer.findMsg();
	}
	
	@GetMapping("/obj")
	public String getCartObj() {
		return "From Pay"+cartRestConsumer.getCart("AA");
		
	}
	
	@PostMapping("/create")
	public String createCart() {
		return "From Pay"+cartRestConsumer.createCart(new Cart(101,"AA",444.44));
		
	}
	
	@GetMapping("/data")
	public ResponseEntity<String> getData(){
	
		return ResponseEntity.ok("From Pay"+cartRestConsumer.getData());
	}
	
	
}
