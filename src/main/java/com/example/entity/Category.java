package com.example.entity;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Category {

	public Category() { };

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String name;
	
	private Integer active;
	
	@OneToMany(mappedBy = "category")
	@JsonManagedReference
	private List<CategoryDetails> categoryDetails; 
	
	//private Category parentCategoryId;
	
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

	public List<CategoryDetails> getCategoryDetails() {
		return categoryDetails;
	}

	public void setCategoryDetails(List<CategoryDetails> categoryDetails) {
		this.categoryDetails = categoryDetails;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

}
