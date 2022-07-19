package com.grimaldi.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grimaldi.sample.model.Product;
import com.grimaldi.sample.repository.ProdutRepository;
@Service
public class ProductServiceImpl implements ProductService{

     @Autowired
	private ProdutRepository produtRepository;
	@Override
	public List<Product> getProducts() {

		return this.produtRepository.findAll();
	}

}
