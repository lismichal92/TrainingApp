package com.example.controller.reponse.category;

public class Response_countProdoFCat {
	private String categorName;
	private int categoryId;
	private long productCount;

	public Response_countProdoFCat(String categorName, int categoryId, long productCount) {
		this.categorName = categorName;
		this.categoryId = categoryId;
		this.productCount = productCount;
	}

	@Override
	public String toString() {
		return "Response_countProdoFCat [categorName=" + categorName + ", categoryId=" + categoryId + ", productCount="
				+ productCount + "]";
	}

}