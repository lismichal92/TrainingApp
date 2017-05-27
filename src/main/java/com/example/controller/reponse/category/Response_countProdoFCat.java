package com.example.controller.reponse.category;

public class Response_countProdoFCat {
	public String categorName;
	public int categoryId;
	public long productCount;

	public String getCategorName() {
		return categorName;
	}

	public void setCategorName(String categorName) {
		this.categorName = categorName;
	}

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