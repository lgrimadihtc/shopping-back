package com.grimaldi.sample.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.grimaldi.sample.model.Product;
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "product", path = "product",exported = false )
public interface ProdutRepository  extends CrudRepository<Product, Long> {
	

	List <Product>  findAll();
}
