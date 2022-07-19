package com.grimaldi.sample.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grimaldi.sample.model.Product;
import com.grimaldi.sample.service.ProductService;
@CrossOrigin
@RestController
public class ProductApiImpl  implements ProductApi

{
	
	@Autowired
	private ProductService productService;
	
    @GetMapping("product")
	public List<Product> find() {

	
        
	    return this.productService.getProducts();
	}

}