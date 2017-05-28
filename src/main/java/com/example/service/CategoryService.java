package com.example.service;

import java.util.List;

import com.example.controller.reponse.category.Response_countProdoFCat;

public interface CategoryService {

	int getCountOfCategories();
	
	Response_countProdoFCat getCountProductsoFCategory(int id);

	List<Response_countProdoFCat> getCountProductsoFALLCategory();
	
}
