package com.example.controller.reponse.category;

public class Response_countProdoFCat {
	public String categoryName;
	public int categoryId;
	public long productCount;


	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public long getProductCount() {
		return productCount;
	}

	public void setProductCount(long productCount) {
		this.productCount = productCount;
	}

	public Response_countProdoFCat(String categoryName, int categoryId, long productCount) {
		this.categoryName = categoryName;
		this.categoryId = categoryId;
		this.productCount = productCount;
	}

	@Override
	public String toString() {
		return "Response_countProdoFCat [categoryName=" + categoryName + ", categoryId=" + categoryId + ", productCount="
				+ productCount + "]";
	}

}