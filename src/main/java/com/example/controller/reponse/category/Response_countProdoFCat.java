package com.example.controller.reponse.category;

public class Response_countProdoFCat {
	private String categorName;
	private int categoryId;
	private int productCount;

	public Response_countProdoFCat(String categorName, int categoryId, int productCount) {
		this.categorName = categorName;
		this.categoryId = categoryId;
		this.productCount = productCount;
	}

}