package com.example.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Product {

	public Product() { };

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String name;
	
    @JsonFormat(pattern = "dd:MM:yyyy HH:mm:ss")
	private LocalDateTime creationDate;
	
	private Integer active;
	
	private  BigDecimal price;
	
	@OneToMany(mappedBy = "product")
	private List<ProductDetails> productDetails;
	

	public Product(String name,  BigDecimal price, String descripton, String city) {
		super();
		this.name = name;
		this.price = price;
		this.descripton = descripton;
		this.city = city;
	}

	private String descripton;
	
	private String city;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Category category;
	
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public  BigDecimal getPrice() {
		return price;
	}
	
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	public String getDescripton() {
		return descripton;
	}
	
	public void setDescripton(String descripton) {
		this.descripton = descripton;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}
	
	public List<ProductDetails> getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(List<ProductDetails> productDetails) {
		this.productDetails = productDetails;
	}
}
