package com.grimaldi.sample.api;

import org.springframework.http.ResponseEntity;

import com.grimaldi.sample.model.Product;

public interface ProductApi {
	
	public default  ResponseEntity<Product> getProduct(){
		
		
		throw new UnsupportedOperationException();
	}

}
