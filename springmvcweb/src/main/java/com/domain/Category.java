package com.domain;

import java.util.List;

public class Category {
	
	private String name;
	private List<ApiDetails> apiDetails;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<ApiDetails> getApiDetails() {
		return apiDetails;
	}
	public void setApiDetails(List<ApiDetails> apiDetails) {
		this.apiDetails = apiDetails;
	}
	@Override
	public String toString() {
		return "Category [name=" + name + ", apiDetails=" + apiDetails + "]";
	}
}
