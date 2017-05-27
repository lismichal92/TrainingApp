package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.controller.reponse.category.Response_countProdoFCat;
import com.example.entity.Product;
import com.example.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryRestController {

	@Autowired
	public CategoryRestController(CategoryService categoryService) {
		super();
		this.categoryService = categoryService;
	}

	private CategoryService categoryService;

	@RequestMapping(value = "/count",
					method = RequestMethod.GET )
	public ResponseEntity<Integer> getCategoriesCount() {

		Integer responseCount = Optional.ofNullable(categoryService.getCountOfCategories())
				.orElse(0);
		return new ResponseEntity<>(responseCount,HttpStatus.OK);
			
	}
	
	@RequestMapping(value = "/countProductsOfCategory/",
			method = RequestMethod.GET, 
			produces = "application/json")
	public ResponseEntity<List<Response_countProdoFCat>> getCountProductsoFCategory() {
		
		List<Response_countProdoFCat> responseList = categoryService.getCountProductsoFALLCategory();
		ResponseEntity<List<Response_countProdoFCat>> reponse = new ResponseEntity<>(responseList, HttpStatus.OK);
		return reponse;
	}

	@RequestMapping(value = "/countProductsOfCategory/{id}", 
			method = RequestMethod.GET,
			produces = "application/json")
	public ResponseEntity<Response_countProdoFCat> getCountProductsoFCategory(
			@PathVariable("id") int id) {
		
		Response_countProdoFCat resp = categoryService.getCountProductsoFCategory(id);
		ResponseEntity<Response_countProdoFCat> reponse = new ResponseEntity<>(resp, HttpStatus.OK);
		return reponse;
	}
	
	
}
