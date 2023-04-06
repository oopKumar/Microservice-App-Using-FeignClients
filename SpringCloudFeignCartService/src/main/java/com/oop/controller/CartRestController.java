package com.oop.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oop.module.Cart;

@RestController
@RequestMapping("/cart")
public class CartRestController {
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/msg")
	public String getMsg() {
		return "FROM CART"+port;
	}
	
	@GetMapping("/data")
	public ResponseEntity<String> getData(){
		return new ResponseEntity<>("Hello",HttpStatus.OK);
	}
	
	@GetMapping("/obj/{code}")
	public Cart getCart(@PathVariable String code) {
		return new Cart(101,code,500.00);
	}
	
	@PostMapping("/insert")
	public ResponseEntity<String> createCart(@RequestBody Cart cart) {
		return ResponseEntity.ok(cart.toString());
	}
	
	

}
