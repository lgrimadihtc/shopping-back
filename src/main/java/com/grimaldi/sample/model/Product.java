package com.grimaldi.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String title;
	private Double price;
	@Column(length = 2048)
	private String description;
	private String category;
	private String image;
	private Double ratingrate;	
	private Double ratingcount;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Double getRatingrate() {
		return ratingrate;
	}
	public void setRatingrate(Double ratingrate) {
		this.ratingrate = ratingrate;
	}
	public Double getRatingcount() {
		return ratingcount;
	}
	public void setRatingcount(Double ratingcount) {
		this.ratingcount = ratingcount;
	}
	public Product() {
		super();
	}
	
}
