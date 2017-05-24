package com.example.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.antlr.v4.runtime.misc.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.controller.reponse.category.Response_countProdoFCat;
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
		 HttpHeaders responseHeaders = new HttpHeaders();
		    responseHeaders.setContentType(MediaType.APPLICATION_JSON);
		Pair <String,Integer> pair = new Pair<>("Liczba kategori", responseCount);
		    
		return  ResponseEntity.accepted().body(responseCount);
			//	a(responseCount,responseHeaders,HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/countProductsOfCategory/{id}",
					method = RequestMethod.GET, 
					produces = "application/json")
	public Response_countProdoFCat getCountProductsoFCategory(@PathVariable("id") int id) {
		ArrayList<Response_countProdoFCat> responseList = categoryService.getCountProductsoFCategory();

		return new Response_countProdoFCat("MOTORYZACJA", 1, 56);
	}
	
	
}
