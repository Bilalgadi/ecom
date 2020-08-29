package com.e.ecom;

public class CategoryModel {

    private String CategoryIconLink, categoryName;

    public CategoryModel(String categoryIconLink, String categoryName) {
        CategoryIconLink = categoryIconLink;
        this.categoryName = categoryName;
    }

    public String getCategoryIconLink() {
        return CategoryIconLink;
    }

    public void setCategoryIconLink(String categoryIconLink) {
        CategoryIconLink = categoryIconLink;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
