package com.example.service;

import java.util.ArrayList;

import com.example.controller.reponse.category.Response_countProdoFCat;

public interface CategoryService {

	public int getCountOfCategories();
	
	public ArrayList<Response_countProdoFCat> getCountProductsoFCategory();
	
}
