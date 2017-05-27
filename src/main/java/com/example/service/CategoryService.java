package com.example.service;

import java.util.List;

import com.example.controller.reponse.category.Response_countProdoFCat;

public interface CategoryService {

	public int getCountOfCategories();
	
	public Response_countProdoFCat getCountProductsoFCategory(int id);

	public List<Response_countProdoFCat> getCountProductsoFALLCategory();
	
}
